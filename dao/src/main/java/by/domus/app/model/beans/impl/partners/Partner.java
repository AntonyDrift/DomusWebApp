package by.domus.app.model.beans.impl.partners;

import by.domus.app.model.beans.impl.orders.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "partner")
public class Partner {
    @Id
    @GeneratedValue
    @Column(name = "partner_id", unique = true)
    private Long id;
    private String name;
    private String fullName;
    private Integer payerAccountNumber;
    private Long contractId;
    private Long paymentAccountId;
//    @OneToMany(
//            mappedBy = "partner",
//            fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    private List<Order> orderList;
}

