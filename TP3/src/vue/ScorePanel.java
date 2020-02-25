package vue;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import package2048.Jeu2048;

public class ScorePanel extends JPanel implements Observer{
	Jeu2048 jeu;
	String pseudo;
	
	public ScorePanel(Jeu2048 jeu,String pseudo) {
		this.jeu = jeu;
		this.pseudo = pseudo;
		jeu.addObserver(this);
	}
	
	public int plusGrosScore() {
		int res = 2 ;
		for (int l=0;l<jeu.getNbLignes();l++)
			for (int c=0;c<jeu.getNbCols();c++)
				if (jeu.getGrilleInt()[l][c] > res) {
				res =	jeu.getGrilleInt()[l][c];
				}
		return res;
		}

	public void  paint(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		Font font = new Font("Courier", Font.BOLD, 20);
	    g.setFont(font);
		g.setColor(Color.BLACK);
		g.drawString("Votre Score: " + Integer.toString(jeu.getScore()), 0, 20);
		g.drawString("Objectif: " + Integer.toString(jeu.getNbBut()), this.getWidth()-230, 20);
		g.drawString("Record: " + Integer.toString(jeu.getBestScore()), 0, 40);
		g.drawString("Nombre max : " + Integer.toString(plusGrosScore()), this.getWidth()-230, 40);
		g.drawString(pseudo, this.getWidth()-230, 60);
		g.setColor(Color.WHITE);
		if (jeu.estTermine()) {
			font = new Font("Courier", Font.BOLD, 30);
		    g.setFont(font);


			if (jeu.estVainquer()) {
		g.drawString("Bravo", 0, 65);
		}else {
		g.drawString("Dommage", 0, 65);

		}
			}
		


	}

	@Override
	public void update(Observable arg0, Object arg1) {
			this.repaint();		
	}
}