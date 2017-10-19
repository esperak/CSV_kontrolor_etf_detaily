package nacitanie;

import konstanty.Konstanty;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NacitanieCSV {

    private ArrayList<String[]> nacitane_prvky;
    private Set<Integer> id_etf;

    public NacitanieCSV() {
        nacitane_prvky = new ArrayList<>();
        id_etf = new HashSet<>();
    }

    public ArrayList<String[]> vratPrvky() {
        return nacitane_prvky;
    }

    public int vratPocetRiadkov() {
        return nacitane_prvky.size();
    }

    public Set<Integer> vratMnozinuIdETF() {
        return id_etf;
    }

    public void nacitajPrvky() {

        String csvFile = Konstanty.CESTA_K_CSV;
        String cvsSplitBy = Konstanty.DELIC_STLPCOV;
        BufferedReader br = null;
        String line = "";

        try {
            // pokus sa precitat CSV
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] prvok = line.split(cvsSplitBy);
                SpracujRiadok(prvok);

            }

        } catch (FileNotFoundException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        finally {
            if (br != null) {
                try { br.close(); }
                catch (IOException e) { e.printStackTrace(); }
            }
        }

    }

    private void SpracujRiadok(String[] prvok) {
        try {
            if (prvok[3].length() > Konstanty.MAX_POCET_CHARAKTEROV) {
                nacitane_prvky.add(prvok);
                id_etf.add(Integer.parseInt(prvok[0]));
            }

        }catch(NumberFormatException exception){}

    }


}
