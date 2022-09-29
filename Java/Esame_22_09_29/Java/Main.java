package Esame_22_09_29.Java;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    private static final ArrayList<Gioco> gioco = new ArrayList<>();
    private static final ArrayList<Libro> libro = new ArrayList<>();
    private static final ArrayList<Utilizzo> utilizzo = new ArrayList<>();

    public static void main(String[] args) {
        gioco.add(new Gioco("TitoloGioco1", "AutoreGioco", "CasaEditriceGioco", LocalDate.now(), 30 ));
        gioco.add(new Gioco("TitoloGioco2", "AutoreGioco", "CasaEditriceGioco", LocalDate.now(), 30 ));
        gioco.add(new Gioco("TitoloGioco3", "AutoreGioco", "CasaEditriceGioco", LocalDate.now(), 30 ));
        libro.add(new Libro("TitoloLibro1", "AutoreLibro", "CasaEditriceLibro", LocalDate.now(), 30 ));
        libro.add(new Libro("TitoloLibro2", "AutoreLibro", "CasaEditriceLibro", LocalDate.now(), 30 ));
        libro.add(new Libro("TitoloLibro3", "AutoreLibro", "CasaEditriceLibro", LocalDate.now(), 30 ));

        Utilizzo u1 = new Utilizzo(gioco.get(0), LocalTime.of(9,0), null, "Cliente1", "Cliente1");

        u1.setFinePrestito(LocalTime.of(10,10));
        utilizzo.add(u1);

        disponibilita(gioco.get(1));
        periodo();
    }

    public static void disponibilita(Prodotto p) {
        int indice = utilizzo.size(), i;
        for (i = 0; i <indice ; i++) {
            if (p.getClass() == utilizzo.get(i).getProdotto().getClass()) {
                if (utilizzo.get(i).getFinePrestito() == null) {
                    if (p.getClass().equals(Gioco.class))
                        System.out.println("Attendere fine partita. Durata d'attesa stimata: " + gioco.get(i).getDurataPartita() + " minuti.");
                    else
                        System.out.println("Libro non disponibile. Attendere restituzione");
                } else {
                    if (p.getClass().equals(Gioco.class))
                        System.out.println("Gioco disponibile");
                    else
                        System.out.println("Libro disponibile");
                }
            } else {
                if (p.getClass().equals(Gioco.class))
                    System.out.println("Gioco disponibile");
                else
                    System.out.println("Libro disponibile");
            }
        }
    }

    public static void periodo() {
        for (Utilizzo u : utilizzo) {
            Duration diff = Duration.between(u.getFinePrestito(), u.getInizioPrestito());
            System.out.println("Periodo d'utilizzo: " + diff + " | Cliente: " + u.getNomeCliente());
        }
    }
}
