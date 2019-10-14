package by.domus.app.model.beans.impl.partners;

import by.domus.app.model.beans.impl.partners.Bank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "payment_account")
public class PaymentAccount {
    @Id
    @GeneratedValue
    private Long id;
    private String paymentAccountCode;

    @OneToOne(mappedBy = "paymentAccount")
    private Bank bank;

    @ManyToOne
    @JoinColumn(name = "partner_id")
    private Partner partner;

    @Override
    public String toString() {
        return "PaymentAccount{" +
                "id=" + id +
                ", paymentAccountCode='" + paymentAccountCode + '\'' +
                ", bank=" + bank.getId() +
                ", partner=" + partner.getId() +
                '}';
    }
}
