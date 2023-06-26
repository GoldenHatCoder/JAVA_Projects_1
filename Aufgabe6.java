package blatt2a;

import java.util.Scanner;

/**
 * Aufgabe 6 - Schreiben Sie ein Programm, das den Benutzer auffordert, eine
 * Note in Form einer ganzen Zahl von 1 bis 6 einzugeben. Der Notenwert wird
 * waehrend der Programmausfuehrung eingegeben. Das Programm gibt abhaengig vom
 * eingegebenen Notenwert dann die Note in Textform aus, also: "sehr gut",
 * "gut", usw. Sehen Sie auch Falscheingaben von Notenwerten vor. Danach soll
 * das Programm wieder auf Eingabe eines Notenwertes warten. Erst wenn der
 * Benutzer "0" eingibt, wird das Programm beendet. Bestandteil der Aufgabe ist,
 * dass Sie versuchen, verschiedene Typen von Kontrollstrukturen einsetzen, um
 * deren Vor- und Nachteile einschaetzen zu lernen!
 */
public class Aufgabe6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int note = 0;
		do {
			System.out.print("Geben Sie eine Note in Form einer ganzen Zahl von 1 bis 6 ein (0 zum beenden): ");
			note = sc.nextInt();
			// Pruefung ob die Note gueltig ist
			if ((note >= 1) && (note <= 6)) {
				switch (note) {
				case 1:
					System.out.println("sehr gut");
					break;
				case 2:
					System.out.println("gut");
					break;
				case 3:
					System.out.println("befriedigend");
					break;
				case 4:
					System.out.println("ausreichend");
					break;
				case 5:
					System.out.println("mangelhaft");
					break;
				case 6:
					System.out.println("ungenuegend");
					break;
				}
			} else if (note != 0) {
				System.out.println("Ungueltige Note.");
			}

		} while (note != 0);

		sc.close();
	}
}
