package sp25.swp391.se1809.group4.bookstore.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "book")
public class BookDTO {
    //Define fields for book class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bookid")
    private Integer bookID;
    @Column(name = "booktitle")
    private String bookTitle;
    @Column(name = "author")
    private String author;
    @Column(name = "translator")
    private String translator;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "publicationyear")
    private Integer publicationYear;
    @Column(name = "isbn")
    private String isbn;
    @Lob
    @Column(name = "image")
    private String image;
    @Lob
    @Column(name = "bookdescription")
    private String bookDescription;
    @Column(name = "hardcover")
    private Integer hardcover;
    @Column(name = "dimension")
    private String dimension;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "weight")
    private Double weight;
    @Column(name = "bookprice")
    private BigDecimal bookPrice;
    @Column(name = "bookquantity")
    private Integer bookQuantity;
    @Column(name = "bookstatus")
    private Integer bookStatus;
    @OneToMany(mappedBy = "bookID")
    private Collection<OrderDetailDTO> orderDetailCollection;
    @OneToMany(mappedBy = "bookID")
    private Collection<ImportStockDetailDTO> importStockDetailCollection;
    @JoinColumn(name = "catid", referencedColumnName = "catid")
    @ManyToOne
    private CategoryDTO catID;



}