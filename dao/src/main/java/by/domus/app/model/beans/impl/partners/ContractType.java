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
@Entity(name = "contract_type")
public class ContractType {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    private Integer days;
}
