package SoluzioneGiugno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Acquisto {
	private LocalDate data;
	// Se compro n prodotti uguali verranno scritti n volte nell'arraylist
	private ArrayList<Prodotto> prodotti;
	private Cliente cliente;
	
	public Acquisto(LocalDate data, Cliente cliente) {
		this.setData(data);
		this.prodotti = new ArrayList<Prodotto>();
		this.setCliente(cliente);
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	protected ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}
	protected void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	
	//Parametri prodotto e non prodotto in blocco
	public void addProdotti(Prodotto app) {
		this.prodotti.add(app);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
