package blatt2a;

import java.util.Scanner;

/**
 * Aufgabe 4 - Schreiben Sie ein Programm, das drei Variablen fuer Kapitalwert,
 * Zinssatz und eine Laufzeit (<= 7 Jahre) waehrend der Programmausfuehrung von
 * der Tastatur einliest. Erzeugen Sie eine Zinseszinstabelle, in der der
 * Summenwert aus Kapitalwert und der aufgelaufenen Zinsen nach jedem Jahr der
 * Laufzeit ausgegeben wird.
 */
public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Geben Sie den Kapitalwert ein: ");
		double kapitalwert = sc.nextDouble();
		System.out.print("Geben Sie den Zinssatz (in Prozent) ein: ");
		double zinssatz = sc.nextDouble() / 100;
		int laufzeit = 0;
		do {
			System.out.print("Geben Sie die Laufzeit (<= 7 Jahre) ein: ");
			laufzeit = sc.nextInt();
		} while (laufzeit > 7);
		double zinsen;

		for (int i = 0; i < laufzeit; i++) {
			zinsen = kapitalwert * zinssatz;
			kapitalwert += zinsen;
			System.out.println("Kapitalwert nach " + (i + 1) + " Jahren: " + kapitalwert);
		}

		sc.close();
	}

}
