package org.cramest.thecloudcart.classi;

import org.cramest.thecloudcart.network.WebsiteDataManager;

import java.util.ArrayList;

/**
 * Created by User on 20/01/2017.
 */

public class ListaProdotti {

    private ListaProdotti instanza;
    private ArrayList<Prodotto> prodotti;

    private ListaProdotti(){

    }

    private static void RecuperaProdotti(){

    }

    public ListaProdotti getInstanza(){
        if(instanza == null){
            instanza = new ListaProdotti();
        }
        return instanza;
    }

}
