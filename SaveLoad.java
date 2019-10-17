package hristov;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 * Die Klasse ist fuer das Speichern und Laden von Files zustaendig
 * @author Alexander Hristov
 * @version 2019-10-13
 */
public class SaveLoad implements Serializable{
	private WortTrainer liste;
	/**
	 * Konstruktor qq
	 * @param l Liste
	 */
	public SaveLoad(WortTrainer l) {
		liste = l;
	}
	/**
	 * Speichern von Daten
	 * @param filename Pfad und Name eingeben
	 * @throws IOException j
	*/
	public void save(String filename) throws IOException {
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
			outputStream.writeObject(liste);
		} catch (IOException e) {
			System.err.println("Fehler beim Laden: " + e.toString());
		} 
	}
	/**
	 * Speichern von Daten
	 * @throws IOException j
	**/
	public void save() throws IOException {
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("saveFile.obj"))) {
			outputStream.writeObject(liste);
		} catch (IOException e) {
			System.err.println("Fehler beim Laden: " + e.toString());
		} 
	}
	/**
	 * Laden von Daten
	 * @param filename Pfad und Name eingeben
	 * @throws IOException j
	 */
	public void load(String filename) throws IOException {
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
			setListe((WortTrainer)inputStream.readObject());
		} catch (IOException e) {
			System.err.println("Fehler beim Laden: " + e.toString());
		} catch (ClassNotFoundException e) {
			System.err.println("Fehler beim Laden: " + e.toString());
		}
	}
	/**
	 * Laden von Daten
	 * @throws IOException j
	 */
	public void load() throws IOException {
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("saveFile.obj"))) {
			setListe((WortTrainer)inputStream.readObject());
		} catch (IOException e) {
			System.err.println("Fehler beim Laden: " + e.toString());
		} catch (ClassNotFoundException e) {
			System.err.println("Fehler beim Laden: " + e.toString());
		}
	}
	/**
	 * qwe
	 * @return the liste
	 */
	public WortTrainer getListe() {
		return liste;
	}
	/**
	 * qwqwe
	 * @param liste the liste to set
	 */
	public void setListe(WortTrainer liste) {
		this.liste = liste;
	}
}