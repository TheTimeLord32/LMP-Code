package Esame_21_06_21;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Prodotto> prodotto = new ArrayList<>();
    private static ArrayList<Componente> componente = new ArrayList<>();

    public static void main(String[] args) {
        float coefficienteNegozio = 0.25F;

        componente.add(nuovoComponente("Tasti", "Azienda", 4, 12, 120));
        componente.add(nuovoComponente("PCB", "Azienda", 3, 10, 1));
        componente.add(nuovoComponente("Led", "Azienda", 2, 5, 120));

        prodotto.add(nuovoProdotto("Key01", "Tastiera", (calcoloTempo(componente) * coefficienteNegozio) + calcoloCosto(componente), 30, componente, calcoloTempo(componente), 10));

        System.out.println("Prodotto: " + prodotto);
        System.out.println("Percentuale guadagno: " + ranking(prodotto));
        listaProdotto(prodotto);
    }

    public static int calcoloTempo(ArrayList<Componente> comp) {
        int tempoMax = 0;
        for (Componente c : comp) {
            if (c.getGiorniOrdinazione() > tempoMax) {
                tempoMax = c.getGiorniOrdinazione();
            }
        }
        return tempoMax;
    }

    public static int calcoloCosto(ArrayList<Componente> comp) {
        int costoCompleto = 0;
        for (Componente c : comp) {
            costoCompleto += c.getCostoComponente();
        }
        return costoCompleto;
    }

    public static Componente nuovoComponente(String nome, String provenienza, int giorniOrdinazione, float costoComponente, int quantita) {
        return new Componente(nome, provenienza, giorniOrdinazione, costoComponente, quantita);
    }

    public static Prodotto nuovoProdotto(String id, String nome, float costoProduzione, float prezzo, ArrayList<Componente> componente, int giorniProduzione, int giorniRealizzazione) {
        return new Prodotto(id, nome, costoProduzione, prezzo, componente, giorniProduzione, giorniRealizzazione);
    }

    public static float ranking(ArrayList<Prodotto> prod) {
        float ranking = 0;
        for (Prodotto p : prod) {
            ranking += p.getPrezzo()/p.getGiorniRealizzazione();
        }
        return ranking;
    }

    public static void listaProdotto(ArrayList<Prodotto> prod) {
        for (Prodotto p : prod) {
            System.out.println("Nome: " + p.getNome() + ", Prezzo: " + p.getPrezzo() + ", Componenti: " + p.getComponente().stream().filter(componente1 -> Boolean.parseBoolean(componente1.getProvenienza())).toList());
        }
    }
}