package by.domus.app.model.beans.impl.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//quantity and condition
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "storage")
public class Storage {
    @Id
    @GeneratedValue
    private Long id;
    private Integer amount;
    private Integer rejected;
    private Integer inStock;

    @OneToOne(mappedBy = "storage")
    private Reserve reserve;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;



}
