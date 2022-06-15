package jana60.shop;

public class Main {

	public static void main(String[] args) {
		
		// Definisco gli attributi dei singoli prodotti
		Prodotto cremaViso = new Prodotto("Nivea ", "crema per il viso ", 2.90f, 20);
		Prodotto dentifricio = new Prodotto("Sensodyne ", "dentifricio ", 1.99f, 18);
		Prodotto schiumaDaBarba = new Prodotto("Garnier ", "schiuma da barba ", 5.99f, 22);
		Prodotto saponeMani = new Prodotto("Borotalco ", "sapone per le mani ", 3.50f, 21);
		
		// Creo un array di prodotti
		Prodotto[] prodotti = new Prodotto [4];

		// Definisco i singoli elementi dell'array
		prodotti[0] = cremaViso;
		prodotti[1] = dentifricio;
		prodotti[2] = schiumaDaBarba;
		prodotti[3] = saponeMani;
		
		// Imposto il ciclo per la stampa dei prodotti con relativi prezzi
		for (int i=0; i<prodotti.length; i++) {
			
			System.out.println(prodotti[i].toString());
		}
	
	}

}
