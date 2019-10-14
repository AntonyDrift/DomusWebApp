package by.domus.app.model.beans.impl.products;

import by.domus.app.model.beans.impl.orders.Basket;
import by.domus.app.model.beans.impl.orders.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
//    private String article;
    private String name;
//    private String fullName;
    private Long priceId;
//    private Long storageId;
    @OneToOne
    @JoinColumn(name = "basket_id")
    private Basket basket;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priceId=" + priceId +
                ", basket=" + basket.toString() +
                '}';
    }
}
