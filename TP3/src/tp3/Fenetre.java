package tp3;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;

import package2048.Jeu2048;

public class Fenetre extends Frame {
	public static int HAUTEUR = FenetreMenu.HAUTEUR, LARGEUR = FenetreMenu.LARGEUR;
	private Jeu2048 jeu;
	private String pseudo;
	public Fenetre(Jeu2048 jeu,String pseudo) {
		this.pseudo = pseudo;
		this.jeu = jeu;
		setTitle("2048");
		setSize(LARGEUR, HAUTEUR);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		this.setBackground(Color.gray);
		
        JButton button;
		button = new JButton("Nouvelle Partie");
		c.weightx = 0.5;
		c.anchor = GridBagConstraints.PAGE_START;

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		button.addActionListener( new NouvellePartieListener(jeu));
		this.add(button, c);
		

		button = new JButton("Menu");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 0;
		button.addActionListener( new NavigationListener(this,NavigationListener.MENU));
		this.add(button, c);

		button = new JButton("Button 3");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 0;
		this.add(button, c);
		
		
		
		Panel2048 panel2048 = new Panel2048(jeu);		
		c.ipady = 230;      //make this component tall
		c.weightx = 0.0;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 1;
		this.add(panel2048,c);
		
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 60;      //make this component tall
		c.weightx = 1;
		c.anchor = GridBagConstraints.PAGE_END;
		c.gridx = 0;
		c.gridy = 5;
		this.add(new ScorePanel(jeu,pseudo),c);
		

		//this.add(b);

		
		//panel2048.addKeyListener(new ToucheListener(jeu));
		//this.addKeyListener(new ToucheListener(jeu));

		this.addWindowListener(new FermerFenetre(this));
		setVisible(true);
	}



}
