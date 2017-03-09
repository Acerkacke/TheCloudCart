package org.cramest.thecloudcart.classi;

import java.sql.Date;

/**
 * Created by cremaluca on 09/03/2017.
 */
public class ProdottoInLista {

    private Prodotto prodotto;
    private int quantita;
    private String descrizione;
    private Date data;
    private boolean eStatoComprato;

    public ProdottoInLista(Prodotto prodotto, int quantita, String descrizione, Date data, boolean eStatoComprato) {
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.descrizione = descrizione;
        this.data = data;
        this.eStatoComprato = eStatoComprato;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Date getData() {
        return data;
    }

    public boolean iseStatoComprato() {
        return eStatoComprato;
    }
}
