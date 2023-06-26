package blatt2a;

import java.util.Scanner;

/**
 * Aufgabe 1 - Erstellen Sie ein Jugendschutz-Programm, welches abhaengig von dem
 * Alter des Jugendlichen entscheidet, welche Waren der Jugendliche kaufen darf:
 * Bier und Wein ab 16 Jahren, Schnaps ab 18. Die unter 16 Jaehrigen sollen gar
 * keinen Alkohol bekommen. Als Resultat wird auf der Konsole angezeigt, was er
 * alles trinken darf oder nicht.
 * 
 * Der Wert fuer den Parameter alter wird per Scanner beim Aufruf des
 * Jugendschutz-Programms eingegeben.
 * 
 * Bestandteil der Aufgabe ist, dass Sie versuchen, verschiedene Typen von
 * Kontrollstrukturen einsetzen, um deren Vor- und Nachteile einschaetzen zu
 * lernen!
 */
public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Geben Sie das Alter der/des Jungendlichen ein: ");
		int alter = sc.nextInt();

		if (alter < 16) {
			System.out.println("Der Jugendliche darf keinen Alkohol bekommen.");
		} else if (alter < 18) {
			System.out.println("Der Jugendliche darf Bier und Wein bekommen, aber keinen Schnaps.");
		} else {
			System.out.println("Der Jugendliche darf Bier, Wein und Schnaps bekommen.");
		}

		System.out.println();
		System.out.println("*** Anzeige ***");
		System.out.println("Informieren: Alkohol? Kenn dein Limit.");
		System.out.println("Bundeszentrale fuer gesundheitliche Aufklaerung");
		System.out.println("https://www.kenn-dein-limit.de/");
		
		sc.close();
	}
}
