package Es2;

import java.util.ArrayList;

public class Collection {

    //ATTRIBUTI
    private String name;
    private String city;
    private ArrayList<ArtWork> collection;

    //COSTRUTTORI

    /**
     * COSTRUTTORE VUOTO
     */
    public Collection() {
    }

    /**
     *
     * @param name IL NOME DELLA COLLEZIONE
     * @param collection  LA COLLEZIONE DELLE OPERE
     */
    public Collection(String name, String city, ArrayList<ArtWork> collection) {
        this.name = name;
        this.city = city;
        this.collection = collection;
    }
    //METODI

    /**
     *
     * @param aw L'OPERA DA INSERIRE NELLA COLLEZIONE
     */
    public void insertArtWork(ArtWork aw) {
        this.collection.add(aw);

    }

    /**
     * METODO CHE STAMPA L'INTERA COLLEZIONE DI OPERE
     */
    public void printCollection(){
        System.out.println("Nome della collezione: " + name  + "\n");
        System.out.println("Luogo della collezione: " + city  + "\n");
        System.out.println("Opere della collezione: ");

        for (ArtWork aw: collection) {
            System.out.println("Nome opera: " + aw.title);
            System.out.println("Autore: " + aw.artist);
            System.out.println();
        }
    }

    /**
     *
     * @param aw  L'OPERA DI CUI VOGLIAMO STAMPARE L'INGOMBRO, ASSUMENDO SIA ALL'INTERNO DELLA COLLEZIONE
     */
    public void printEncumbrance(ArtWork aw) {
        for (ArtWork artWork : collection) {
            if (artWork.equals(aw))
                System.out.println(artWork.printEncumbrance());
        }

    }


}
