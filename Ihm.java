package IHM_GRAPHIQUE;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import IHM_GRAPHIQUE.*;

public class Ihm extends JFrame {
	
	//Dimensions
	private GraphicsDevice device;
	
	//Partie gauche
	private JPanel leftPanel = new JPanel();
	private JLabel logoLabel = new JLabel(new ImageIcon("C:\\Users\\arist\\Desktop\\logo.png"));
	private JLabel copyrightLabel = new JLabel("Copyright 2022 L2-I GLP");
	private BorderLayout leftBorderLayout = new BorderLayout();
	
	//Partie droite
	private JPanel rightPanel = new JPanel();
	private BorderLayout rightBorderLayout = new BorderLayout();
	
	private JLabel titreLabel = new JLabel("PROJET SOCIAL");
	private JPanel controlPanel = new JPanel();
	private GridLayout controlGrid = new GridLayout(2,1);
	//Boutons droit
	private JButton startButton = new JButton("Start");
	private JButton quitButton = new JButton("Quitter");
	private JButton helpButton = new JButton(new ImageIcon("C:\\Users\\arist\\Desktop\\help.png"));
	
	//Outils
	private boolean visible = true;
	
	public Ihm(String title) {
		super(title);
		
		//Initialisations
		init();
		
		startButton.addActionListener(new StartAction());
		quitButton.addActionListener(new QuitAction(this));
		helpButton.addActionListener(new HelpAction());
		
	}
	
	private void init() {
		//Ecran
		BorderLayout border = new BorderLayout();
		Container contentPane = getContentPane();
		contentPane.setLayout(border);
		border.maximumLayoutSize(contentPane);
		setPreferredSize(getMaximumSize());	//Application en plein écran
		
		contentPane.add(BorderLayout.WEST , leftPanel);
		contentPane.add(BorderLayout.EAST , rightPanel);
		
		//LeftPanel
		//Container lefttPane = getContentPane();
		leftPanel.setLayout(leftBorderLayout);
		leftPanel.add(leftBorderLayout.CENTER , logoLabel);
		leftPanel.add(leftBorderLayout.SOUTH , copyrightLabel);
		
		//RightPanel
		//Container rightcontentPane = getContentPane();
		rightPanel.setLayout(rightBorderLayout);
		rightBorderLayout.setHgap(200);
		rightBorderLayout.setVgap(200);

		rightPanel.add(rightBorderLayout.NORTH , titreLabel);
		rightPanel.add(rightBorderLayout.CENTER , controlPanel);
		rightPanel.add(rightBorderLayout.SOUTH , helpButton);
		
		controlPanel.setLayout(controlGrid);
		controlPanel.add(startButton);
		controlPanel.add(quitButton);
		controlGrid.setVgap(40);
		
		
		rightPanel.setPreferredSize(new Dimension(600,600));
		leftPanel.setPreferredSize(new Dimension(600,600));
		controlPanel.setPreferredSize(new Dimension(50,20));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(visible);
	}
	
	private class StartAction implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			new SecondPage("Carte");
			setVisible(false);
		}
	}
	
	private class HelpAction implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			new HelpPage ("Mode d'emploi");
			setVisible(false);
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
		// TODO Auto-generated method stub
		new Ihm("Projet Social");
	}
}
