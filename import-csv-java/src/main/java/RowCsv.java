import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
class RowCsv {
    public String ITTER107;
    public String Territorio;
    public String TIPO_DATO7;
    public String Indicatori;
    public String CORREZ;
    public String Correzione;
    public String TIPO_ALLOGGIO2;
    public String Tipologia_di_esercizio;
    public String ATECO_2007;
    public String Ateco_2007;
    public String ISO;
    public String Paese_di_residenza_dei_clienti;
    public String TIME;
    public String Seleziona_periodo;
    public String Value;
    public String Flag_Codes;
    public String Flags;

    @Override
    public String toString(){
        return this.ITTER107 + " " + this.Territorio + " " + this.TIPO_DATO7 + " " + this.Indicatori + " " + this.CORREZ
                + " " + this.Correzione + " " + this.TIPO_ALLOGGIO2 + " " + this.Tipologia_di_esercizio + " " + this.ATECO_2007
                + " " + this.Ateco_2007 + " " + this.ISO + " " + this.Paese_di_residenza_dei_clienti + " " + this.TIME
                + " " + this.Seleziona_periodo + " " + this.Value + " " + this.Flag_Codes + " " + this.Flags;
    }

}


