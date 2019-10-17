package hristov;

import java.io.IOException;

/**
 * Main Klasse
 * @author Alexander Hristov
 * @version 2019-10-02
 */
public class Main {
	/**
	 * Main Methode
	 * @param args args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//new WorttrainerFrame();
		WortEintrag wort = new WortEintrag();
		WortListe list = new WortListe();
		list.addWort(wort);
		list.addWort(wort);
		System.out.println(list.toString());
		WortEintrag[] x = {};
		WortEintrag[] x1 = {};
		WortListe list1 = new WortListe(x1);
		WortTrainer trainer = new WortTrainer(list1);
		SaveLoad sl1 = new SaveLoad(trainer);
		System.out.println(sl1.getListe().toString());
		try {
			sl1.save("saveFile.obj");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SaveLoad sl3 = new SaveLoad(new WortTrainer(new WortListe(x)));
		try {
			sl3.load("saveFile.obj");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sl3.getListe().toString());
	}
}
