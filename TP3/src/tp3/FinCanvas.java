package tp3;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import package2048.Jeu2048;

public class FinCanvas extends Canvas implements Observer{
	private Jeu2048 jeu ;
	
	
	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}
	

}
