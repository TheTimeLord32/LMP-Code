package Esercizio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    private static final ArrayList<Studente> studente = new ArrayList<>();
    private static final ArrayList<Studente> studente2 = new ArrayList<>();
    private static final ArrayList<Classe> classe = new ArrayList<>();

    public static void main(String[] args) {
//        studente.add(nuovoStudente("Thomas", "Mandija", "Marino", LocalDate.of(2001, 1, 31)));
        studente.add(nuovoStudente("Kevin", "Sotja", "Roma", LocalDate.now()));
        studente.add(nuovoStudente("Kevin", "Sotja", "Roma", LocalDate.now()));
        studente.add(nuovoStudente("Kevin", "Sotja", "Roma", LocalDate.now()));
        studente.add(nuovoStudente("Kevin", "Sotja", "Roma", LocalDate.now()));

        studente2.add(nuovoStudente("Thomas", "Mandija", "Marino", LocalDate.of(2019, 1, 31)));
        studente2.add(nuovoStudente("Thomas", "Mandija", "Marino", LocalDate.of(2020, 1, 31)));
        studente2.add(nuovoStudente("Thomas", "Mandija", "Marino", LocalDate.of(2021, 1, 31)));
//        studente2.add(nuovoStudente("Thomas", "Mandija", "Marino", LocalDate.of(2022, 1, 31)));

        classe.add(nuovaClasse("1A", studente));
//        classe.add(nuovaClasse("2A", studente2));

        System.out.println("\n" + classe.get(0).getDataFormazione());
//        System.out.println("\n" + classe.get(1).getDataFormazione());

        // numero studenti
        int indiceClasse = 0;
        System.out.println("Il numero di studenti nella classe " + classe.get(indiceClasse).getNome() + " è: " +  numeroStudenti(indiceClasse));

        studenteBocciato(classe);
    }

    private static Studente nuovoStudente(String nome, String cognome, String luogoNascita, LocalDate dataNascita) {
        return new Studente(nome, cognome, luogoNascita, dataNascita);
    }

    private static int annoStudente(ArrayList<Studente> array) {
        int max = 0;
        for (Studente s : array) {
            if (s.getDataNascita().getYear() > max) {
                max = s.getDataNascita().getYear();
            }
        }
        return max;
    }

    private static Classe nuovaClasse(String nome, ArrayList<Studente> studente) {
        return new Classe(nome, annoStudente(studente), studente);
    }

    private static int numeroStudenti(int indice) {
//        return classe.stream().filter(classe1 -> classe1.getNome().equals(classe.get(indice).getNome())).findFirst().get().getStudente().size();
        return classe.get(indice).getStudente().size();
    }

    // non corretta
    private static void studenteBocciato(ArrayList<Classe> classe) {
        for (Classe c : classe) {
            if (c.getStudente().get(0).getDataNascita().getYear() != c.getDataFormazione()) {
                System.out.println(c.getStudente().get(0).getNome() + "  bocciato");
            }
        }
    }
}
