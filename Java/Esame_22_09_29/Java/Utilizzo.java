package Esame_22_09_29.Java;

import java.time.LocalDate;
import java.time.LocalTime;

public class Utilizzo {
    private Prodotto prodotto;
    private LocalTime inizioPrestito, finePrestito;
    private String nomeCliente, cognomeCliente;

    public Utilizzo(Prodotto prodotto, LocalTime inizioPrestito, LocalTime finePrestito, String nomeCliente, String cognomeCliente) {
        this.prodotto = prodotto;
        this.inizioPrestito = inizioPrestito;
        this.finePrestito = finePrestito;
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public LocalTime getInizioPrestito() {
        return inizioPrestito;
    }

    public void setInizioPrestito(LocalTime inizioPrestito) {
        this.inizioPrestito = inizioPrestito;
    }

    public LocalTime getFinePrestito() {
        return finePrestito;
    }

    public void setFinePrestito(LocalTime finePrestito) {
        this.finePrestito = finePrestito;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente) {
        this.cognomeCliente = cognomeCliente;
    }

    @Override
    public String toString() {
        return "Utilizzo{" +
                "prodotto=" + prodotto +
                ", inizioPrestito=" + inizioPrestito +
                ", finePrestito=" + finePrestito +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", cognomeCliente='" + cognomeCliente + '\'' +
                '}';
    }
}
