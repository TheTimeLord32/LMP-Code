package Esame_21_07_08;

public class Prodotto {
    private String nome;
    public enum Categoria {
        calzature, magliette, intimo
    }
    private Categoria categoria;
    public enum Destinatario {
        uomo, donna, unisex
    }
    private Destinatario destinatario;
    private float prezzo;

    public Prodotto(String nome, Categoria categoria, Destinatario destinatario, float prezzo) {
        this.nome = nome;
        this.categoria = categoria;
        this.destinatario = destinatario;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", destinatario=" + destinatario +
                ", prezzo=" + prezzo +
                '}';
    }
}
