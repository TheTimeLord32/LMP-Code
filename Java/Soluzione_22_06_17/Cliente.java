package Soluzione_22_06_17;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String cognome;
	private String cF;
	private String indirizzo;
	private ArrayList<Acquisto> aquisti;
	private LocalDate DataPrimoAcquisto;
	private LocalDate DataUltimoAcquisto;
	
	public Cliente(String nome, String cognome, String cF, String indirizzo) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setcF(cF);
		this.setIndirizzo(indirizzo);
		this.aquisti = new ArrayList<Acquisto>();
		this.setDataPrimoAcquisto(LocalDate.now());
		this.setDataUltimoAcquisto(LocalDate.now());
	}

    public Cliente(String nome, String email) {
    }

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getcF() {
		return cF;
	}
	public void setcF(String cF) {
		this.cF = cF;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	protected ArrayList<Acquisto> getAquisti() {
		return aquisti;
	}
	protected void setAquisti(ArrayList<Acquisto> aquisti) {
		this.aquisti = aquisti;
	}
	
	//Non l'acquisto in blocco ma i singoli parametri
	public void addAcquisti(Acquisto app) {
		this.aquisti.add(app);
		this.setDataUltimoAcquisto(LocalDate.now());
	}

	public LocalDate getDataPrimoAcquisto() {
		return DataPrimoAcquisto;
	}

	private void setDataPrimoAcquisto(LocalDate dataPrimoAcquisto) {
		DataPrimoAcquisto = dataPrimoAcquisto;
	}
	
	public int qtaAcquisti() {
		return this.aquisti.size();
	}

	public LocalDate getDataUltimoAcquisto() {
		return DataUltimoAcquisto;
	}

	private void setDataUltimoAcquisto(LocalDate dataUltimoAcquisto) {
		DataUltimoAcquisto = dataUltimoAcquisto;
	}
	
	
	
	
		
	
}
