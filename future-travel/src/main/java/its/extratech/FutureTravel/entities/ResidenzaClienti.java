package its.extratech.FutureTravel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESIDENZA_CLIENTI")
public class ResidenzaClienti {

    @Id
    public long id;

    @Column(name = "DESCRIZIONE")
    public String descrizione;
}
