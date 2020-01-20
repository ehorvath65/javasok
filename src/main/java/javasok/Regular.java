package javasok;


public class Regular {

	String fejlec = "Termék kód  ; Árlista   ; Egységár ;   Alapár (Nettó)  ;   Árrés % ;  Kedvezmény %";

	void csere() {
		String pipeCsere = fejlec.replace(";", "|");
		System.out.println(pipeCsere);
	}

	void csere2() {
		String pipeCsere = fejlec.replaceAll(" *; *", "|");
		System.out.println("2. " + pipeCsere);
	}
	
	void csere3() {
		String[] stringTomb = fejlec.split(" *; *");

		for (String item : stringTomb) {
			System.out.println(item);
		}
	}
	
	void csere4() {
		String pipeCsere = fejlec.replaceAll(" *; *", "|").replaceFirst("(\\|[^\\|]+){2}$", "");
		System.out.println("4. " + pipeCsere);
	}

}
