package its.extratech.FutureTravel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PROVINCIA")
public class Provincia {

    @Id
    public long id;

    @Column(name = "NOME_PROVINCIA")
    public String nomeProvincia;

}
