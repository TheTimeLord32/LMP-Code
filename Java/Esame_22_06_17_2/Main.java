package Esame_22_06_17_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    private static final ArrayList<Clienti> clienti = new ArrayList<>();
    private static final ArrayList<Prodotto> prodotti = new ArrayList<>();
    private static final ArrayList<Fornitore> fornitori = new ArrayList<>();
    private static final ArrayList<Acquisti> acquisti = new ArrayList<>();

    public static void main(String[] args) {
        clienti.add(nuovoCliente("Thomas", "thomas@gmail.com"));
        clienti.add(nuovoCliente("Kevin", "kevin@gmail.com"));

        nuovoFornitore("Nike", "T-Shirt", 20);
        nuovoFornitore("Adidas", "Scarpe", 10);
        nuovoFornitore("Puma", "Pantaloni", 15);

        prodotti.add(nuovoProdotto("T-Shirt", 15, Prodotto.Categoria.magliette, Prodotto.Destinatario.uomo, fornitori.get(0)));
        prodotti.add(nuovoProdotto("T-Shirt", 15, Prodotto.Categoria.calzature, Prodotto.Destinatario.donna, fornitori.get(0)));
        prodotti.add(nuovoProdotto("T-Shirt", 15, Prodotto.Categoria.intimo, Prodotto.Destinatario.unisex, fornitori.get(0)));
        prodotti.add(nuovoProdotto("Pullover", 15, Prodotto.Categoria.magliette, Prodotto.Destinatario.uomo, fornitori.get(1)));

        acquisti.add(new Acquisti(clienti.get(0), prodotti.get(0), LocalDate.now()));
        acquisti.add(new Acquisti(clienti.get(0), prodotti.get(1), LocalDate.now()));
        acquisti.add(new Acquisti(clienti.get(0), prodotti.get(2), LocalDate.now()));
        acquisti.add(new Acquisti(clienti.get(0), prodotti.get(3), LocalDate.now()));

        acquisti.add(new Acquisti(clienti.get(1), prodotti.get(3), LocalDate.of(2022, 9, 14)));
        acquisti.add(new Acquisti(clienti.get(1), prodotti.get(3), LocalDate.of(2021, 9, 14)));

        System.out.println("Tutti gli acquisti:" + acquisti + "\n");

        //cerca acquisti
        acquisti("Thomas");

        // trova prodotto
        System.out.println("Prodotto trovato " + trovaProdotto("T-Shirt") + " volte");

        // prodotto annuale
        System.out.println("Prodotto annuale " + prodottoAnnuale("Pullover", 2021) + " volte");

        // occorrenze fornitore
        System.out.println("Fornitore " + fornitori.get(1).getNome() + " occorrenze: " + trovaFornitore(fornitori.get(1).getNome()));
    }

    // nuovo cliente
    public static Clienti nuovoCliente(String nome, String email) { return new Clienti(nome, email); }

    // nuovo fornitore
    public static void nuovoFornitore(String nome, String prodotto, int quantita) { fornitori.add(new Fornitore(nome, prodotto, quantita)); }

    // nuovo prodotto
    public static Prodotto nuovoProdotto(String nome, float prezzo, Prodotto.Categoria categoria, Prodotto.Destinatario destinatario, Fornitore fornitore) {
        return new Prodotto(nome, prezzo, categoria, destinatario, fornitore);
    }

    // acquisti misti (tutti clienti e tutti prodotti)
    public static void acquisti(String nome) {
        /*for (Acquisti a : acquisti) {
            if (a.getClienti().toString().contains(nome)) {
                System.out.println("Ordine per " + nome + " trovato: " + a.getClienti() + a.getProdotti());
            }
        }*/
        System.out.println(acquisti.stream().filter(acquisti -> acquisti.getClienti().getNome().equals(nome)).collect(Collectors.toList()));
    }

    // trova occorrenze prodotto
    public static int trovaProdotto(String nome) {
        int count = 0;
        for (Prodotto p : prodotti) {
            if (p.getNome().equals(nome)) {
                count++;
            }
        }
        return count;
    }

    // trova prodotto anno
    public static int prodottoAnnuale(String nome, int anno) {
        int count = 0;
        for (Acquisti a :  acquisti) {
            if (a.getData().getYear() == anno) {
                count++;
                a.getProdotti().getNome();
            }
        }
        acquisti.stream()
                .filter(acquisti -> acquisti.getData().getYear() == anno)
                .count();
        return count;
    }

    // occorrenze fornitore
    public static int trovaFornitore(String nome) {
        int count = 0;
        for (Acquisti a :  acquisti) {
            if (a.getProdotti().getFornitore().toString().contains(nome)) {
                count++;
            }
        }
        return count;
    }

}
