package by.domus.app.model.beans.impl.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    private Integer reserve;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = true)
//    @JoinColumn(name = "product_id")
    private Product product;

    @Override
    public String toString() {
        return "Storage{" +
                "id=" + id +
                ", amount=" + amount +
                ", rejected=" + rejected +
                ", inStock=" + inStock +
                ", reserve=" + reserve +
                '}';
    }
}
