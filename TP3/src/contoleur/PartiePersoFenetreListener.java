package contoleur;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vue.FenetrePartiePerso;

public class PartiePersoFenetreListener implements ActionListener {
	private Window w;

	public PartiePersoFenetreListener(Window w) {
		this.w = w;
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new FenetrePartiePerso();
		w.dispose();
		
	}
	
}
