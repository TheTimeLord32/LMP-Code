package Esame_21_07_08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private static final ArrayList<Prodotto> prodotto = new ArrayList<>();
    private static final ArrayList<Cliente> cliente = new ArrayList<>();
    private static final ArrayList<Acquisti> acquisti = new ArrayList<>();

    public static void main(String[] args) {
        nuovoCliente("Thomas", "thomas@email.com", "partita.Thomas", "privati");
        nuovoCliente("Kevin", "kevin@email.com", "partita.Kevin", "professionista");
        nuovoCliente("Tizio", "tizio@email.com", "partita.Tizio", "società");
        nuovoProdotto("Scarpe", "calzature", "uomo", 10);
        nuovoProdotto("T-Shirt", "magliette", "donna", 10);
        nuovoProdotto("Calzini", "intimo", "unisex", 10);
        nuovoAcquisto(cliente.get(0), prodotto.get(0), LocalDate.of(2022, 9, 21));
        nuovoAcquisto(cliente.get(1), prodotto.get(0), LocalDate.of(2022, 9, 21));
        nuovoAcquisto(cliente.get(2), prodotto.get(0), LocalDate.of(2022, 1, 21));
        nuovoAcquisto(cliente.get(1), prodotto.get(1), LocalDate.of(2022, 1, 20));
        nuovoAcquisto(cliente.get(2), prodotto.get(2), LocalDate.of(2022, 1, 19));

        // stampo acquisti
//        System.out.println("Stampo acquisti: " + acquisti);

        // lista prodotti in data
        acquistoData(2022, 9, 21);

        // numero acquisti in mese
        acquistoMese(9);

        // numero vendite prodotto
        try{
            venditaProdotto(prodotto.get(0));
        } catch (IndexOutOfBoundsException e){
            System.out.println("Il prodotto scelto non è stato pervenuto");
        }

        // percentuale vendite
        try {
            percentualeVendite(9, 2022, prodotto.get(0));
        } catch (IndexOutOfBoundsException e){
            System.out.println("Il prodotto scelto non è stato pervenuto");
        }

        // vendita stagionale
        venditaStagionale("Inverno");
    }

    public static void nuovoCliente(String nome, String email, String ptIVA, String tipoCliente) { cliente.add(new Cliente(nome, email, ptIVA, Cliente.Tipologia.valueOf(tipoCliente))); }

    public static void nuovoProdotto(String nome, String categoria, String destinatario, float prezzo) {
        try {
            prodotto.add(new Prodotto(nome, Prodotto.Categoria.valueOf(categoria), Prodotto.Destinatario.valueOf(destinatario), prezzo));
        }catch (IllegalArgumentException e){
            System.out.println("Categoria o Destinatario non validi");
        }
    }

    public static void nuovoAcquisto(Cliente c, Prodotto p, LocalDate data) { acquisti.add(new Acquisti(c, p, data)); }

    public static void acquistoData(int anno, int mese, int giorno) {
        for (Acquisti a : acquisti) {
            if (a.getData().getYear() == anno && a.getData().getMonthValue() == mese && a.getData().getDayOfMonth() == giorno) {
                System.out.println("Trovato acquisto: " + a);
            }
//            } else {
//                System.out.println("Nessun acquisto trovato"); // fix per stampa
//            }
        }
    }

    public static void acquistoMese(int mese){
        int count=0;
        for (Acquisti a : acquisti) {
            if (a.getData().getMonthValue() == mese) {
                count++;
            }
        }
        System.out.println("Acquisti trovati nel mese " + mese + ": " + count);
    }

    public static void venditaProdotto(Prodotto p) {
        int count = 0;
        for (Acquisti a : acquisti) {
            if (a.getProdotto().equals(p)) {
                count++;
            }
        }
        System.out.println("Il prodotto " + p.getNome() + " è stato venduto " + count + " volte");
    }

    public static void percentualeVendite(int mese, int anno, Prodotto p) {
        int count = 0;
        for (Acquisti a : acquisti) {
            if (a.getData().getYear() == anno && a.getData().getMonthValue() == mese && a.getProdotto().equals(p)) {
                count++;
            }
        }
        System.out.println("Il prodotto " + p.getNome() + " è stato venduto " + count + " volte");
        System.out.println("Il percentuale di vendita è: " + (count * 100 / acquisti.size()) + "%");
    }

    // broken
    public static void venditaStagionale (String stagione) {
        int[] autunno = {9, 10, 11};
        int[] inverno = {12, 1, 2};
        int[] primavera = {3, 4, 5};
        int[] estate = {6, 7, 8};

        HashMap<String, int[]> stagioni = new HashMap<>();
        stagioni.put("Autunno", autunno);
        stagioni.put("Inverno", inverno);
        stagioni.put("Primavera", primavera);
        stagioni.put("Estate", estate);

        int count = 0, max = 0, mese = 0;

        for (String s : stagioni.keySet()) {
            if (s.equals(stagione)) {
                mese = stagioni.get(s)[mese];
                for (Acquisti a : acquisti) {
                    if (a.getData().getMonthValue() == mese) {
                        count++;
                        if (count > max) {
                            max = count;
                        }
                    }
                }
            }
        }
        System.out.println("Il prodotto più venduto nella " + stagione + " è stato venduto " + count + " volte");

    }

}
