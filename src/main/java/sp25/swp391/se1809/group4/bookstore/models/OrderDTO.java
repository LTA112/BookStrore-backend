
package sp25.swp391.se1809.group4.bookstore.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "`order`")
public class OrderDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "orderid")
    private Integer orderID;
    @Column(name = "orderdate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Column(name = "orderstatus")
    private Integer orderStatus;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    private AccountDTO username;
    @JoinColumn(name = "proid", referencedColumnName = "proid")
    @ManyToOne
    private PromotionDTO proID;
    @JoinColumn(name = "staffid", referencedColumnName = "staffid")
    @ManyToOne
    private StaffDTO staffID;
    @OneToMany(mappedBy = "orderID")
    private Collection<OrderDetailDTO> orderDetailCollection;

}
