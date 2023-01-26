package Gen26;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] partecipants = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
				"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };
		Scanner s = new Scanner(System.in);
		System.out.print("What your name? -> ");
		String username = s.nextLine();
		s.close();

		if (Arrays.asList(partecipants).contains(username)) {
			System.out.println("You are welcome");
		} else {
			System.out.println("You can't enter");

		}

	}

}
