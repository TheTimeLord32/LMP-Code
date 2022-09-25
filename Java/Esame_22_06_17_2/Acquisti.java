package Esame_22_06_17_2;

import java.time.LocalDate;

public class Acquisti {
    private Clienti clienti;
    private Prodotto prodotti;
    private LocalDate data;

    public Acquisti(Clienti clienti, Prodotto prodotti, LocalDate data) {
        this.clienti = clienti;
        this.prodotti = prodotti;
        this.data = data;
    }

    public Clienti getClienti() {
        return clienti;
    }

    public void setClienti(Clienti clienti) {
        this.clienti = clienti;
    }

    public Prodotto getProdotti() {
        return prodotti;
    }

    public void setProdotti(Prodotto prodotti) {
        this.prodotti = prodotti;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Acquisti{" +
                "clienti=" + clienti +
                ", prodotti=" + prodotti +
                ", data=" + data +
                '}';
    }
}
