package PersonArchive;

import java.time.LocalDate;

public class Impiegato extends Persona{
    private String matricola, mansione;
    private int livello;

    public Impiegato(String nome, String cognome, String cf, LocalDate dataNascita, String matricola, String mansione, int livello) {
        super(nome, cognome, cf, dataNascita);
        this.matricola = matricola;
        this.mansione = mansione;
        this.livello = livello;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getCognome() {
        return super.getCognome();
    }

    @Override
    public void setCognome(String cognome) {
        super.setCognome(cognome);
    }

    @Override
    public String getCf() {
        return super.getCf();
    }

    @Override
    public void setCf(String cf) {
        super.setCf(cf);
    }

    @Override
    public LocalDate getDataNascita() {
        return super.getDataNascita();
    }

    @Override
    public void setDataNascita(LocalDate dataNascita) {
        super.setDataNascita(dataNascita);
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getMansione() {
        return mansione;
    }

    public void setMansione(String mansione) {
        this.mansione = mansione;
    }

    public int getLivello() {
        return livello;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Impiegato{" +
                "matricola='" + matricola + '\'' +
                ", mansione='" + mansione + '\'' +
                ", livello=" + livello +
                '}';
    }
}
