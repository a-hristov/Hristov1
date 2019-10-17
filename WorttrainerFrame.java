package hristov;
import javax.swing.*;
/**
 * Frame Klasse
 * @author Alexander Hristov
 * @version 2019-10-02
 */
public class WorttrainerFrame extends JFrame{
	/**
	 * Konstruktor Methode
	 */
	public WorttrainerFrame() {
		super("Wort-Trainer");
		WorttrainerPanel gp = new WorttrainerPanel();
		this.add(gp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,600,800,400);
		this.setVisible(true);
	}
}