package Esercizio2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Classe {
    private String nome;
    private int dataFormazione;
    private ArrayList<Studente> studente;

    public Classe(String nome, int dataFormazione, ArrayList<Studente> studente) {
        this.nome = nome;
        this.dataFormazione = dataFormazione;
        this.studente = studente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataFormazione() {
        return dataFormazione;
    }

    public void setDataFormazione(int dataFormazione) {
        this.dataFormazione = dataFormazione;
    }

    public ArrayList<Studente> getStudente() {
        return studente;
    }

    public void setStudente(ArrayList<Studente> studente) {
        this.studente = studente;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "nome='" + nome + '\'' +
                ", dataFormazione=" + dataFormazione +
                ", studente=" + studente +
                '}';
    }
}
