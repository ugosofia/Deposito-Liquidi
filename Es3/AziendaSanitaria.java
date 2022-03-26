package Es3;

import java.util.ArrayList;

public class AziendaSanitaria {

    //ATTRIBUTI

    private ArrayList<Paziente> listaPazienti;
    private ArrayList<Medico> listaMedici;

    //COSTRUTTORI

    /**
     *
     * @param listaPazienti     LISTA DEI PAZIENTI
     * @param listaMedici       LISTA DEI MEDICI
     */
    public AziendaSanitaria(ArrayList<Paziente> listaPazienti, ArrayList<Medico> listaMedici) {
        this.listaPazienti = listaPazienti;
        this.listaMedici = listaMedici;
    }

    //METODI

    /**
     *
     * @param p     PAZIENTE DA INSERIRE NELLA LISTA
     */
    public void aggPaziente(Paziente p) {
        // controllo se il paziente è già presente in lista
        for (Paziente paziente: listaPazienti) {
            if(paziente.getnTessera() == p.getnTessera()) {
                System.out.println("Paziente " + p.getnTessera() + " già presente nella lista");
                return;
            }
        }
        // se non lo è, lo aggiungo alla lista
        listaPazienti.add(p);
    }

    /**
     *
     * @param p     PAZIENTE DA TROVARE NELLA LISTA
     * @return      1 SE HO TROVATO IL PAZIENTE p, 0 ALTRIMENTI
     */
    private int trovaPaziente(Paziente p) {
        for (Paziente paziente: listaPazienti) {
            if (paziente.equals(p))
                return 1;
        }
        return 0;
    }

    /**
     *
     * @param m                 MEDICO DI CUI VOGLIAMO AVERE LA LISTA DEI PAZIENTI
     * @return listamedico      LA LISTA DEI PAZIENTI DEL MEDICO m
     */
    public ArrayList<Paziente> listaMedico(Medico m) {
       ArrayList<Paziente> listamedico = new ArrayList<>();

        for (Paziente p: listaPazienti) {
            if (p.getMedicoCurante() == m)
                listamedico.add(p);
        }
        return listamedico;
    }

    /**
     * @return medico   IL MEDICO CON IL MAGGIOR NUMERO DI PAZIENTI
     */
    public Medico statMedico() {
        int numPazienti = 0;
        Medico medico = null;
        // controllo quale lista pazienti è più grande, ritorno il medico corrispondente
        for (Medico m : listaMedici) {
            ArrayList<Paziente> list = listaMedico(m);
            if(list.size() > numPazienti) {
                numPazienti = list.size();
                medico = m;
            }
        }

        return medico;
    }

    /**
     * STAMPA LA LISTA DEI PAZIENTI
     */
    public void printMedici() {
        System.out.println("Lista dei medici: ");
        for (Medico m : listaMedici){
            System.out.println(m.toString());
        }

    }

    /**
     * STAMPA LA LISTA DEI MEDICI
     */
    public void printPazienti() {
        System.out.println("Lista dei pazienti: ");
        for (Paziente p : listaPazienti){
            System.out.println(p.toString());
        }

    }
}
