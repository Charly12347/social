package IHM_GRAPHIQUE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import IHM_GRAPHIQUE.*;

public class Carte extends JFrame {
	
	private JButton quitButton = new JButton("Quitter");
	
	public Carte(String title) {
		super(title);
		
		init();
		
		initStyle();
		
		quitButton.addActionListener(new QuitAction(this));
	}
	
	public void init() {
		
	}
	
	public void initStyle() {
		
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
}
