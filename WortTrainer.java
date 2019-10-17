package hristov;
import java.io.Serializable;
import java.util.Random;
/**
 * Klasse WortTrainer
 * @author Alexander Hristov
 * @version 2019-09-12
 */
public class WortTrainer implements Serializable{

	private WortListe wortListe;

	private double index;
	
	/**
	 * WortTrainer Konstruktor
	 */
	public WortTrainer(WortListe liste) {
		wortListe = liste;
	}

	/**
	 * @return the wortListe
	 */
	public WortListe getWortListe() {
		return wortListe;
	}

	/**
	 * @param wortListe the wortListe to set
	 */
	public void setWortListe(WortListe wortListe) {
		this.wortListe = wortListe;
	}

	/**
	 * Setter-Index
	 * @param index Index
	 */
	public void setIndex(double index) {
		this.index = index;
	}

	/**
	 * Wort aussuchen
	 * @param index	Index
	 * @return	Wort das dem Index entspricht
	 */
	public WortEintrag selectWort() {
		Random r = new Random();
			double d = r.nextInt((int) this.wortListe.getListeLength());
			setIndex(d+1);
		return this.wortListe.indexReturn(index);
	}
	/**
	 * aktuelles Wort zurueckgeben
	 * @return aktuelles Wort
	 */
	public WortEintrag returnWort() {
		return this.wortListe.indexReturn(index);
	}
	/**
	 * ueberpruefen q
	 * @param worteintrag der geprueft werden muss
	 * @return true false
	 */
	public boolean check(String worteintrag) {
		try {
		if(worteintrag.equals(returnWort().getWort()))return true;
		}
		catch(NullPointerException NPE) {
			return false;
		}
		return false;
	}
	/**
	 * ueberpruefen - case
	 * @param worteintrag der ueberprueft werden muss
	 * @return true false
	 */
	public boolean checkIgnoreCase(String worteintrag) {
		try {
			if((worteintrag.toUpperCase()).equals(returnWort().getWort().toUpperCase()))return true;
		}
		catch(NullPointerException NPE0) {
			return false;
		}
		return false;
	}

}
