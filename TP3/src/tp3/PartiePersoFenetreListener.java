package tp3;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
