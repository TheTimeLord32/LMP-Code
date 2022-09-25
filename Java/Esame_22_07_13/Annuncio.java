package Esame_22_07_13;

import java.time.LocalDate;

public class Annuncio {
    private String titolo, corpo, autore;
    private LocalDate data;

    public Annuncio(String titolo, String corpo, LocalDate data, String autore) {
        this.titolo = titolo;
        this.corpo = corpo;
        this.data = data;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Annuncio{" +
                "titolo='" + titolo + '\'' +
                ", corpo='" + corpo + '\'' +
                ", autore='" + autore + '\'' +
                ", data=" + data +
                '}';
    }
}
