package Esercizio3;

import java.time.LocalTime;
import java.util.ArrayList;

public class Espresso extends Treno{

    private int postiRistorante;

    public Espresso(String partenza, String arrivo, ArrayList<String> fermata, LocalTime orarioPartenza, LocalTime orarioFermata, int postiRistorante, float chilometri) {
        super("Espresso", partenza, arrivo, fermata, orarioPartenza, orarioFermata, postiRistorante, chilometri);
    }

    public int getPostiRistorante() {
        return postiRistorante;
    }

    public void setPostiRistorante(int postiRistorante) {
        this.postiRistorante = postiRistorante;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "postiRistorante=" + postiRistorante +
                '}';
    }
}
