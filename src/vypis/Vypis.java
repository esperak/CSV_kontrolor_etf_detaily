package vypis;

import java.util.ArrayList;
import java.util.Set;

public class Vypis {

    public void vypisRiadkyPrvkov (ArrayList<String[]> pole) {
        for (String[] prvok : pole) {
            System.out.println("("+
                    "ID_ETF="+prvok[0]+
                    ", POZICIA="+prvok[1]+
                    ", ID_CENNEHO_PAPIERA="+prvok[2]+
                    ", CUDZI_TICKER="+prvok[3]+
                    ", CUDZI_NAZOV_CP="+prvok[4]+
                    ", VELKOST_POZCICIE_PERCENT="+prvok[5]+
                    ")");
        }
    }

    public void vypisPocetRiadkov (int pocet_riadkov) {
        System.out.println("Pocet riadkov "+pocet_riadkov);
    }

    public void vypisMnozinuIdETF (Set<Integer> id_etf) {
        String retazec = "(";
        for (Integer prvok : id_etf)
            retazec += Integer.toString(prvok)+"," ;
        retazec = retazec.substring(0, retazec.length()-1);
        retazec +=")";

        System.out.println("Su to tieto id_ETF:  "+retazec);
        // pre info
        System.out.println("Konkretne tieto ETF: (20451-SILJ, 19956-HACK, 28356-GAMR, 28456-IPAY ,28446-IFLY)");
    }

    public void vypisPrazdnyRiadok () {
        System.out.println();
    }
}
