package blatt2a;

public class Fahrerlaubnis {

	// Auto fahren ist ab 18 Jahren erlaubt
	// Mofa fahren ist ab 16 Jahren erlaubt
	// Volljaehrig ist man ab 18 Jahren
	// Herr Meier laesst Personen weiter fahren wenn sie in einem Jahr volljaehrig
	// werden
	public static void main(String[] args) {
		printFahrerlaubnis(18, "Person A");
		printFahrerlaubnis(40, "Person B");
		printFahrerlaubnis(5, "Person C");
		printFahrerlaubnis(17, "Person D");
	}

	public static void printFahrerlaubnis(int alter, String name) {
		// Fehler 1: aendere ">" zu ">="
		if (alter >= 18) {
			System.out.println(name + " ist bereits volljaehrig!");
		} else {
			System.out.println(name + " ist NICHT volljaehrig, erst in " + (18 - alter) + " Jahren!");
			// Fehler 2: Negation ("!"-Zeichen) entfernen
			if (((18 - alter) == 1)) {
				System.out.println(name + " wird in einem Jahr volljaehrig, daher laesst ihn Herr Meier weiterfahren!");
			}
		}
		// Fehler 3: mit 16 ist Mofa fahren erlaubt, daher "15" statt "16"
		// + unnoetige Bedingung "&& !(16 < alter)"
		if (15 < alter) {
			System.out.println(name + " darf Mofa fahren!");
		}
		// Fehler 4: Negation ("!"-Zeichen) entfernen
		if ((alter > 17)) {
			System.out.println(name + " darf Auto fahren!");
		}
		// Fehler 5: "else" entfernen und in if-Abfrage umwandeln fuer Kinder unter 16
		if (alter < 16)
			System.out.println(name + " darf weder Auto noch Mofa fahren!");
		System.out.println("");
	}
}
