package by.domus.app.model.beans.impl.orders;

import by.domus.app.model.beans.impl.products.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "basket")
public class Basket {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
    @OneToMany(mappedBy = "basket", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<BasketItem> basketItemList;
    private Timestamp startDate;

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", basketItemList=" + basketItemList +
                '}';
    }
}
