package Contenitore;

public class Lattine extends Contenitore {

    private String nome;
    private int qta;

    public Lattine(int codice, livelloTossico l, String nome, int qta) {
        super(codice, l);
        this.nome = nome;
        this.qta = qta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQta() {
        return qta;
    }

    public void setQta(int qta) {
        this.qta = qta;
    }

    @Override
    public String toString() {
        return "Lattine{" +
                "nome='" + nome + '\'' +
                ", qta=" + qta +
                '}';
    }

    @Override
    public int confronta(CMP x){
        if (x == null)
            System.out.println("Il valore è nullo");


        if(!(x instanceof Lattine))
            throw new ClassCastException("Errore di tipo");

        Lattine l = (Lattine) x;

        if(l.qta > this.qta)
            return 1;
        else if(this.qta == l.qta)
            return 0;
        return -1;
    }


    @Override
    public void piuTossico(T x) {

    }
}
