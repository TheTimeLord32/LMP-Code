package SoluzioneGiugno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Negozio {
	
	private ArrayList<Acquisto> elencoAcquisti;
	private ArrayList<Fornitore> elencoFornitori;
	private ArrayList<Cliente> elencoClienti;
	
	public ArrayList<Acquisto> getElencoAcquisti() {
		return elencoAcquisti;
	}

	public void setElencoAcquisti(ArrayList<Acquisto> elencoAcquisti) {
		this.elencoAcquisti = elencoAcquisti;
	}
	
	public ArrayList<Fornitore> getElencoFornitori() {
		return elencoFornitori;
	}

	public void setElencoFornitori(ArrayList<Fornitore> elencoFornitori) {
		this.elencoFornitori = elencoFornitori;
	}
	
	public ArrayList<Cliente> getElencoClienti() {
		return elencoClienti;
	}

	public void setElencoClienti(ArrayList<Cliente> elencoClienti) {
		this.elencoClienti = elencoClienti;
	}

	public ArrayList<Prodotto> prodottiClienteData (LocalDate data, Cliente cliente){
		ArrayList<Prodotto> prodottiC = new ArrayList<Prodotto>();
		for(Acquisto i : this.getElencoAcquisti()) {
			if(i.getData().equals(data) && i.getCliente().equals(cliente)) {
				prodottiC.addAll(i.getProdotti());
			}
		}
		return prodottiC;
	}
	
	public int qtaProdotto (Prodotto pr) {
		int count =0;
		for(Acquisto i : this.getElencoAcquisti()) {
			for(Prodotto j : i.getProdotti()) {
				
				if(j.getNome().equals(pr.getNome())) {
					count ++;
				}
			}
		}		
		
		return count;
	}
	
	private int qtaProdottiVendutiPerFornitore(Fornitore fr) {
		int qta=0;
		for(Acquisto i : this.getElencoAcquisti()) {
			for(Prodotto j : i.getProdotti()) {
				
				if(j.getFornitore().equals(fr)) {
					qta ++;
				}
			}
		}		
		return qta;
	}
	
	public Fornitore fornitoreVincente() {
		Fornitore win = new Fornitore();;
		int qtaProdotti = 0;
		float valoreNormalizzato = 0;
		float valoreNormalizzatoMax = 0;
		for (Fornitore i: this.getElencoFornitori()){
			qtaProdotti =  this.qtaProdottiVendutiPerFornitore(i);
			valoreNormalizzato = qtaProdotti / (i.getQtaProdotti());
			if(valoreNormalizzatoMax < valoreNormalizzato) {
				win = i;
			}
		}
		
		return win;
	}
	
	public int prodottiInAnno (int anno) {
		int qta=0;
		for(Acquisto i : this.getElencoAcquisti()) {
			if(i.getData().getYear() == anno) {
				qta = i.getProdotti().size();
			}
		}
		return qta;
	}
	
	public ArrayList<Cliente> vip (){
		ArrayList<Cliente> vip = new ArrayList<Cliente>();
		int punteggioI = 0;
		int punteggioJ = 0;
		for(int i=0; i< this.getElencoClienti().size() ; i++) {
			
			if ( this.getElencoClienti().get(i).getDataPrimoAcquisto().getYear() 
					> this.getElencoClienti().get(i+1).getDataPrimoAcquisto().getYear()) {
				punteggioI ++;
			}
			else {
				punteggioJ++;
			}
			
			if ( this.getElencoClienti().get(i).getDataUltimoAcquisto().getYear() 
					> this.getElencoClienti().get(i+1).getDataUltimoAcquisto().getYear()) {
				punteggioI = punteggioI + 2;
			}
			else {
				punteggioJ = punteggioJ + 2;
			}
			
			if ( this.getElencoClienti().get(i).qtaAcquisti()
					> this.getElencoClienti().get(i+1).qtaAcquisti()) {
				punteggioI = punteggioI + 3;
			}
			else {
				punteggioJ = punteggioJ + 3;
			}
			
			if(!(vip.contains(this.getElencoClienti().get(i))) && punteggioI >= 4) {
				vip.add(this.getElencoClienti().get(i));
			}
			
			if(!(vip.contains(this.getElencoClienti().get(i))) && punteggioJ >= 4) {
				vip.add(this.getElencoClienti().get(i));
			}
			
		}
		
		
		return vip;
	}

}
