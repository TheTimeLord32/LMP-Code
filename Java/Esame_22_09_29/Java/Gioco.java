package Esame_22_09_29.Java;

import java.time.LocalDate;

public class Gioco extends Prodotto {

    private int durataPartita;

    public Gioco(String titolo, String autore, String casaEditrice, LocalDate pubblicazione, Integer durataPartita) {
        super(titolo, autore, casaEditrice, pubblicazione);
        this.durataPartita = durataPartita;
    }

    public int getDurataPartita() {
        return durataPartita;
    }

    public void setDurataPartita(int durataPartita) {
        this.durataPartita = durataPartita;
    }

    @Override
    public String getTitolo() {
        return super.getTitolo();
    }

    @Override
    public void setTitolo(String titolo) {
        super.setTitolo(titolo);
    }

    @Override
    public String getAutore() {
        return super.getAutore();
    }

    @Override
    public void setAutore(String autore) {
        super.setAutore(autore);
    }

    @Override
    public String getCasaEditrice() {
        return super.getCasaEditrice();
    }

    @Override
    public void setCasaEditrice(String casaEditrice) {
        super.setCasaEditrice(casaEditrice);
    }

    @Override
    public LocalDate getPubblicazione() {
        return super.getPubblicazione();
    }

    @Override
    public void setPubblicazione(LocalDate pubblicazione) {
        super.setPubblicazione(pubblicazione);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
