package tp3;

import java.awt.*;

import package2048.Jeu2048;

import java.util.Observable;
import java.util.Observer;

public class CaseCanvas extends Canvas implements Observer {
	private int x, y;
	private Jeu2048 jeu;
	private double nb;

	CaseCanvas(Jeu2048 jeu, int x, int y) {
		this.jeu = jeu;
		this.x = x;
		this.y = y;
		jeu.addObserver(this);
		nb = Math.log(jeu.getNbBut())/Math.log(2.0);
		this.addKeyListener(new ToucheListener(jeu));

	}

	public void paint(Graphics g) {
		int valeur = jeu.getGrilleInt()[x][y];
		 double valCase = Math.log(valeur)/Math.log(2.0);
	        double rouge = 255.0 - ((116.0/nb) * (valCase - 1.0));
	        double vert = 211.0 - ((211.0/nb) * (valCase - 1.0));
	        double bleu = 51.0 - ((51.0/nb) * (valCase - 1.0));
	        if (valeur == 0) {
	            g.setColor(Color.lightGray);
				g.fillRoundRect(0, 0,  this.getWidth(), this.getHeight(), 50,50);
	        }
	        else {
	        g.setColor(new Color((int)rouge,(int)vert,(int)bleu));
			g.fillRoundRect(0, 0,  this.getWidth(), this.getHeight(), 50,50);}
	        
	        g.setColor(Color.BLACK);
	        int hauteurChiffre = this.getHeight() *3/4;
	        if (valeur > 0) {
	        	if (valeur < 10) {
					Font fonte = new Font("TimesRoman ", Font.BOLD, this.getHeight()/2);
					
					g.setFont(fonte);
					g.drawString(jeu.getGrilleString()[x][y], this.getWidth() / 3,
							hauteurChiffre);
									}
	        	
	        	else if (valeur < 100) {
				Font fonte = new Font("TimesRoman ", Font.BOLD, this.getHeight()/2);
				
				g.setFont(fonte);
				g.drawString(jeu.getGrilleString()[x][y], this.getWidth() / 4,
						hauteurChiffre);
								}
	
			else if (valeur < 1000){
				Font fonte = new Font("TimesRoman ", Font.BOLD, this.getHeight()/3 + this.getHeight()/9);
				
				g.setFont(fonte);
				g.drawString(jeu.getGrilleString()[x][y], this.getWidth()/8 ,
						hauteurChiffre);
		
								}
			else if (valeur < 10000){
				Font fonte = new Font("TimesRoman ", Font.BOLD, this.getHeight()/3 + this.getHeight()/9);
				
				g.setFont(fonte);
				g.drawString(jeu.getGrilleString()[x][y], this.getWidth()/16,
						hauteurChiffre);
		
								}
			else if (valeur < 100000){
				Font fonte = new Font("TimesRoman ", Font.BOLD, this.getHeight()/3);
				
				g.setFont(fonte);
				g.drawString(jeu.getGrilleString()[x][y], this.getWidth()/16,
						hauteurChiffre);
		
								}
			else if (valeur < 1000000){
				Font fonte = new Font("TimesRoman ", Font.BOLD, this.getHeight()/6);
				
				g.setFont(fonte);
				g.drawString(jeu.getGrilleString()[x][y], this.getWidth()/32,
						hauteurChiffre);
		
			}							}
	}
	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}

}
