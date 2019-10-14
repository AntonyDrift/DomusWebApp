package by.domus.app.model.beans.impl.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "price")
public class Price {
    @Id
    @GeneratedValue
    private Long id;

    private BigDecimal costPrice;
    private BigDecimal retail;
    private BigDecimal wholesale;
    private BigDecimal dealer;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
