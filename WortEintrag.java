package hristov;

import java.io.Serializable;

/**
 * Klasse WortEintrag verwaltet das uebergebene Wort und das dazu gehoerige URL
 * @author Alexander Hristov
 * @version 2019-09-09
 */
public class WortEintrag implements Serializable{

	private String wort;

	private String url;
	/**
	 * Standart Konstruktor
	 */
	public WortEintrag() {
		setWort("Hund");
		setUrl("https://www." + this.wort + ".com");
	}
	/**
	 * Konstruktor
	 * @param wort 	das uebergebene Wort
	 * @param url	das uebergebene URL
	 */
	public WortEintrag(String wort, String url) {
		setWort(wort);
		setUrl(url);
	}
	/**
	 * Ueberprueft die Gueltigkeit des URLs
	 * @param url  das zu ueberpruefende url
	 */
	public static boolean checkURL(String url) {
		if(url.matches("\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~|!:,.;]*[-a-zA-Z0-9+&@#/%=~|]"))
			return true;
		return false;
	}
	/**
	 * Setter-Methode fuer das Attribut wort
	 * @param wort  das uebergebene Wort
	 */
	public void setWort(String wort) {
		if(wort.length()>1)
			this.wort = wort;
	}
	/**
	 * Getter-Methode fuer das Attribut wort
	 * @return wort  das Wort
	 */
	public String getWort() {
		if(this.wort!=null)
		return this.wort;
		return "";
	}
	/**
	 * Setter-Methode fuer das Attribut url
	 * @param url  das uebergebene url
	 */
	public void setUrl(String url) {
		if(url!=null)
			this.url = url;
	}
	/**
	 * Getter-Methode fuer das Attribut url
	 * @return wort  das URL
	 */
	public String getUrl() {
		return this.url;
	}
	/**
	 * Ueberschreibt toString der Klasse Object
	 * @return ein String
	 */
	@Override
	public String toString() {
		return this.wort + ";" + this.url;
	}

}
