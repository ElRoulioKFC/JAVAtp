package tp3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import package2048.Jeu2048;

public class ToucheListener extends KeyAdapter {
	Jeu2048 jeu;

	public ToucheListener(Jeu2048 jeu) {
		this.jeu = jeu;
	}
		
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			jeu.decaler(Jeu2048.HAUT);
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			jeu.decaler(Jeu2048.BAS);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			jeu.decaler(Jeu2048.GAUCHE);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			jeu.decaler(Jeu2048.DROITE);
		}

		if (jeu.estTermine()) {
			if (e.getKeyCode() == KeyEvent.VK_N) {
				jeu.nouveauJeu();
			}
		}
	}
}
