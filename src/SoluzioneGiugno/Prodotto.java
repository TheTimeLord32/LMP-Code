package SoluzioneGiugno;

public class Prodotto {
	
	private String nome;
	private CategoriaProdotti cat;
	private Destinatario dest;
	private Fornitore fornitore;
	private float prezzo;
	
	public Prodotto(String nome, CategoriaProdotti cat, Destinatario dest, Fornitore fornitore, float prezzo) {
		this.setNome(nome);
		this.setCat(cat);
		this.setDest(dest);
		this.setFornitore(fornitore);
		this.setPrezzo(prezzo);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CategoriaProdotti getCat() {
		return cat;
	}
	public void setCat(CategoriaProdotti cat) {
		this.cat = cat;
	}
	public Destinatario getDest() {
		return dest;
	}
	public void setDest(Destinatario dest) {
		this.dest = dest;
	}
	public Fornitore getFornitore() {
		return fornitore;
	}
	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	

}
