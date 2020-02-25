package vue;

import java.awt.*;
import java.awt.event.ActionListener;

import contoleur.FermerFenetre;
import contoleur.NavigationListener;
import contoleur.PartiePersoFenetreListener;

public class FenetreMenu  extends Frame{
	public static int HAUTEUR = 600, LARGEUR = 500;
	

	
	
	public FenetreMenu() {
		
	setTitle("2048 - Menu");
	setSize(LARGEUR, HAUTEUR);
	setLayout(new FlowLayout());
	Button start = new Button("Partie Rapide");
	Button partiePerso = new Button("Partie Perso");
	Button aide = new Button("Aide");
	Button classement = new Button("Classement");
	Button reglage = new Button("reglage");
	
	
	Panel panelReglage = new Panel();
	Panel panelAide = new Panel();
	Panel panelClassement = new Panel();
	
	Label tReglage = new Label("reglage");
	Label tClassement = new Label("classement");
	Label tAide = new Label("aide");
	
	panelReglage.add(tReglage);
	panelClassement.add(tClassement);
	panelAide.add(tAide);



	
	
	
	
	start.addActionListener(new NavigationListener(this,NavigationListener.PARTIERAPIDE));
	partiePerso.addActionListener( new PartiePersoFenetreListener(this));
	//aide.addActionListener(new AideListener());
	//classement.addActionListener(new ClassementListener());
	//reglage.addActionListener(new ReglageListener());
	
	
	
	this.add(partiePerso);
	this.add(start);
	this.add(aide);
	this.add(classement);
	this.add(reglage);
	this.setVisible(true);
	this.addWindowListener(new FermerFenetre(this));
	}

}
