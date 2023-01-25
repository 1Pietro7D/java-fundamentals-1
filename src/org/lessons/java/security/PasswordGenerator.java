package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	static String name;
	static String lastname;
	static String favoriteColor;
	static short dayBirth;
	static short monthBirth;
	static short yearBirth;

	public static void main(String[] args) {
		// SCANNER
		Scanner sc = new Scanner(System.in);
		System.out.print("name?");
		name = sc.nextLine();
		System.out.print("lastname?");
		lastname = sc.nextLine();
		System.out.print("favourite color?");
		favoriteColor = sc.nextLine();
		System.out.print("day of birth?");
		dayBirth = sc.nextShort();
		System.out.print("month of birth?");
		monthBirth = sc.nextShort();
		System.out.print("year of birth?");
		yearBirth = sc.nextShort();
		sc.close();
		Short[] DOB = { dayBirth, monthBirth, yearBirth };
		System.out.print(name + "-" + lastname + "-" + favoriteColor);
		for (short n : DOB) {
			System.out.print("-");
			System.out.print(n);			
		}
		System.out.println("");

	}
}

/*
 * Il programma deve fare quanto segue: 1-salvare in opportune variabili il
 * nome, cognome, colore preferito e data di nascita di un utente suddivisa in
 * giorno, mese e anno in numero generare (e stampare a video) una password
 * concatenando nome, cognome, colore preferito e somma di giorno, mese e anno
 * di nascita, separate dal carattere - Esempio: ho un utente che si chiama
 * Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta La sua
 * password sarà Pinco-Pallo-magenta- 2011
 * 
 */