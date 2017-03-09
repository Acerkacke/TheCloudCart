package org.cramest.thecloudcart.network;

import org.cramest.thecloudcart.classi.*;

/**
 * Created by User on 20/01/2017.
 */

public class WebsiteDataManager {

    final static String sepRighe = "§";
    final static String sepColonne = "♦";

    public static String[] getNomiListeUtente(String data){
        return data.split(sepRighe);
    }

    public static Categoria[] getCategorie(String data){
        String[] strCategorie = data.split(sepRighe);
        Categoria[] categorie = new Categoria[strCategorie.length];
        for(int i=0;i<strCategorie.length;i++){
            String[] pezziCategoria = data.split(sepColonne);
            categorie[i] = new Categoria(Integer.parseInt(pezziCategoria[0]),pezziCategoria[1]);
        }
        return  categorie;
    }

    public static Prodotto[] getProdotti(String data){
        String[] strProdotti = data.split(sepRighe);
        Prodotto[] prodotti = new Prodotto[strProdotti.length];
        for(int i=0;i<strProdotti.length;i++){
            String[] strProdotto = strProdotti[i].split(sepColonne);
            String nome = strProdotto[0];
            double prezzo = Double.parseDouble(strProdotto[1]);
            String marca = strProdotto[2];
            Categoria categoria = ListaCategorie.getCategoriaFromID(Integer.parseInt(strProdotto[3]));
            prodotti[i] = new Prodotto(nome,prezzo,marca,categoria);
        }
        return  prodotti;
    }

}
