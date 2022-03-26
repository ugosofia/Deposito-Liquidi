package Es2;

public class Sculture extends ArtWork{

    // ATTRIBUTI
    private int height;     // ALTEZZA
    private int width;      // LARGHEZZA
    private int depth;      // PROFONDITA'

    // COSTRUTTORI

    /**
     *
     * @param title     TITOLO DELLA SCULTURA
     * @param artist    ARTISTA DELLA SCULTURA
     * @param height    ALTEZZA DELLA SCULTURA
     * @param width     LARGHEZZA DELLA SCULTURA
     * @param depth     PROFONDITA' DELLA SCULTURA
     */
    public Sculture(String title, String artist, int height, int width, int depth) {
        super(title, artist);
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    //METODI

    /**
     *
     * @return height * width * depth (INGOMBRO)
     */
    @Override
    public double printEncumbrance() {
        return height*width*depth;
    }

    @Override
    public String toString() {
        return "Sculture{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
