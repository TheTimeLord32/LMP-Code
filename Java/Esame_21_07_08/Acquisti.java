package Esame_21_07_08;

import java.time.LocalDate;

public class Acquisti {
    private final Cliente cliente;
    private Prodotto prodotto;
    private LocalDate data;

    public Acquisti(Cliente c, Prodotto p, LocalDate data) {
        this.cliente = c;
        this.prodotto = p;
        this.data = data;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
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
                "c=" + cliente +
                ", p=" + prodotto +
                ", data=" + data +
                '}';
    }
}
