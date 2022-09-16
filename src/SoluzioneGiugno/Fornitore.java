package SoluzioneGiugno;

public class Fornitore {
	private String nome;
	private String ptva;
	private int qtaProdotti;
	
	//Di solito metto i set nel costruttore non lo faccio per una questione di tempo
	public Fornitore(String nome, String ptva, int qtaProdotti) {
		this.nome = nome;
		this.ptva = ptva;
		this.qtaProdotti = qtaProdotti;
	}
		
	protected Fornitore() {
		super();
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPtva() {
		return ptva;
	}
	public void setPtva(String ptva) {
		this.ptva = ptva;
	}
	public int getQtaProdotti() {
		return qtaProdotti;
	}
	public void setQtaProdotti(int qtaProdotti) {
		this.qtaProdotti = qtaProdotti;
	}
	
	
	
	
}
