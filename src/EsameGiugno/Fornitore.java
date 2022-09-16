package EsameGiugno;

public class Fornitore {
    private String nome, pIva;
    private int quantitaVendute;

    public Fornitore(String nome, String pIva, int quantitaVendute) {
        this.nome = nome;
        this.pIva = pIva;
        this.quantitaVendute = quantitaVendute;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public int getQuantitaVendute() {
        return quantitaVendute;
    }

    public void setQuantitaVendute(int quantitaVendute) {
        this.quantitaVendute = quantitaVendute;
    }
}
