package Es2;

import java.util.Objects;

public abstract class ArtWork {

    //ATTRIBUTI
    protected String title;
    protected String artist;

    // COSTRUTTORI

    /**
     *
     * @param title     TITOLO DELL'OPERA
     * @param artist    ARTISTA DELL'OPERA
     */
    public ArtWork(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    //METODI

    /**
     *
     * METODO ASTRATTO PER STAMPARE L'INGOMBRO
     */
    public abstract double printEncumbrance();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ArtWork)) return false;
        ArtWork artWork = (ArtWork) o;
        return Objects.equals(title, artWork.title) && Objects.equals(artist, artWork.artist);
    }

    @Override
    public String toString() {
        return "ArtWork{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
