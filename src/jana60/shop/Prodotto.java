package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
	
	// Attributi
	String marca, nome;
	Float prezzoBase;
	int IVA;
	
	DecimalFormat df= new DecimalFormat ("#0.00€"); 

	
	// Costruttori	
	public Prodotto (String marca, String nome, Float prezzoBase, int iVA) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.prezzoBase = prezzoBase;
		this.IVA = iVA;
	}
	
	
	// Metodi
	public float calcolaPrezzoTotale () {
	return prezzoBase + ((prezzoBase/100) * IVA);
	}
	
	public String toString() {
		return "Il prezzo finale del prodotto " + nome + "di marca " + marca + "è: " + df.format(calcolaPrezzoTotale());
	}
}
