package sp25.swp391.se1809.group4.bookstore.controllers;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "account")
public class AccountDTO {
    //Define fields for account class
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "password")
    private String password;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "role")
    private Integer role;
    @Column(name = "address")
    private String address;
    @Column(name = "sex")
    private Integer sex;
    @Column(name = "accstatus")
    private Integer accStatus;
    @OneToMany(mappedBy = "username")
    private Collection<OrderDTO> orderDTOCollection;
    @OneToMany(mappedBy = "username")
    private Collection<StaffDTO> staffDTOCollection;

}