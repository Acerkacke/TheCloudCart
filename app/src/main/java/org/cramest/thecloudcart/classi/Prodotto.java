package org.cramest.thecloudcart.classi;

/**
 * Created by User on 20/01/2017.
 */

public class Prodotto {

    private String nome;
    private double prezzo;
    private String marca;
    private Categoria categoria;

    public Prodotto(String nome, double prezzo, String marca, Categoria categoria) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
