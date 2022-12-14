package its.extratech.FutureTravel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TIPO_ALLOGGIO")
public class TipoAlloggio {

    @Id
    public long id;

    @Column(name = "DESCRIZIONE")
    public String descrizione;
}
