package Esercizio3;

import java.time.LocalTime;
import java.util.ArrayList;

public class Treno {
    private String tipologia;
    private String partenza, arrivo;
    private ArrayList<String> fermata;
    private LocalTime orarioPartenza, orarioFermata;
    private int posti;
    private float chilometri;

    public Treno(String tipologia, String partenza, String arrivo, ArrayList<String> fermata, LocalTime orarioPartenza, LocalTime orarioFermata, int posti, float chilometri) {
        this.tipologia = tipologia;
        this.partenza = partenza;
        this.arrivo = arrivo;
        this.fermata = fermata;
        this.orarioPartenza = orarioPartenza;
        this.orarioFermata = orarioFermata;
        this.posti = posti;
        this.chilometri = chilometri;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public String getArrivo() {
        return arrivo;
    }

    public void setArrivo(String arrivo) {
        this.arrivo = arrivo;
    }

    public ArrayList<String> getFermata() {
        return fermata;
    }

    public void setFermata(ArrayList<String> fermata) {
        this.fermata = fermata;
    }

    public LocalTime getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(LocalTime orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public LocalTime getOrarioFermata() {
        return orarioFermata;
    }

    public void setOrarioFermata(LocalTime orarioFermata) {
        this.orarioFermata = orarioFermata;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    public float getChilometri() {
        return chilometri;
    }

    public void setChilometri(float chilometri) {
        this.chilometri = chilometri;
    }

    @Override
    public String toString() {
        return "Treno{" +
                "tipologia='" + tipologia + '\'' +
                ", partenza='" + partenza + '\'' +
                ", arrivo='" + arrivo + '\'' +
                ", fermata=" + fermata +
                ", orarioPartenza=" + orarioPartenza +
                ", orarioFermata=" + orarioFermata +
                ", posti=" + posti +
                ", chilometri=" + chilometri +
                '}';
    }
}
