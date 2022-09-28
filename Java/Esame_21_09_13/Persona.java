package Esame_21_09_13;

import java.time.LocalDate;

public class Persona {
    private String nome, cognome, cf, luogoNascita;
    private LocalDate dataNascita, dataMorte;

    public Persona(String nome, String cognome, String cf, String luogoNascita, LocalDate dataNascita, LocalDate dataMorte) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.luogoNascita = luogoNascita;
        this.dataNascita = dataNascita;
        this.dataMorte = dataMorte;
    }

    public Persona(String nome, String cognome, String cf, String luogoNascita, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.luogoNascita = luogoNascita;
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public LocalDate getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(LocalDate dataMorte) {
        this.dataMorte = dataMorte;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", cf='" + cf + '\'' +
                ", luogoNascita='" + luogoNascita + '\'' +
                ", dataNascita=" + dataNascita +
                ", dataMorte=" + dataMorte +
                '}';
    }
}
