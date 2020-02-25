package vue;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

import package2048.Jeu2048;
import vue.*;


public class Panel2048 extends Panel {

	Jeu2048 jeu;


	public Panel2048(Jeu2048 jeu) {
		this.jeu = jeu;
		setLayout(new GridLayout(jeu.getNbLignes(), jeu.getNbCols()));
		for (int i = 0; i < jeu.getNbLignes(); i++) {
			for (int j = 0; j < jeu.getNbCols(); j++) {
				CaseCanvas carre = new CaseCanvas(jeu, i, j);
				this.add(carre);
			}
		}
		
	}

}