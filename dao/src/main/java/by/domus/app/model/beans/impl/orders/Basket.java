package by.domus.app.model.beans.impl.orders;

import by.domus.app.model.beans.impl.products.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Basket {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;
    @OneToOne(mappedBy = "basket")
    private Product product;
    private Integer amount;

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", order=" + order.toString() +
                ", product=" + product.toString() +
                ", amount=" + amount +
                '}';
    }
}
