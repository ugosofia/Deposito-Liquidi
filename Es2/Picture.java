package Es2;

public class Picture extends ArtWork{

    // ATTRIBUTI
    private int height;
    private int width;

    // COSTRUTTORI

    /**
     *
     * @param title     TITOLO DEL QUADRO
     * @param artist    ARTISTA DEL QUADRO
     * @param height    ALTEZZA DEL QUADRO
     * @param width     LARGHEZZA DEL QUADRO
     */
    public Picture(String title, String artist, int height, int width) {
        super(title, artist);
        this.height = height;
        this.width = width;
    }

    //METODI
    /**
     *
     * @return heigth * width (INGOMBRO IN MQ)
     */
    @Override
    public double printEncumbrance() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }


}
