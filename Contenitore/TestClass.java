package Contenitore;

public class TestClass {

    public static void main(String[] args) {
        Contenitore c1 = new Bidoni(1, Contenitore.livelloTossico.ALTO, "Vino", 50);
        Contenitore c2 = new Bidoni(2, Contenitore.livelloTossico.NULLO, "Acqua", 60);

        Contenitore c3 = new Lattine(3, Contenitore.livelloTossico.MEDIO, "CocaCola", 20);
        Contenitore c4 = new Lattine(4, Contenitore.livelloTossico.BASSO, "Aranciata", 20);
    }
}