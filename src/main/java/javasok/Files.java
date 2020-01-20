package javasok;

import java.io.File;

public class Files {

	File folder = new File("./pdfs");
	File[] listOfFile = folder.listFiles();

	void metodus() {
		for (File file : listOfFile) {
			if (file.isFile() && file.getName().matches(".+\\.((?i)pdf)$")) {
				System.out.println(file.getName());
			}
		}
	}
}
