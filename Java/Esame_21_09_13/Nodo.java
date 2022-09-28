package Esame_21_09_13;

public class Nodo <T>{
    private T dato;
    private Nodo<T> padre, madre, relazione, figlio1, figlio2;

    public Nodo(T dato, Nodo<T> padre, Nodo<T> madre, Nodo<T> relazione, Nodo<T> figlio1, Nodo<T> figlio2) {
        this.dato = dato;
        this.padre = padre;
        this.madre = madre;
        this.relazione = relazione;
        this.figlio1 = figlio1;
        this.figlio2 = figlio2;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getPadre() {
        return padre;
    }

    public void setPadre(Nodo<T> padre) {
        this.padre = padre;
    }

    public Nodo<T> getMadre() {
        return madre;
    }

    public void setMadre(Nodo<T> madre) {
        this.madre = madre;
    }

    public Nodo<T> getRelazione() {
        return relazione;
    }

    public void setRelazione(Nodo<T> relazione) {
        this.relazione = relazione;
    }

    public Nodo<T> getFiglio1() {
        return figlio1;
    }

    public void setFiglio1(Nodo<T> figlio1) {
        this.figlio1 = figlio1;
    }

    public Nodo<T> getFiglio2() {
        return figlio2;
    }

    public void setFiglio2(Nodo<T> figlio2) {
        this.figlio2 = figlio2;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", padre=" + padre +
                ", madre=" + madre +
                ", relazione=" + relazione +
                ", figlio1=" + figlio1 +
                ", figlio2=" + figlio2 +
                '}';
    }
}
