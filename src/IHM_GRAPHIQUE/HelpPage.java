package IHM_GRAPHIQUE;

import IHM_GRAPHIQUE.*;
import IHM_GRAPHIQUE.Menu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelpPage extends JFrame {
	
	//Barre de menu/navigation
	
	//Boutons
	private JButton quitButton = new JButton("Quitter");
	
	private JFrame f = new JFrame();
	
	public HelpPage(String title) {
		super(title);
		
		init();
		
		quitButton.addActionListener(new QuitAction(this));
		
		setVisible(true);
	}
	
	public void init() {
		BorderLayout border = new BorderLayout();
		Container contentPane = getContentPane();
		contentPane.setLayout(border);
		setPreferredSize(getMaximumSize());	//Application en plein écran
		
		//Barre de Menu
		Menu menu = new Menu();
		JMenuBar mainjmb = menu.creation();
		menu.getPrincipeItem().addActionListener(new PrincipeAction());
		menu.getModesItem().addActionListener(new ModesAction());
		menu.getCarteItem().addActionListener(new CarteAction());
		menu.getProfilItem().addActionListener(new ProfilAction());		
		f.setJMenuBar(mainjmb);
		f.setSize(500, 500);
        f.setVisible(true);
	}
	
	private class PrincipeAction implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			new Description("Pricipes");
			f.dispose();
		}
	}
	
	private class ModesAction implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			new Modes("Modes");
			f.dispose();
		}
	}
	
	private class CarteAction implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			new Carte("Carte");
			f.dispose();
		}
	}
	
	private class ProfilAction implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			new Profile("Profil");
			f.dispose();
		}
	}
	
	private class QuitAction implements ActionListener {
		//Window to be closed.
		private JFrame window;

		public QuitAction(JFrame window) {
			this.window = window;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			window.dispose();
		}

	}
	
	public static void main(String[] args) {
		new HelpPage("Mode d'emploi");
	}
}
