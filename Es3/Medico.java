package Es3;

import java.util.Objects;

public class Medico {

    //ATTRIBUTI
    private String name;
    private int id; // UNIVOCO, NON CI POSSONO ESSERE DUE MEDICI CON LO STESSO ID

    //COSTRUTTORI

    /**
     *
     * @param name      NOME DEL MEDICO
     */
    public Medico(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //METODI

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Medico)) return false;
        Medico medico = (Medico) o;
        return this.id == medico.id;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "name = '" + name + '\'' +
                ", id = " + id +
                '}';
    }
}
