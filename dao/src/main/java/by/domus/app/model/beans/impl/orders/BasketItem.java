package by.domus.app.model.beans.impl.orders;

import by.domus.app.model.beans.impl.products.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "basket_item")
public class BasketItem {
    @Id
    @GeneratedValue
    private Long id;
    private Integer amount;

    @OneToOne(mappedBy = "basketItem",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private  Product product;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "basket_id")
    private Basket basket;

    @Override
    public String toString() {
        return "BasketItem{" +
                "id=" + id +
                ", product=" + product.getName() +
                ", amount=" + amount +
                '}';
    }
}
