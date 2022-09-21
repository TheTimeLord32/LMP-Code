package Soluzione_22_07_13;

import java.time.LocalDate;
import java.util.ArrayList;

public class Social {
	private ArrayList<ProfiloUtente> utenti;
	private ArrayList<ListaInteresse> listaI;
	
	protected Social(ArrayList<ProfiloUtente> utenti, ArrayList<ListaInteresse> listaI) {
		this.utenti = utenti;
		this.listaI = listaI;
	}
	
	//Insert a DB valore di ritorno per conferma
	public void registrazioneUtente(String nome, String cognome, LocalDate dataNascita, String mail) {
		utenti.add(new ProfiloUtente(nome,cognome,dataNascita,mail));
		
	}
	
	//delete a DB valore di ritorno per conferma
	public void eliminaProfiloUtente(ProfiloUtente u) {
			utenti.remove(u);
	}
	
	private ListaInteresse trovaListaFromName(String nomeLista) {
		int i=0;
		
		while(! listaI.get(i).getNome().equals(nomeLista)){
			i++;
		}
		
		if(listaI.get(i).getNome().equals(nomeLista)) {
			return listaI.get(i);
		}
		else {
			//System.out.println("La lista con quel nome non esiste");
			return null;
		}
		
		
	}
	
	private boolean isExistUtente(String nome) {
		int i=0;
		
		while(! utenti.get(i).getNome().equals(nome)){
			i++;
		}
		

		if( utenti.get(i).getNome().equals(nome)) {
			return true;
		}
		else {
			//System.out.println("Non esiste un utente con quel nome");
			return false;
		}		
	}
	
	public void registrazioneLista(String nome, String nomeLista) {
		if(isExistUtente(nome)) {
			try {
				trovaListaFromName(nomeLista).addUtente(nome);
				
			}catch(NullPointerException e) {
				System.out.println("La lista con quel nome non esiste");
			}
			
		}
		else {
			throw new NullPointerException("Non esiste un utente con quel nome");
		}
		
	}
		
	
	//Insert a DB valore di ritorno per conferma
	public void aggiungiAnnuncio(ProfiloUtente creatore, String titolo, String corpo, LocalDate data, String nomeLista) {
		
		if(creatore.getInteressi().contains(trovaListaFromName(nomeLista))) {
			try {
				trovaListaFromName(nomeLista).getAnnunci().add(new Annuncio(titolo,corpo,data,creatore));
			}catch(NullPointerException e) {
				System.out.println("La lista con quel nome non esiste");
			}
		}else{
			throw new NullPointerException("Non esiste un utente con quel nome");
		}
		
		
	}
	
	//Delete a DB valore di ritorno per conferma
	public void rimuoviAnnuncio(Annuncio a, String nomeLista, ProfiloUtente creatore) {
		if(creatore.equals(a.getCreatore())) {
			try {
				trovaListaFromName(nomeLista).getAnnunci().remove(a);
			}catch(NullPointerException e) {
				System.out.println("La lista con quel nome non esiste");
			}
		}
		else{
			System.out.println("L'utente non è il creatore dell'annuncio");
		}

	}


	public ArrayList<Annuncio> ricercaAnnuncio(String nomeAnnuncio) {
		ArrayList<Annuncio> tmp = new ArrayList<Annuncio>();

		for(ListaInteresse i : listaI ) {
			for(Annuncio j :  i.getAnnunci() ){
				if(j.getTitolo().contains(nomeAnnuncio) ) {
					tmp.add(j);
				}
			}
		}
		return tmp;
	}
}
