package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
	
	// Definisco gli attributi del prodotto
	String marca, nome;
	Float prezzoBase;
	int IVA;
	
	// Importo il formato decimale per il prezzo
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
	public double calcolaPrezzoTotale () { // Imposto l'operazione per il calcolo del prezzo
	return prezzoBase + ((prezzoBase/100) * IVA);
	}
	
	public String toString() { // Imposto la stringa che restituisce il prezzo finale del prodotto
		return "Il prezzo finale del prodotto " + nome + "di marca " + marca + "è: " + df.format(calcolaPrezzoTotale());
	}
}
