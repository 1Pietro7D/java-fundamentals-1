package org.java.sondaggio.OS;

public class JavaSondaggioOS {
	static int windows = 150;
	static int mac = 120;
	static int linus = 75;
	static int total = windows + mac + linus;
	public static void main(String[] args) {
		
		double average_mac = (double) (mac * 100) / total;
		System.out.println("La percentuale di utenti Mac è del: " + average_mac + "%");
		double average_windows = (double) (windows * 100) / total;
		System.out.println("La percentuale di utenti Windows è del: " + average_windows + "%");	
		double average_linus = (double) (linus * 100) / total;
		System.out.println("La percentuale di utenti Linus è del: " + average_linus + "%");	
		
	}
}

/*
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

Edge cases... Max of long (from 2^63-1 to 2^63) if converted to double returns a non-equivalent value, to avoid such a bug the value of 2^53 in long should not be exceeded
*/

/**
*Facciamo un sondaggio tra gli studenti di quale sistema operativo usano
e popoliamo delle variabili 
Usiamo le variabili per fare semplici calcoli (es. percentuale) 
eventualmente applicando casting tra int e double
*/