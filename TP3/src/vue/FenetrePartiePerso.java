package vue;
import java.awt.*;

import contoleur.FermerFenetre;
import contoleur.PartiePersoListener;

public class FenetrePartiePerso extends Frame{
	public static int HAUTEUR = 600, LARGEUR = 500;
	
	
	public FenetrePartiePerso() {
		setTitle("2048 - Menu");
		setSize(LARGEUR, HAUTEUR);
		setLayout(new GridLayout(5,1));
		
		Panel p = new Panel();

		Label titre = new Label(" Partie Personnalisée ");
        titre.setFont(new Font("", Font.PLAIN, 40));
		p.add(titre);
		this.add(p);
		
		Panel pseudoPanel = new Panel();
		Label pseudoLabel = new Label("pseudo : ");
		TextField pseudo = new TextField(30);
		
		pseudoPanel.add(pseudoLabel);
		pseudoPanel.add(pseudo);
		
		this.add(pseudoPanel);
		
		
		Panel colPanel = new Panel();
		Label colLabel = new Label("colonne : ");
		final Choice  choixCol = new Choice();
		
		Label linLabel = new Label("Ligne : ");
		final Choice  choixLin = new Choice();
		
		
		for (int i = 1; i < 26; i++) {
		choixCol.addItem(Integer.toString(i));
		choixLin.addItem(Integer.toString(i));
		}
		choixCol.select(4);
		choixLin.select(4);
		
		colPanel.add(colLabel);
		colPanel.add(choixCol);	
		
		colPanel.add(linLabel);
		colPanel.add(choixLin);
		
		this.add(colPanel);
		
		
		Panel objectifPanel = new Panel();
		Label objectifLabel = new Label("Objectif : ");
		final Choice  choixObjectif = new Choice();
		
		choixObjectif.addItem(Integer.toString(2048));
		for (int i = 2; i < 999999999; i=i*2) {
		choixObjectif.addItem(Integer.toString(i));
		}
		
		choixObjectif.select(11);
		objectifPanel.add(objectifLabel);
		objectifPanel.add(choixObjectif);
		
		this.add(objectifPanel);
		
		
		Panel ok = new Panel();
		Button okBouton = new Button("Nouvelle partie");
		ok.add(okBouton);
		okBouton.addActionListener(new PartiePersoListener(this, choixCol,choixLin,choixObjectif,pseudo));
		this.add(ok);
		
		
		
		
		this.addWindowListener(new FermerFenetre(this));
		setVisible(true);
	}
	
}
