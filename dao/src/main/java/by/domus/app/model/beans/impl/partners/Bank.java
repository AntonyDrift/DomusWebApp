package by.domus.app.model.beans.impl.partners;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bank")
public class Bank {
    @Id
    @GeneratedValue
    private Long id;
    private String bankName;
    private String branchBankName;
    private String bankIdentifierCode;
    private String address;
    private String contact;
    private String BankPaymentAccountCode;

}
