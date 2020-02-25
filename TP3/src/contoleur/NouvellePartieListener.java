package contoleur;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import package2048.Jeu2048;
public class NouvellePartieListener implements ActionListener{
	private Jeu2048 jeu;
	
	public NouvellePartieListener(Jeu2048 jeu) {
		this.jeu = jeu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			jeu.nouveauJeu();
			System.out.println("test");
	}
	
	
}
