package blatt2a;

import java.util.Scanner;

/**
 * Aufgabe 2 - Schreiben Sie ein Programm, das den Urlaubsanspruch von
 * Mitarbeitern (in Tagen) abhaengig von der eingegebenen Zugehoerigkeitsdauer
 * in der Firma berechnet. Der Urlaubsanspruch ist wie folgt definiert:
 * 
 * Zugehoerigkeitsdauer: Anspruch
 * 
 * 0-1: 15, 2-3: 20 4-5: 25 6 und mehr Jahre: 30
 * 
 * Der Wert der Firmenzugehoerigkeit wird per Scanner beim Aufruf des Programms
 * eingegeben. Bestandteil der Aufgabe ist, dass Sie versuchen, verschiedene
 * Typen von Kontrollstrukturen einsetzen, um deren Vor- und Nachteile
 * einschaetzen zu lernen!
 */
public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Geben Sie die Zugehoerigkeitsdauer in der Firma ein: ");
		int zugehoerigkeitsdauer = sc.nextInt();

		System.out.print("Urlaubsanspruch des/der Mitarbeiter/-in (in Tagen): ");
		switch (zugehoerigkeitsdauer) {
		case 0, 1:
			System.out.println("15");
			break;
		case 2, 3:
			System.out.println("20");
			break;
		case 4, 5:
			System.out.println("25");
			break;
		// sechs oder mehr Jahre
		default:
			if (zugehoerigkeitsdauer >= 6) {
				System.out.println("30");
			} else {
				// ungueltige (negative) Anzahl von Jahren wurde eingegeben
				System.out.println("Ungueltige Eingabe!");
			}

		}

		sc.close();
	}

}
