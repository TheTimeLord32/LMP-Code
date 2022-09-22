package Esercizio3;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    private static final ArrayList<Treno> treno = new ArrayList<>();
    private static final ArrayList<Espresso> espresso = new ArrayList<>();
    private static final ArrayList<String> fermata = new ArrayList<>();

    public static void main(String[] args) {
        treno.add(newTreno("standard", "Roma", "Napoli", fermata, LocalTime.now(), LocalTime.now(), 70, 100 ));
        espresso.add(new Espresso("Roma", "Napoli", fermata, LocalTime.now(), LocalTime.now(), 70, 100));
        espresso.get(0).setPostiRistorante(50);

        Espresso e1 = new Espresso("Roma", "Napoli", fermata, LocalTime.now(), LocalTime.now(), 70, 100);
        e1.setPostiRistorante(50);
        System.out.println(e1);


        System.out.println(treno);
        System.out.println(espresso);
    }

    public static Treno newTreno(String tipologia, String partenza, String arrivo, ArrayList<String> fermata, LocalTime orarioPartenza, LocalTime orarioFermata, int posti, float chilometri) {
        return new Treno(tipologia, partenza, arrivo, fermata, orarioPartenza, orarioFermata, posti, chilometri);
    }
}
