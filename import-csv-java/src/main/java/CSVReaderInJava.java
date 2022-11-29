import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CSVReaderInJava {

    public static void main(String... args) {

        List<RowCsv> rows = readRowFromCsv("Z:\\LaboratorioIntegrato\\import-csv-java\\src\\main\\java\\aggregati.csv");

        System.out.println(rows.get(2).toString());
    }

    private static List<RowCsv> readRowFromCsv(String fileName) {
        List<RowCsv> rows = new ArrayList<RowCsv>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {

            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(",");
                RowCsv row = createRow(attributes);
                rows.add(row);

                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return rows;
    }

    private static RowCsv createRow(String[] metadata) {
        String ITTER107 = metadata[0];
        String Territorio = metadata[1];
        String TIPO_DATO7 = metadata[2];
        String Indicatori = metadata[3];
        String CORREZ = metadata[4];
        String Correzione = metadata[5];
        String TIPO_ALLOGGIO2 = metadata[6];
        String Tipologiadiesercizio = metadata[7];
        String ATECO_2007 = metadata[8];
        String Ateco_2007 = metadata[9];
        String ISO = metadata[10];
        String Paesediresidenzadeiclienti = metadata[11];
        String TIME = metadata[12];
        String Selezionaperiodo = metadata[13];
        String Value = metadata[14];
        String FlagCodes = metadata[15];
        String Flags = metadata[16];

        // create and return book of this metadata
        return new RowCsv(ITTER107, Territorio, TIPO_DATO7, Indicatori, CORREZ, Correzione, TIPO_ALLOGGIO2, Tipologiadiesercizio,
                ATECO_2007, Ateco_2007, ISO, Paesediresidenzadeiclienti, TIME, Selezionaperiodo, Value, FlagCodes, Flags);
    }

    private static void insert(List<RowCsv> rows){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp_labintegrato","root","");

            Statement stmt = con.createStatement();

            for (RowCsv r: rows) {
                stmt.executeQuery("INSERT INTO");
            }


            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}


