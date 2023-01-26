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
		sc.close();

		double priceTicket = 0.21d;
		int sale20= 20;
		int sale40= 40;
		double totalPrice =  priceTicket * userKm;
		double discountPrice =0 ;

		if (age < 18)
		discountPrice = totalPrice *  sale20 / 100;
		else if (age>65)
		discountPrice = totalPrice *  sale40 / 100;
			
		totalPrice = totalPrice - discountPrice;
		
		System.out.println("il costo del tuo biglietto è di " + String.format("%.2f", totalPrice) + "€");
	}

}

/*
 * 
 * Biglietto del treno: Il programma dovrà chiedere all’utente il numero di
 * chilometri
 * 
 * che vuole percorrere e l’età del passeggero. Sulla base di queste
 * informazioni dovrà
 * 
 * calcolare il prezzo totale del viaggio, secondo queste regole: il prezzo del
 * biglietto
 * 
 * è definito in base ai km (0.21 € al km) va applicato uno sconto del 20% per i
 * minorenni
 * 
 * va applicato uno sconto del 40% per gli over 65
 * 
 * Per acquisire l’input dell’utente usate la classe Scanner, come visto
 * 
 * stamattina a lezione.
 */
