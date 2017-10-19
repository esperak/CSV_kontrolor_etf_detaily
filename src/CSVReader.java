import nacitanie.NacitanieCSV;
import vypis.Vypis;


public class CSVReader {

    private NacitanieCSV nacitanie;
    private Vypis vypis;

    public CSVReader() {
        nacitanie = new NacitanieCSV();
        vypis = new Vypis();
    }

    private void spustiReader() {

        nacitanie.nacitajPrvky();
        //vypis.vypisRiadkyPrvkov(nacitanie.vratPrvky());
        vypis.vypisRiadkyPrvkocExcelFormat(nacitanie.vratPrvky());

        vypis.vypisPrazdnyRiadok();
        vypis.vypisPocetRiadkov(nacitanie.vratPocetRiadkov());
        vypis.vypisPrazdnyRiadok();

        vypis.vypisMnozinuIdETF(nacitanie.vratMnozinuIdETF());

    }

    public static void main(String[] args) {

        CSVReader reader = new CSVReader();
        reader.spustiReader();

    }

}