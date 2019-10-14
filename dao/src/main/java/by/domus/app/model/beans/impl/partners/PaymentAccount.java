package by.domus.app.model.beans.impl.partners;

import by.domus.app.model.beans.impl.partners.Bank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "payment_account")
public class PaymentAccount {
    @Id
    @GeneratedValue
    private Long id;
    private String paymentAccountCode;
    private Long bankId;


}
