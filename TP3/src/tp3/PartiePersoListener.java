package tp3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import package2048.Jeu2048;

public class PartiePersoListener implements ActionListener{
	private Window w;
	private Choice colonne;
	private Choice ligne;
	private Choice objectif;
	private TextField pseudo;

	
	public PartiePersoListener(Window w, Choice choixCol, Choice choixLin, Choice choixObjectif, TextField pseudo) {

		this.w = w;
		this.colonne = choixCol;
		this.ligne = choixLin;
		this.objectif = choixObjectif;
		this.pseudo = pseudo;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

		Jeu2048 jeu = new Jeu2048(Integer.parseInt(ligne.getItem(ligne.getSelectedIndex())),Integer.parseInt(colonne.getItem(colonne.getSelectedIndex())),Integer.parseInt(objectif.getItem(objectif.getSelectedIndex())));
		new Fenetre(jeu,pseudo.getText());
		
		w.dispose();
	}
	
}
