package by.domus.app.model.beans.impl.partners;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "contract")
public class Contract {
    @Id
    @GeneratedValue
    private Long id;
    private String number;
    private String type;
    private Integer days;

    @ManyToOne
    @JoinColumn(name = "partner_id")
    private Partner partner;

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", days=" + days +
                ", partner=" + partner.getId() +
                '}';
    }
}
