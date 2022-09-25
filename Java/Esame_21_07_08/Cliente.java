package Esame_21_07_08;

public class Cliente {
    private String nome, email, ptIVA;

    public enum Tipologia {
        privati, professionista, società
    }
    private Tipologia tipoCliente;

    public Cliente(String nome, String email, String ptIVA, Tipologia tipoCliente) {
        this.nome = nome;
        this.email = email;
        this.ptIVA = ptIVA;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPtIVA() {
        return ptIVA;
    }

    public void setPtIVA(String ptIVA) {
        this.ptIVA = ptIVA;
    }

    public Tipologia getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Tipologia tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", ptIVA='" + ptIVA + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }
}
