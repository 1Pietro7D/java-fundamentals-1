package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	static String name;
	static String lastname;
	static String favoriteColor;
	static short day_of_birth;
	static short month_of_birth;
	static short year_of_birth;
	//DOB contains the single variables for the date
	//Short[] DOB = {day_of_birth,month_of_birth,year_of_birth};

		public static void main(String[] args) {
		/*
		year_of_birth=2000;
		Short[] DOB = {day_of_birth,month_of_birth,year_of_birth};
		System.out.println(DOB[2]); // first test */
		//SCANNER
		Scanner sc= new Scanner(System.in);
		System.out.print("name?");
		name = sc.nextLine();
		System.out.print("lastname?");
		lastname = sc.nextLine();
		System.out.print("favourite color?");
		favoriteColor = sc.nextLine();
		sc.close();
		System.out.println(name+"-"+lastname+"-"+favoriteColor);
	}
}

/*
Il programma deve fare quanto segue:
1-salvare in opportune variabili il nome, cognome, colore preferito e data 
di nascita di un utente suddivisa in giorno, mese e anno 
in numero generare (e stampare a video) una password concatenando nome,
cognome, colore preferito e somma di giorno, mese e anno di nascita, separate
dal carattere -
Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il 
cui colore preferito è il magenta La sua password sarà Pinco-Pallo-magenta-
2011

*/