package it.shop;

public class Main {

	public static void main(String[] args) {
		
		String[] listaOggetti = {"acqua", "carne", "pane"};
		double[] listaPrezzi = {0.5, 4.7, 2.0};
		Prodotto[] scaffale = new Prodotto[listaOggetti.length];
		if (listaOggetti.length == listaPrezzi.length) {
			for (int i = 0;i < listaOggetti.length; i++) {
				scaffale[i] = new Prodotto(listaOggetti[i], listaPrezzi[i]);
				
			}
			
		}
		String[] descrizione = new String[listaOggetti.length];
		for (int j = 0; j < scaffale.length; j++) {
			System.out.println("Il prezzo di " + scaffale[j].getNome() + " è " + scaffale[j].getPrezzo() + "€");
			System.out.println(",il codice è " + scaffale[j].codice() );
			System.out.println(",il nome esteso è " + scaffale[j].nomeEsteso());
			descrizione[j]  = scaffale[j].inserisciDescrizione();
			
		}
		
		System.out.println("La descrizione dell'acqua è : " + descrizione[0]);
	}

}
