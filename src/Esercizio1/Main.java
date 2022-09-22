package Esercizio1;

import java.util.ArrayList;

public class Main {

    private static final ArrayList<Automobile> auto = new ArrayList<>();

    public static void main(String[] args) {
        creaAuto("Ford", "Mustang GT", 3000, 80, 30);
        creaAuto(auto.get(0).getMarca(), auto.get(0).getMarca(), 4000, auto.get(0).getSerbatoio(), auto.get(0).getChilometriLitro());

        System.out.println(auto);
        autonomia();
    }

    public static void creaAuto(String marca, String nome, int cilindrata, int serbatoio, int chilometriLitro){
        auto.add(new Automobile(marca, nome, cilindrata, serbatoio, chilometriLitro));
    }

    public static void autonomia() {
        for (Automobile a : auto) {
            System.out.println("Autonomia per " + a.getNome() + " | " + a.getCilindrata()+  ": "+ a.getSerbatoio() * a.getChilometriLitro() + " km");
        }
    }

}
