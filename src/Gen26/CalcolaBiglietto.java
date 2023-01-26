package Gen26;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("how many kilometers can you travel? -> ");
		double userKm = Double.parseDouble(sc.nextLine().replace(",", "."));
		System.out.print("how old are you? -> ");
		int age = Integer.parseInt(sc.nextLine());
		
		double priceTicket = 0.21d;
		
		System.out.println(userKm);
		System.out.println(age);
		System.out.println(priceTicket);
	}

}

/*
 * 
 * Biglietto del treno: Il programma dovrà chiedere all’utente il numero di chilometri 
 * 
 * che vuole percorrere e l’età del passeggero. Sulla base di queste informazioni dovrà
 * 
 *  calcolare il prezzo totale del viaggio, secondo queste regole: il prezzo del biglietto
 *  
 *   è definito in base ai km (0.21 € al km) va applicato uno sconto del 20% per i minorenni
 *   
 *    va applicato uno sconto del 40% per gli over 65 
 *    
 *    Per acquisire l’input dell’utente usate la classe Scanner, come visto
 *       
 *        stamattina a lezione.
 */
 