package Contenitore;

import java.util.ArrayList;

public class U {

    ArrayList<Contenitore> filtra(ArrayList<Contenitore> T, Contenitore C) {

        for (Contenitore c: T) {
            if((c.confronta(C)) == 0)
                T.remove(c);
        }

        return T;
    }
}
