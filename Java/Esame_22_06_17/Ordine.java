package Esame_22_06_17;

import java.util.ArrayList;

public class Ordine {
    private String id;
    private String data;
    private ArrayList<Prodotto> prodotti;

    public Ordine(String id, String data, ArrayList<Prodotto> prodotti) {
        this.id = id;
        this.data = data;
        this.prodotti = new ArrayList<Prodotto>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(ArrayList<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "id='" + id + '\'' +
                ", data='" + data + '\'' +
                ", prodotti=" + prodotti +
                '}';
    }
}
