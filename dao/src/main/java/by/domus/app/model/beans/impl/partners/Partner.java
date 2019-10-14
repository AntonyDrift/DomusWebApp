package by.domus.app.model.beans.impl.partners;

import by.domus.app.model.beans.impl.orders.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "partner")
public class Partner {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String fullname;

    @OneToOne(mappedBy = "partner")
    private Contact contact;


    @OneToMany(mappedBy = "partner")
    private List<PaymentAccount> paymentAccountList;
    @OneToMany(mappedBy = "partner")
    private List<Order> orderList;
    @OneToMany(mappedBy = "partner")
    private List<Contract> contractList;

    @Override
    public String toString() {
        return "Partner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", contact=" + contact.getId() +
                ", paymentAccountList=" + paymentAccountList +
                ", orderList=" + orderList +
                ", contractList=" + contractList +
                '}';
    }
}

