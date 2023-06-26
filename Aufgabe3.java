package blatt2a;

/**
 * Aufgabe 3 - Schreiben Sie ein Programm welches eine "Sanduhr" auf der Konsole
 * ausgibt. Verwenden Sie dazu das Konzept der Schleifen um ihr Programm
 * flexibler zu gestalten.
 * 
 * Zum Testen des Programms nutzen Sie verschieden große Sanduhren z.B. sieben
 * Zeichen breit oder zehn Zeichen breit.
 * 
 * Tipp: Eine Sanduhr besteht quasi aus zwei Dreiecken.
 * 
 */

public class Aufgabe3 {
	public static void main(String[] args) {
		int row = 7; // Anzahl der Reihen

		// Erste for-Schleife fuer die Anzahl der Reihen
		for (int i = 1; i <= row; i++) {
			// Einruecken jeder Zeile ein damit ein Dreieck entsteht
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			// Ausgabe des Sternchenmuster
			// Alternative Loesung:
			// for (int j = 0; j <= row-i; j++) {
			for (int j = i; j <= row; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Gleiches Muster wie oben nur umgedreht
		// Diese Schleife zaehlt runter deswegen i--
		for (int i = row - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			// Alternative Loesung:
			// for (int j = 0; j <= row-i; j++) {
			for (int j = i; j <= row; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
