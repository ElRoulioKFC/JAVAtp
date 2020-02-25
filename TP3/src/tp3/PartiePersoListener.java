package tp3;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import package2048.Jeu2048;

public class PartiePersoListener implements ActionListener{
	private Window w;
	private int colonne;
	private int ligne;
	private int objectif;
	private String pseudo;

	
	public PartiePersoListener(Window w, String colonne, String ligne, String objectif, String pseudo) {
		this.w = w;
		this.colonne = Integer.parseInt(colonne);
		this.ligne = Integer.parseInt(ligne);
		this.objectif = Integer.parseInt(objectif);
		this.pseudo = pseudo;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(ligne);
		System.out.println(pseudo);

		Jeu2048 jeu = new Jeu2048(ligne,colonne,objectif);
		new Fenetre(jeu,pseudo);
		w.dispose();
	}
	
}
