package Esame_21_06_21;

import java.util.ArrayList;

public class Prodotto {
    private String id, nome;
    private float costoProduzione, prezzo; // costoProduzione = (tempoRealizzazione * coefficiente negozio) + prezzo per ogni componente
    private ArrayList<Componente> componente;
    private int giorniProduzione; // = max tra i tempi d'ordinazione dei componenti
    private int giorniRealizzazione;

    public Prodotto(String id, String nome, float costoProduzione, float prezzo, ArrayList<Componente> componente, int giorniProduzione, int giorniRealizzazione) {
        this.id = id;
        this.nome = nome;
        this.costoProduzione = costoProduzione;
        this.prezzo = prezzo;
        this.componente = componente;
        this.giorniProduzione = giorniProduzione;
        this.giorniRealizzazione = giorniRealizzazione;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCostoProduzione() {
        return costoProduzione;
    }

    public void setCostoProduzione(float costoProduzione) {
        this.costoProduzione = costoProduzione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public ArrayList<Componente> getComponente() {
        return componente;
    }

    public void setComponente(ArrayList<Componente> componente) {
        this.componente = componente;
    }

    public int getGiorniProduzione() {
        return giorniProduzione;
    }

    public void setGiorniProduzione(int giorniProduzione) {
        this.giorniProduzione = giorniProduzione;
    }

    public int getGiorniRealizzazione() {
        return giorniRealizzazione;
    }

    public void setGiorniRealizzazione(int giorniRealizzazione) {
        this.giorniRealizzazione = giorniRealizzazione;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", costoProduzione=" + costoProduzione +
                ", prezzo=" + prezzo +
                ", componente=" + componente +
                ", giorniProduzione=" + giorniProduzione +
                ", giorniRealizzazione=" + giorniRealizzazione +
                '}';
    }
}
