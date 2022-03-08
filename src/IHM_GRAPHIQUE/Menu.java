package IHM_GRAPHIQUE;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
	
	private JMenuBar mainjmb = new JMenuBar();
	private JMenu principeMenu = new JMenu("Principes");
	private JMenu utilisationsMenu = new JMenu("Unitilisations générales");
	private JMenu profilMenu = new JMenu("Profil");
	private JMenuItem principeItem  = new JMenuItem("Description");
	private JMenuItem modesItem = new JMenuItem("Modes");
	private JMenuItem carteItem = new JMenuItem("Carte");
	private JMenuItem profilItem = new JMenuItem("Description");
	
	public Menu() {
	}
	
	public JMenuBar creation() {
		principeMenu.add(principeItem);
		utilisationsMenu.add(modesItem);
		utilisationsMenu.add(carteItem);
		profilMenu.add(profilItem);
		mainjmb.add(principeMenu);
		mainjmb.add(profilMenu);
		mainjmb.add(utilisationsMenu);
		return mainjmb;
	}
	
	public JMenu getprincipeMenu() {
		return principeMenu;
	}
	
	public JMenu getUtiMenu() {
		return utilisationsMenu;
	}
	
	public JMenu getProfilMenu() {
		return profilMenu;
	}
	
	public JMenuItem getPrincipeItem() {
		return principeItem;
	}
	
	public JMenuItem getModesItem() {
		return modesItem;
	}
	
	public JMenuItem getCarteItem() {
		return carteItem;
	}
	
	public JMenuItem getProfilItem() {
		return profilItem;
	}
}
