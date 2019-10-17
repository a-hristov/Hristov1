package hristov;

import java.io.Serializable;

/**
 * Klasse WortListe
 * @author Alexander Hristov
 * @version 2019-09-11
 */
public class WortListe implements Serializable{

	private WortEintrag[] worteintrag;
	/**
	 * Standartkonstruktor q
	 */
	public WortListe() {
		worteintrag=new WortEintrag[0];
	}
	/**
	 * Standartkonstruktor q
	 * @param array qeqwead q
	 */
	public WortListe(WortEintrag[] x) {
		worteintrag=x;
	}
	/**
	 * gibt den Zugehoerigen Worteintrag zurueck 
	 * @param index		Index des Wortes
	 * @return Worteintrag q
	 */
	public WortEintrag indexReturn(double index) {
		int i = (int)index;
		return worteintrag[i];
	}
	/**
	 * Fueht ein WortEintrag zum Array
	 * @param Wort		das einzufuegende Wort
	 */
	public void addWort(WortEintrag Wort) {
		WortEintrag[] worteintrag0 = new WortEintrag[worteintrag.length+1];
		int i = 0;
		for(;i<worteintrag.length;i++)
			worteintrag0[i]=worteintrag[i];
		worteintrag0[i]=Wort;
		worteintrag = worteintrag0;
	}
	/**
	 * Wort aus dem Array loeschen
	 * @param wort	welches geloescht werden muss
	 * @return	erfolgreich/ nicht erfolgreich
	 */
	public boolean deleteWort(String wort) {
		for(int i = 0;i<worteintrag.length;i++) {
			if(worteintrag[i].getWort().equals(wort)) {
				worteintrag[i]=null;
				return true;
			}
		}
		return false;
	}
	/**
	 * Alle Woerter im Array werden ausgegeben
	 * @return alle Woerter im Array
	 */
	public String toString() {
		String x = "";
		for(int i = 0;i<worteintrag.length;i++)
			x=x+"\n"+worteintrag[i];
		return x;
	}
	/**
	 * Laenge des Arrays
	 * @return die Laenge
	 */
	public double getListeLength() {
		return worteintrag.length;
	}
}
