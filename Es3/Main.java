package Es3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Medico m = new Medico("Marco", 1);
        Medico m2 = new Medico("Luca", 2);
        Medico m3 = new Medico("Mario", 3);

        ArrayList<Medico> listaM = new ArrayList<>();
        listaM.add(m);
        listaM.add(m2);
        listaM.add(m3);

        Paziente p = new Paziente(321, m);
        Paziente p1 = new Paziente(323, m2);
        Paziente p2 = new Paziente(325, m2);
        Paziente p3 = new Paziente(310, m3);

        ArrayList<Paziente> listaP = new ArrayList<>();
        listaP.add(p);
        listaP.add(p1);
        listaP.add(p2);

        AziendaSanitaria as = new AziendaSanitaria(listaP, listaM);

        as.aggPaziente(p3); // aggiungo un paziente non presente, tutto ok
        as.aggPaziente(p1); // aggiungo un paziente già presente, stampa errore
        System.out.println();

        System.out.println(as.listaMedico(m)); // stampo i pazienti per il medico m
        System.out.println();

        System.out.println(as.statMedico()); // stampo il medico con più pazienti
        System.out.println();

        as.printMedici();       // stampo lista medici
        System.out.println();

        as.printPazienti();     // stampo lista pazienti




    }
}
