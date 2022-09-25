package Soluzione_22_07_13;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListaInteresse {
	private String nome;
	private ArrayList<Annuncio> annunci;
	private ArrayList<String> registrati;
	
	
	ListaInteresse(String nome) {
		this.nome = nome;
		this.annunci =new  ArrayList<Annuncio>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public ArrayList<Annuncio> getAnnunci() {
		return annunci;
	}

	public void addAnnunci(String titolo, String corpo, LocalDate data, ProfiloUtente creatore) {
		annunci.add(new Annuncio(titolo, corpo, data, creatore));
		
	}

	public ArrayList<String> getRegistrati() {
		return registrati;
	}
	
	public void addUtente(String nome) {
		registrati.add(nome);
		
	}
	
	
	
	

}
