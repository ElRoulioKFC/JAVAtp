package contoleur;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import package2048.Jeu2048;
import vue.Fenetre;
import vue.FenetreMenu;



public class NavigationListener implements ActionListener{
	private Window w;
	private int direction;
	public static int MENU = 0, PARTIERAPIDE = 1;
	
	public NavigationListener(Window w, int direction) {
		this.w = w;
		this.direction = direction;

	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if (direction == 1) {
		Jeu2048 jeu = new Jeu2048();
		new Fenetre(jeu,"guest");
		
		}
		else if (direction == 0){
			new FenetreMenu();
			
		}
		w.dispose();

	}
}