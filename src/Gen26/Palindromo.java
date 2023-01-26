package Gen26;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inizializziamo una variabile maxPalindrome con valore 0
		int maxPalindrome = 0;

		// ciclo esterno che va da 999 fino a 100 (in ordine decrescente)
		for (int i = 999; i >= 100; i--) {
			// ciclo interno che va da i fino a 100 (in ordine decrescente)
			for (int j = i; j >= 100; j--) {
				// calcoliamo il prodotto di i*j
				int product = i * j;
				// convertiamo il prodotto in una stringa
				String productString = Integer.toString(product);
				// creiamo un oggetto StringBuilder a partire dalla stringa del prodotto
				StringBuilder productBuilder = new StringBuilder(productString);
				// se la stringa del prodotto è uguale alla sua versione invertita (palindromo)
				if (productString.equals(productBuilder.reverse().toString())) {
					// aggiorniamo la variabile maxPalindrome con il valore massimo tra il suo
					// valore attuale e il prodotto
					maxPalindrome = Math.max(maxPalindrome, product);
					// esci dal ciclo interno
					break;
				}
			}
			// se maxPalindrome è maggiore di i*999 esci dal ciclo esterno
			if (maxPalindrome > i * 999)
				break;
		}

		// stampiamo il risultato
		System.out
				.println("Il più grande palindromo ottenuto dal prodotto di due numeri a 3 cifre è: " + maxPalindrome);
	}

}


