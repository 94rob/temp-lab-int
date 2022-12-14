package its.extratech.FutureTravel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STORICO")
public class Storico {

    @Id
    public long id;

    @Column(name = "CONTESTO")
    public Contesto contesto;

    @Column(name = "TIME")
    public int time;

    @Column(name = "PRESENZE")
    public int presenze;

    @Column(name = "ARRIVI")
    public int arrivi;
}
