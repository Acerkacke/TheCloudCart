package org.cramest.thecloudcart.network;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.cramest.thecloudcart.R;
import org.cramest.thecloudcart.classi.Categoria;
import org.cramest.thecloudcart.classi.Prodotto;

/**
 * Created by cremaluca on 09/03/2017.
 */
public class WebsiteDataReciever implements DataHandler {

    private Context c;

    public WebsiteDataReciever(Context c){
        this.c = c;
    }

    public String[] getUserLists(){
        String[] parametri = {"req","user"};
        //String[] valori = {"userLists",username};
        //Connettore.getInstance(this).GetDataFromWebsite(this,"liste",parametri,valori);
        return null;
    }

    public Categoria[] getAllCategorie(){
        return null;
    }

    public Prodotto[] getAllProdotto() {
        return null;
    }

    @Override
    public Object HandleData(String nome, boolean success, String data) {
        if(success) {
            if (nome.equals("liste")) {
                return WebsiteDataManager.getNomiListeUtente(data);
            }
        }else{
           System.out.println("Errore nella richiesta " + nome);
        }
        return null;
    }
}
