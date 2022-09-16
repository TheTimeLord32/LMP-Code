package EsameGiugno;

public class Prodotto {
    private String nome;
    private Fornitore fornitore;
    private float prezzo;
    public enum CategoriaProdotti {
        calzature, magliette, intimo
    }
    private CategoriaProdotti categoria;

    public enum Destinatario {
        uomo, donna, unisex
    }
    private Destinatario destinatario;

    public Prodotto(String nome, Fornitore fornitore, float prezzo, CategoriaProdotti categoria, Destinatario destinatario) {
        this.nome = nome;
        this.fornitore = fornitore;
        this.prezzo = prezzo;
        this.categoria = categoria;
        this.destinatario = destinatario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fornitore getFornitore() {
        return fornitore;
    }

    public void setFornitore(Fornitore fornitore) {
        this.fornitore = fornitore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public CategoriaProdotti getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProdotti categoria) {
        this.categoria = categoria;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }
}
