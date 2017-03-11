package org.cramest.thecloudcart.network;

import org.cramest.thecloudcart.classi.*;

import java.sql.Date;
import java.sql.Timestamp;

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
            int ID = Integer.parseInt(strProdotto[0]);
            String nome = strProdotto[1];
            double prezzo = Double.parseDouble(strProdotto[2]);
            String marca = strProdotto[3];
            String dimensione = strProdotto[4];
            Categoria categoria = ListaCategorie.getCategoriaFromID(Integer.parseInt(strProdotto[5]));
            prodotti[i] = new Prodotto(ID,nome,prezzo,marca,dimensione,categoria);
        }
        return  prodotti;
    }

    public static ProdottoInLista[] getProdottiInLista(String data){
        String[] strProdottiInLista = data.split(sepRighe);
        ProdottoInLista[] prodottiInLista = new ProdottoInLista[strProdottiInLista.length];
        for(int i=0;i<strProdottiInLista.length;i++){
            String[] strProdottoInLista = strProdottiInLista[i].split(sepColonne);

            Prodotto prodotto = ListaProdotti.getProdottoFromID(Integer.parseInt(strProdottoInLista[0]));
            int qta = Integer.parseInt(strProdottoInLista[1]);
            String descrizione = strProdottoInLista[2];

            prodottiInLista[i] = new ProdottoInLista(prodotto,qta,descrizione);
        }
        return  prodottiInLista;
    }

}
