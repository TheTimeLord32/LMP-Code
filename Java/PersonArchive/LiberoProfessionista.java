package PersonArchive;

import java.time.LocalDate;

public class LiberoProfessionista extends Persona{
    private String professione, pIva;

    public LiberoProfessionista(String nome, String cognome, String cf, LocalDate dataNascita, String professione, String pIva) {
        super(nome, cognome, cf, dataNascita);
        this.professione = professione;
        this.pIva = pIva;
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

    public String getProfessione() {
        return professione;
    }

    public void setProfessione(String professione) {
        this.professione = professione;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    @Override
    public String toString() {
        return super.toString()+
                "LiberoProfessionista{" +
                "professione='" + professione + '\'' +
                ", pIva='" + pIva + '\'' +
                '}';
    }
}
