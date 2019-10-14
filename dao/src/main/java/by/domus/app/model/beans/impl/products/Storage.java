package by.domus.app.model.beans.impl.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//quantity and condition
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "storage")
public class Storage {
    @Id
    @GeneratedValue
    private Long id;
    private Integer amount;
    private Integer rejected;
    private Integer reserved;
    private Integer inStock;
}
