package EsameLuglio;

public class ListaInteresse {
    private String interesse;

    public ListaInteresse(String interesse) {
        this.interesse = interesse;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    @Override
    public String toString() {
        return getInteresse();
    }
}
