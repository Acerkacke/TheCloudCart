package org.cramest.thecloudcart.classi;

import org.cramest.thecloudcart.classi.*;

import java.util.ArrayList;

/**
 * Created by User on 20/01/2017.
 */

public class ListaCategorie {

    private static ArrayList<Categoria> categorie;

    public static Categoria getCategoriaFromID(int ID){
        return categorie.get(ID);
    }
}
