package javasok;

import java.util.ArrayList;
import java.util.Arrays;

public class Splitter {

	int counter = 0;

	String fejlec = "Termék kód;Árlista;Egységár;Alapár (Nettó);Árrés %;Kedvezmény %";

	void egy() {
		System.out.println(++counter);

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
		System.out.println();
	}

	void ketto() {
		System.out.println(++counter);

		String[] stringTomb = fejlec.split(";");

		for (String item : stringTomb) {
			System.out.println(item);
		}

		for (int i = 0; i < stringTomb.length; i++) {
			System.out.print(stringTomb[i]);
//			if (i < stringTomb.length - 1) {
//				System.out.print(";");
//			} else {
//				System.out.println();
//			}
			System.out.print(i < stringTomb.length - 1 ? ";" : "\n");
		}
		System.out.println("b");
	}

	void harom() {
		System.out.println(++counter);

		String[] stringTomb = fejlec.split(";");

		for (String item : stringTomb) {
			System.out.println(item);
		}
		String ossze = String.join(";", stringTomb);
		System.out.println(ossze);
	}
	
	void negy() {
		System.out.println(++counter);
		ArrayList<String> stringTomb2 = new ArrayList<>(Arrays.asList(fejlec.split(";")));
		//List list1 = Arrays.asList(fejlec.split(";")); Rossz
		String ossze = String.join(";", stringTomb2);
		System.out.println(ossze);
	}
}
