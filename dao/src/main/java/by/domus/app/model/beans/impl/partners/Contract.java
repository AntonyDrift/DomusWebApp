package by.domus.app.model.beans.impl.partners;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    private Long contractTypeId;
    private Date startDate;
    private Date finalDate;
}
