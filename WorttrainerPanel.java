package hristov;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;
/**
 * Panel Klasse
 * @author Alexander Hristov
 * @version 2019-10-02
 */
public class WorttrainerPanel extends JPanel {
	private JLabel l1, lImage, l2, l3, l4, l5;
	private JButton b1,b2;
	private JTextField t1;
	private ImageIcon icon;
	/**
	 * Konstruktor Methode
	 */
	public WorttrainerPanel() {
		this.setLayout(new BorderLayout());
		
		// NORTH
		JPanel gl1 = new JPanel(new GridLayout(2,1)); 
		l1 = new JLabel("Welches Wort wird unten dargestellt (Eingabe zum Ueberpruefen)?");
		t1 = new JTextField();
		gl1.add(l1);
		gl1.add(t1);
		this.add(gl1, BorderLayout.NORTH);
		
		// CENTER
		JPanel gl2 = new JPanel(new GridLayout(1,1));
		try {
			icon = new ImageIcon(new URL("https://www.pinclipart.com/picdir/middle/20-206356_wenn-hund-clipart.png"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image = icon.getImage(); // umwandeln in ein Image-Objekt
	    image = image.getScaledInstance(250, 250,  Image.SCALE_SMOOTH); // skalieren auf gewünschte Größe
	    lImage = new JLabel(new ImageIcon(image)); // anzeigen in einem JLabel
		gl2.add(lImage);
		this.add(gl2, BorderLayout.CENTER);
		
		//SOUTH
		JPanel gl3 = new JPanel(new GridLayout(2,3));
		b1 = new JButton("Zuruecksetzen");
		b2 = new JButton("Wort hinzufuegen");
		l2 = new JLabel("Richtige Woerter");
		l3 = new JLabel("Anzahl Woerter");
		l4 = new JLabel("0");
		l5 = new JLabel("0");
		gl3.add(l2);
		gl3.add(l4);
		gl3.add(b1);
		gl3.add(l3);
		gl3.add(l5);
		gl3.add(b2);
		this.add(gl3, BorderLayout.SOUTH);
		
		
	}
	/**
	 * Die eingabe des Users ausgeben
	 * @return eingegebener Text
	 */
	public String getInput() {
		return t1.getText();
	/**
	 * Erneuert die Anzahl der eingegebennen Woerter und die Anzahl der richtig eingegebenen Woerter
	 * @param gesw Anzahl aller eingegeben Woerter
	 * @param riw Anzahl aller richtig eingegebener Woerter
	 * @param tf Richtigkeit der Eingabe des Users
	 */
	}
	public void replace(int gesw, int riw, boolean tf) {
		if(tf)this.l4.setText(""+riw);
		this.l5.setText(""+gesw);
	}
		
}
