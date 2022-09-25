package Esercizio1;

public class Automobile {
    private String marca, nome;
    private int cilindrata, serbatoio;
    private int chilometriLitro;

    public Automobile(String marca, String nome, int cilindrata, int serbatoio, int chilometriLitro) {
        this.marca = marca;
        this.nome = nome;
        this.cilindrata = cilindrata;
        this.serbatoio = serbatoio;
        this.chilometriLitro = chilometriLitro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getSerbatoio() {
        return serbatoio;
    }

    public void setSerbatoio(int serbatoio) {
        this.serbatoio = serbatoio;
    }

    public int getChilometriLitro() {
        return chilometriLitro;
    }

    public void setChilometriLitro(int chilometriLitro) {
        this.chilometriLitro = chilometriLitro;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", cilindrata=" + cilindrata +
                ", serbatoio=" + serbatoio +
                ", chilometriLitro=" + chilometriLitro +
                '}';
    }
}
