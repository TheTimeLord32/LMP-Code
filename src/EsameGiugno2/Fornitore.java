package EsameGiugno2;

public class Fornitore {
    private String nome;
    private String prodotto;
    private int quantita;

    public Fornitore(String nome, String prodotto, int quantita) {
        this.nome = nome;
        this.prodotto = prodotto;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProdotto() {
        return prodotto;
    }

    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Fornitore{" +
                "nome='" + nome + '\'' +
                ", prodotto=" + prodotto +
                ", quantita=" + quantita +
                '}';
    }
}
