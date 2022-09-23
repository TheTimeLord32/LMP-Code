package Esame_21_06_21;

public class Componente {
    private String nome, provenienza;
    private int giorniOrdinazione;
    private float costoComponente;
    private int quantita;

    public Componente(String nome, String provenienza, int tempoOrdinazione, float costoProduzione, int quantita) {
        this.nome = nome;
        this.provenienza = provenienza;
        this.giorniOrdinazione = tempoOrdinazione;
        this.costoComponente = costoProduzione;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    public int getGiorniOrdinazione() {
        return giorniOrdinazione;
    }

    public void setGiorniOrdinazione(int giorniOrdinazione) {
        this.giorniOrdinazione = giorniOrdinazione;
    }

    public float getCostoComponente() {
        return costoComponente;
    }

    public void setCostoComponente(float costoComponente) {
        this.costoComponente = costoComponente;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Componente{" +
                "nome='" + nome + '\'' +
                ", provenienza='" + provenienza + '\'' +
                ", giorniOrdinazione=" + giorniOrdinazione +
                ", costoProduzione=" + costoComponente +
                ", quantita=" + quantita +
                '}';
    }
}
