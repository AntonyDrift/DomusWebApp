package by.domus.app.model.beans.impl.orders;

import by.domus.app.model.beans.impl.products.Product;
import by.domus.app.model.beans.impl.partners.Partner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Partner partner;
    //maybe orphan remove true
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Basket basket;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", partner=" + partner.getName() +
                ", basket=" + basket.toString() +
                '}';
    }
}
