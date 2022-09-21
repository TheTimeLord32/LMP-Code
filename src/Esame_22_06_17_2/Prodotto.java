package Esame_22_06_17_2;

public class Prodotto {
    private String nome;
    private Fornitore fornitore;
    private float prezzo;
    public enum Categoria {
        calzature, magliette, intimo
    }
    public enum Destinatario {
        uomo, donna, unisex
    }
    private Categoria categoria;
    private Destinatario destinatario;

    public Prodotto(String nome, float prezzo, Categoria categoria, Destinatario destinatario, Fornitore fornitore) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.categoria = categoria;
        this.destinatario = destinatario;
        this.fornitore = fornitore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Fornitore getFornitore() {
        return fornitore;
    }

    public void setFornitore(Fornitore fornitore) {
        this.fornitore = fornitore;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", categoria=" + categoria +
                ", destinatario=" + destinatario +
                ", fornitore='" + fornitore + '\'' +
                '}';
    }
}
