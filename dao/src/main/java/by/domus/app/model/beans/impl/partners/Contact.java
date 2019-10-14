package by.domus.app.model.beans.impl.partners;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue
    private Long id;
    private String legalAddress;
    private String postAddress;
    private String deliveryAddress;
    private String phoneNumber;
    private String mobileNumber;
    private String fax;

    @OneToOne
    @JoinColumn(name = "partner_id")
    private Partner partner;
}
