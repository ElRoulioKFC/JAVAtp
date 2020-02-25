package vue;
import java.awt.*;

import package2048.Jeu2048;

import java.util.Observable;
import java.util.Observer;

public class ScoreCanvas extends Canvas implements Observer {
	private Jeu2048 jeu;
	

	public ScoreCanvas (Jeu2048 jeu) {
		this.jeu = jeu;
		jeu.addObserver(this);
		}

	
	Font fonte = new Font("TimesRoman ", Font.BOLD, this.getWidth()/3);
	public void paint(Graphics g) {

	g.setFont(fonte);
	g.drawString("score : " + jeu.getScore(), this.getWidth()/8 ,
			this.getHeight()/2);
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		this.repaint();		
	}
	}
