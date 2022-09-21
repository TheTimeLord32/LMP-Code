package Soluzione_22_07_13;

import java.time.LocalDate;

public class Annuncio {
	private String titolo;
	private String corpo;
	private LocalDate data;
	private ProfiloUtente creatore;
	
	public Annuncio(String titolo, String corpo, LocalDate data, ProfiloUtente creatore) {
		this.titolo = titolo;
		this.corpo = corpo;
		this.data = data;
		this.creatore = creatore;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	public ProfiloUtente getCreatore() {
		return creatore;
	}

	public void setCreatore(ProfiloUtente creatore) {
		this.creatore = creatore;
	}
	
}
