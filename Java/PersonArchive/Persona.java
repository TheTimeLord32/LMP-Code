package PersonArchive;

import java.time.LocalDate;

public class Persona {
    private String nome, cognome, cf;
    private LocalDate dataNascita;

    public Persona(String nome, String cognome, String cf, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
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

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", cf='" + cf + '\'' +
                ", dataNascita=" + dataNascita +
                '}';
    }
}
