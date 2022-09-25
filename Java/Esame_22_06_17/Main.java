package Esame_22_06_17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Fornitore f1 = new Fornitore("Nike", "Via Roma 1", 1);
        Prodotto p1 = new Prodotto("T-Shirt", f1, 300, Prodotto.CategoriaProdotti.magliette, Prodotto.Destinatario.uomo);
        Prodotto p2 = new Prodotto("Air", f1, 300, Prodotto.CategoriaProdotti.calzature, Prodotto.Destinatario.donna);
        Prodotto p3 = new Prodotto("Calze", f1, 300, Prodotto.CategoriaProdotti.intimo, Prodotto.Destinatario.unisex);

        ArrayList<Prodotto> prodotti = new ArrayList<>();
        prodotti.add(p1);
        prodotti.add(p2);
        prodotti.add(p3);

        for (int i = 0; i < 3; i++) {
            System.out.println(prodotti.get(i));
        }

        ArrayList<Ordine> ordini = new ArrayList<>();

        Ordine o1 = new Ordine("o100", "2022/09/13", prodotti);
        ordini.add(o1);
        System.out.println(ordini);

        Client c1 = new Client("Thomas", "Mandija", "XXXXXXXXXXXXXXXXX", "Mandija", ordini);
    }

}
