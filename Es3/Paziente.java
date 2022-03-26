package Es3;

import java.util.Objects;

public class Paziente {

    //ATTRIBUTI
    private int nTessera;
    private Medico MedicoCurante;

    //COSTRUTTORI

    /**
     *
     * @param nTessera          NUMERO TESSERA SANITARIA PAZIENTE
     * @param medicoCurante     MEDICO CURANTE DEL PAZIENTE
     */
    public Paziente(int nTessera, Medico medicoCurante) {
        this.nTessera = nTessera;
        MedicoCurante = medicoCurante;
    }

    // METODI

    public int getnTessera() {
        return nTessera;
    }

    public void setnTessera(int nTessera) {
        this.nTessera = nTessera;
    }

    public Medico getMedicoCurante() {
        return MedicoCurante;
    }

    public void setMedicoCurante(Medico medicoCurante) {
        MedicoCurante = medicoCurante;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Paziente)) return false;
        Paziente paziente = (Paziente) o;
        return nTessera == paziente.nTessera && Objects.equals(MedicoCurante, paziente.MedicoCurante);
    }

    @Override
    public String toString() {
        return "Paziente{" +
                "nTessera = " + nTessera +
                ", MedicoCurante = " + MedicoCurante +
                '}';
    }
}
