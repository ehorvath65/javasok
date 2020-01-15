package javasok;

public class Splitter {

	String fejlec = "Termék kód;Árlista;Egységár;Alapár (Nettó);Árrés %;Kedvezmény %";

	void egy() {
		String[] stringTomb = fejlec.split(";");

		for (int i = 0; i < stringTomb.length; i++) {
			System.out.println(stringTomb[i]);
		}

		for (int i = 0; i < stringTomb.length; i++) {
			System.out.print(stringTomb[i]);
			if (i < stringTomb.length - 1) {
				System.out.print(";");
			}
		}

	}
}
