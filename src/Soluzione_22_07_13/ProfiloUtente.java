package Soluzione_22_07_13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class ProfiloUtente {
	private String nome;
	private String  cognome;
	private LocalDate dataNascita;
	private String mail;
	
	private ArrayList<ProfiloUtente> amici;
	private ArrayList<ListaInteresse> interessi;
	// 1 richiesta accettata , 0 richiesta rifiutata
	private HashMap<ProfiloUtente, Integer> richieste;
		
	public ProfiloUtente(String nome, String cognome, LocalDate dataNascita, String mail) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.mail = mail;
		this.amici = new ArrayList<ProfiloUtente>();
		this.richieste = new HashMap<ProfiloUtente, Integer>();
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

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public ArrayList<ProfiloUtente> getAmici() {
		return amici;
	}
	
	
	public ArrayList<ListaInteresse> getInteressi() {
		return interessi;
	}

	public int richiestaAmicizia(ProfiloUtente richiedente,int response) {
		
		if(response ==1) {
			richieste.put(richiedente, 1);
			amici.add(richiedente);
			return 1;
		}
		else {
			richieste.put(richiedente, 0);
			return 0;
		}
		
	}
	
	public HashMap<ProfiloUtente, Integer> getRichieste() {
		return richieste;
	}

	public void aggiungiInteresse(ListaInteresse a) {
		
		this.interessi.add(a);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amici, cognome, dataNascita, interessi, mail, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfiloUtente other = (ProfiloUtente) obj;
		return Objects.equals(amici, other.amici) && Objects.equals(cognome, other.cognome)
				&& Objects.equals(dataNascita, other.dataNascita) && Objects.equals(interessi, other.interessi)
				&& Objects.equals(mail, other.mail) && Objects.equals(nome, other.nome);
	}
	
	

}
