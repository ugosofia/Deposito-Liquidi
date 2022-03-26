package Es2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArtWork aw1 = new Picture("Quadro1", "Artista1", 20,30 );
        ArtWork aw2 = new Picture("Quadro1", "Artista1", 50,50 );

        ArtWork aw3 = new Sculture("Scultura1", "Artista2", 30,30, 50 );
        ArtWork aw4 = new Sculture("Scultura2", "Artista3", 60,30, 100 );

        ArrayList<ArtWork> list = new ArrayList<>();
        Collection c = new Collection("Collezione1","Roma", list ) ;

        c.insertArtWork(aw1);
        c.insertArtWork(aw2);
        c.insertArtWork(aw3);
        c.insertArtWork(aw4);

        c.printEncumbrance(aw1);
        c.printEncumbrance(aw4);

        c.printCollection();




    }
}
