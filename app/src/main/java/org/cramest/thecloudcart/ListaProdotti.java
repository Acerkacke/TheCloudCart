package org.cramest.thecloudcart;

/**
 * Created by User on 20/01/2017.
 */

public class ListaProdotti {

    private ListaProdotti instanza;

    private ListaProdotti(){

    }

    public ListaProdotti getInstanza(){
        if(instanza == null){
            instanza = new ListaProdotti();
        }
        return instanza;
    }

}
