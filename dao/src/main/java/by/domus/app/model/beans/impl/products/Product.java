package by.domus.app.model.beans.impl.products;

import by.domus.app.model.beans.impl.orders.Basket;
import by.domus.app.model.beans.impl.orders.BasketItem;
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
    private String name;


    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Storage storage;
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Price price;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "basket_item_id")
    private BasketItem basketItem;
}
