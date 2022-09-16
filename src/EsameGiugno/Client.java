package EsameGiugno;

import java.util.ArrayList;

public class Client {
    private String nome, cognome, indirizzo, cf;
    private ArrayList<Ordine> ordine;

    public Client(String nome, String cognome, String indirizzo, String cf, ArrayList<Ordine> ordine) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.cf = cf;
        this.ordine = ordine;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public ArrayList<Ordine> getOrdine() {
        return ordine;
    }

    public void setOrdine(ArrayList<Ordine> ordine) {
        this.ordine = ordine;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cf='" + cf + '\'' +
                ", ordine=" + ordine +
                '}';
    }
}
