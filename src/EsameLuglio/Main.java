package EsameLuglio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static ArrayList<User> utenti = new ArrayList<>();
    public static ArrayList<ListaInteresse> listaInteresse = new ArrayList<>();
    public static HashMap<User, ListaInteresse> utentiInteresse = new HashMap<>();
    public static HashMap<ListaInteresse, Annuncio> annunciLista = new HashMap<>();

    public static void main(String[] args) {
        registraUtente("Mario", "Rossi", "mariorossi@gmail.com",  LocalDate.of(1990, 10, 10));
        registraUtente("Giova", "Bianchi", "giovabianchi@gmail.com",  LocalDate.of(1990, 10, 10));
        registraUtente("Tizio", "Miles", "tiziomiles@gmail.com",  LocalDate.of(1990, 10, 10));
        System.out.println("Utenti: ");
        stampaUtente();
        deleteUtente(0);

        System.out.println("Utenti delete: ");
        stampaUtente();

        creaListaInteresse("Film");
        creaListaInteresse("Sport");
        creaListaInteresse("Musica");
        stampaListaInteresse();

        linkUserLista(0, 2);
        linkUserLista(1, 2);
        System.out.println("Utenti in lista: " + utentiInteresse);

        System.out.println("Utente esistente: " + controllaUtente(utenti.get(0).getEmail()));

        annuncioInLista(2, "Chitarra", "Vendo chitarra", LocalDate.now(), utenti.get(0).getNome());

        System.out.println("Annunci: " + annunciLista);

        System.out.println("Cerco annunci per chitarra...");
        cercaAnnuncio("Chitarra");

        System.out.println("Elimino annuncio chitarra");
        deleteAnnuncio(2);
        System.out.println("Annunci: " + annunciLista);

    }

    // registra utenti
    private static void registraUtente(String nome, String cognome, String email, LocalDate data){
        utenti.add(new User(nome, cognome, email, data));
    }

    // stampa utenti
    private static void stampaUtente() {
        for (User u : utenti) {
            System.out.println(u);
        }
    }

    // elimina utenti
    private static void deleteUtente(int index) {
        utenti.remove(index);
    }

    // crea listaInteresse
    private static void creaListaInteresse(String interesse){
        listaInteresse.add(new ListaInteresse(interesse));
    }

    // stampa listaInteresse
    private static void stampaListaInteresse(){
        System.out.println("Lista interesse completi: " + listaInteresse.toString());
    }

    // collega utenti a lista
    private static void linkUserLista(int indexUser, int indexInteresse){
        utentiInteresse.put(utenti.get(indexUser), listaInteresse.get(indexInteresse));
    }

    // controlla utente registrato
    private static boolean controllaUtente(String email){
        for (User u : utenti) {
            if (u.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    // annuncio in lista
    private static void annuncioInLista(int indexLista, String titolo, String corpo, LocalDate data, String autore){
        annunciLista.put(listaInteresse.get(indexLista), new Annuncio(titolo, corpo, data, autore));
    }

    private static void deleteAnnuncio(int indexLista){
        annunciLista.remove(listaInteresse.get(indexLista));
    }

    private static void cercaAnnuncio(String titolo){
        for (Annuncio a : annunciLista.values()) {
            if (a.toString().contains(titolo)) {
                System.out.println(a);
            }else{
                System.out.println("Nessun annuncio trovato");
            }
        }
    }
}
