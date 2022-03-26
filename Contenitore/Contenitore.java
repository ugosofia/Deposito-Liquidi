package Contenitore;

public abstract class Contenitore<level> implements CMP, T {

    protected int codice;

    protected enum livelloTossico {
        ALTO,
        MEDIO,
        BASSO,
        NULLO;

    } level l;

    /**
     *
     */
    public Contenitore() {
    }

    public Contenitore(int codice, livelloTossico level) {
        this.codice = codice;
        livelloTossico.values();

    }

    abstract String getNome();

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public level getlivelloTossico() {
        return this.l;

    }


}
