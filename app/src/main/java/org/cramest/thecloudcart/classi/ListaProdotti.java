package org.cramest.thecloudcart.classi;

import org.cramest.thecloudcart.network.WebsiteDataManager;

import java.util.ArrayList;

/**
 * Created by User on 20/01/2017.
 */

public class ListaProdotti {

    private static ArrayList<Prodotto> prodotti;

    private static void RecuperaProdotti(){
        prodotti = new ArrayList<Prodotto>();
        //TODO : Recupera i prodotti dal sito
    }


    public static Prodotto getProdottoFromID(int ID){
        if(prodotti == null) {
            RecuperaProdotti();
        }
        //TODO : Da completare, deve cercarlo tramite ID e non tramite index dell'arraylist
        return prodotti.get(ID);
    }

}
