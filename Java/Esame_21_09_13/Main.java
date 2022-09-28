package Esame_21_09_13;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona elisabettaPersona = new Persona("Elisabetta", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26), LocalDate.of(2022,9,26));
        Persona filippoPersona = new Persona("Filippo", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26), LocalDate.of(2022,9,26));
        Persona carloPersona = new Persona("Carlo", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26));
        Persona dianaPersona = new Persona("Diana", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26), LocalDate.of(2022,9,26));
        Persona harryPersona = new Persona("Harry", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26));
        Persona williamPersona = new Persona("William", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26));
        Persona katePersona = new Persona("Kate", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26));
        Persona meghanPersona = new Persona("Meghan", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26));
        Persona georgePersona = new Persona("George", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26));
        Persona carolinaPersona = new Persona("Carolina", "Windsor", "ex-regina", "Londra", LocalDate.of(1926,9,26));

        Nodo<Persona> elisabettaNodo = new Nodo<>(elisabettaPersona, null, null, null, null, null);
        Nodo<Persona> filippoNodo = new Nodo<>(filippoPersona, null, null, null, null, null);
        Nodo<Persona> carloNodo = new Nodo<>(carloPersona, filippoNodo, elisabettaNodo, null, null, null);
        Nodo<Persona> dianaNodo = new Nodo<>(dianaPersona, null, null, null, null, null);

        Nodo<Persona> harryNodo = new Nodo<>(harryPersona, carloNodo, dianaNodo, null, null, null);
        Nodo<Persona> meghanNodo = new Nodo<>(meghanPersona, null, null, null, null, null);

        Nodo<Persona> williamNodo = new Nodo<>(williamPersona, carloNodo, dianaNodo, null, null, null);
        Nodo<Persona> kateNodo = new Nodo<>(katePersona, null, null, null, null, null);
        Nodo<Persona> georgeNodo = new Nodo<>(georgePersona, williamNodo, kateNodo, null, null, null);
        Nodo<Persona> carolinaNodo = new Nodo<>(carolinaPersona, williamNodo, kateNodo, null, null, null);

        elisabettaNodo.setFiglio1(carloNodo);
        elisabettaNodo.setRelazione(filippoNodo);
        filippoNodo.setFiglio1(carloNodo);

        carloNodo.setRelazione(dianaNodo);
        carloNodo.setFiglio1(harryNodo);
        dianaNodo.setFiglio1(harryNodo);
        carloNodo.setFiglio2(williamNodo);
        dianaNodo.setFiglio2(williamNodo);

        harryNodo.setRelazione(meghanNodo);
        harryNodo.setFiglio1(georgeNodo);
        harryNodo.setFiglio2(carolinaNodo);

        williamNodo.setRelazione(kateNodo);
        williamNodo.setFiglio1(georgeNodo);
        williamNodo.setFiglio2(carolinaNodo);
        kateNodo.setFiglio1(georgeNodo);
        kateNodo.setFiglio2(carolinaNodo);

        System.out.println("Profondità albero: \n");
        depthAlbero(elisabettaNodo, 0);

        System.out.println("\nRelazioni albero: \n");
        relazioneAlbero(williamNodo, 0);

        int x = 2;
        System.out.println("\nDiscendenti per " + x +" volte: \n");
        discendentiX(elisabettaNodo, x);
    }
    public static void depthAlbero(Nodo<Persona> nodo, int x){
        if (nodo != null) {
            System.out.println(nodo.getDato().getNome() + x);
            depthAlbero(nodo.getFiglio1(), x+1);
            depthAlbero(nodo.getFiglio2(), x+1);
        }
    }

    public static void relazioneAlbero(Nodo<Persona> nodo, int x){
         if (nodo != null) {
            System.out.println(nodo.getDato().getNome());
            relazioneAlbero(nodo.getRelazione(), x);
            relazioneAlbero(nodo.getPadre().getFiglio1(), x);

        }
    }

    public static void discendentiX(Nodo<Persona> nodo, int x){
        if (nodo != null && x >=0) {
            System.out.println(nodo.getDato().getNome() + x);
            discendentiX(nodo.getFiglio1(), x-1);
            discendentiX(nodo.getFiglio2(), x-1);
        }
    }
}
