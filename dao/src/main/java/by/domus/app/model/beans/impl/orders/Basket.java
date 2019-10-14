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
@Entity(name = "basket")
public class Basket {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @OneToMany(mappedBy = "basket")
    private List<BasketItem> basketItemList;
}
