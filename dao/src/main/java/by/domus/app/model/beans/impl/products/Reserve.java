package by.domus.app.model.beans.impl.products;

import by.domus.app.model.beans.impl.products.Storage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "reserve")
public class Reserve {
    @Id
    @GeneratedValue
    private Long id;
    private Integer inReserve;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "storage_id")
    private Storage storage;

}
