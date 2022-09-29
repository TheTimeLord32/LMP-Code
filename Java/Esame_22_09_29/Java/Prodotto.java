package Esame_22_09_29.Java;

import java.time.LocalDate;

public class Prodotto {
    private String titolo, autore, casaEditrice;
    private LocalDate pubblicazione;

    public Prodotto(String titolo, String autore, String casaEditrice, LocalDate pubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.casaEditrice = casaEditrice;
        this.pubblicazione = pubblicazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    public LocalDate getPubblicazione() {
        return pubblicazione;
    }

    public void setPubblicazione(LocalDate pubblicazione) {
        this.pubblicazione = pubblicazione;
    }

    @Override
    public String toString() {
        return "Oggetto{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", casaEditrice='" + casaEditrice + '\'' +
                ", pubblicazione=" + pubblicazione +
                '}';
    }
}
