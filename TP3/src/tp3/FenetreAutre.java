package tp3;

import java.awt.*;
import java.awt.event.ActionListener;

public class FenetreAutre  extends Frame{
	public static int CLASSEMENT = 0, AIDE = 1,REGLAGE =2;
	public static int HAUTEUR = 600, LARGEUR = 500;
	private int montreMenu;

	public FenetreAutre(int montreMenu) {
	this.montreMenu = montreMenu;	
	setTitle("2048 - Menu");
	setSize(LARGEUR, HAUTEUR);
	setLayout(new FlowLayout());
	Button retourBouton = new Button("Menu");
	retourBouton.addActionListener(new NavigationListener(this,NavigationListener.MENU));
	this.add(retourBouton);
	
	if (montreMenu == this.CLASSEMENT) {
		Label tClassement = new Label("Le classement : Comming soon");
		this.add(tClassement);
		
	}
	
	
	
	
	
}
}