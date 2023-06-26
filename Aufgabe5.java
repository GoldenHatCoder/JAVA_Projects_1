package blatt2a;

import java.util.Scanner;

/**
 * Aufgabe 5 - Schreiben Sie ein Programm, das Kontostaende waehrend der
 * Programmausfuehrung von der Tastatur einliest. Kontostaende ueber 100 Euro
 * werden wie eingelesen angezeigt. Bei Kontostaenden kleiner gleich 100 Euro
 * wird der Differenzenbetrag zu 100 Euro errechnet und mit folgender Meldung
 * ausgegeben: "Eingabefehler! - Unterschreitung: <Differenzenbetrag>"
 */
public class Aufgabe5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double kontostand;
		for (int i = 0; i < 10; i++) {
			System.out.print("Geben Sie den Kontostand ein: ");
			kontostand = sc.nextDouble();
			// Pruefung ob Kontostand in Ordnung ist
			if (kontostand > 100) {
				System.out.println("Kontostand akzeptiert: " + kontostand);
			} else {
				System.out.println("Eingabefehler ! - Unterschreitung: " + (100 - kontostand));
			}
		}

		sc.close();
	}

}
