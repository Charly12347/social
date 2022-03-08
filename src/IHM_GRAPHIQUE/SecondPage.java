package IHM_GRAPHIQUE;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import IHM_GRAPHIQUE.*;

import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.*;

public class SecondPage extends JFrame {
	
	//Dimensions
	private GraphicsDevice device;
	
	//Left part
	private JPanel leftPanel = new JPanel();
	private BorderLayout leftBorder = new BorderLayout();
	//First part + 3 bouttons
	private JPanel modePanel = new JPanel();
	private GridLayout modeGrid = new GridLayout(3,1);
	private JButton cuteButton = new JButton("Bisounours");
	private JButton darkButton = new JButton("Dark");
	private JButton epidemicButton = new JButton("Covid");
	//Second part + 3 boutons
	private JPanel controlPanel = new JPanel();
	private GridLayout controlGrid = new GridLayout(4,1);
	private JButton breakButton = new JButton("Pause");
	private JButton stopButton = new JButton("Stop");
	private JButton initButton = new JButton("Initialiser");
	private JButton quitButton = new JButton("Quitter");
	//Third part
	private JButton helpButton = new JButton(new ImageIcon("C:\\Users\\arist\\Desktop\\help.png"));
	
	
	//Right part
	private JPanel rightPanel = new JPanel();
	private BorderLayout rightBorder = new BorderLayout();
	//SOUTH PART
	private JPanel infoPanel = new JPanel();
	private GridLayout infoGrid = new GridLayout(2,1);
	//Informations logicielles
	private JPanel logiPanel = new JPanel();
	private JLabel nbrLabel = new JLabel("Nombre de personnes dans le réseau:");
	private JLabel nbrValue = new JLabel("");
	private JLabel femmeLabel = new JLabel("Nombre de femmes dans le réseau");
	private JLabel femmeValue = new JLabel("");
	private JLabel hommeLabel = new JLabel("Nombre de d'hommes dans le réseau");
	private JLabel hommeValue = new JLabel("");
	//Légendes
	private JLabel legendeLabel = new JLabel();//mettre une image de la légende
	//NORTH PART
	private JPanel searchPanel = new JPanel();
	private BorderLayout searchBorder = new BorderLayout();
	private JTextField searchText = new JTextField(130);
	private JPanel buttonLabel = new JPanel();
	private JButton searchButton = new JButton(); 
	//MIDLE PART
	private JPanel mapLabel = new JPanel();
	
	//Outils
	private boolean visible = true;
			
	public SecondPage(String title){
		super(title);
		
		init();
		initStyles();
		try {
			LegendeAffichage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		quitButton.addActionListener(new QuitAction(this));
	}
	
	public void init() {
		//Ecran principal
		BorderLayout mainborder = new BorderLayout();
		Container contentPane = getContentPane();
		contentPane.setLayout(mainborder);
		mainborder.maximumLayoutSize(contentPane);
		setPreferredSize(getMaximumSize());	//Application en plein écran
		
		
		contentPane.add(BorderLayout.WEST , leftPanel);
		contentPane.add(BorderLayout.EAST , rightPanel);
		
		//Left Panel
		leftPanel.setLayout(leftBorder);
		leftPanel.add(leftBorder.NORTH , modePanel);
		leftPanel.add(leftBorder.CENTER , controlPanel);
		leftPanel.add(leftBorder.SOUTH , helpButton);

		//Mode Panel
		modePanel.setLayout(modeGrid);
		modePanel.add(cuteButton);
		modePanel.add(darkButton);
		modePanel.add(epidemicButton);
		//modeGrid.setVgap(30);
		//Control Panel
		controlPanel.setLayout(controlGrid);
		controlPanel.add(breakButton);
		controlPanel.add(stopButton);
		controlPanel.add(initButton);
		controlPanel.add(quitButton);
		//controlGrid.setVgap(30);
		
		//Right Panel
		rightPanel.setLayout(rightBorder);
		rightPanel.add(rightBorder.SOUTH , infoPanel);
		rightPanel.add(rightBorder.NORTH , searchPanel);
		rightPanel.add(rightBorder.CENTER, mapLabel);
		//Info Panel
		infoPanel.setLayout(infoGrid);
		infoPanel.add(logiPanel);
		infoPanel.add(legendeLabel);
		//Logi Panel
		logiPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		logiPanel.add(nbrLabel);
		logiPanel.add(nbrValue);
		logiPanel.add(femmeLabel);
		logiPanel.add(femmeValue);
		logiPanel.add(hommeLabel);
		logiPanel.add(hommeValue);
		//Search Panel
		searchPanel.setLayout(searchBorder);
		searchPanel.add(searchBorder.WEST , searchText);
		searchPanel.add(searchBorder.EAST , buttonLabel);
		buttonLabel.add(searchButton);
		//Map Frame
		JScrollBar jsp = new JScrollBar(50);
		mapLabel.add(jsp);
	    //mapLabel.setVisible(true);
		//Légende

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(visible);
	}
	
	public void LegendeAffichage() throws IOException {
		BufferedImage bi = ImageIO.read(new File("C:\\Users\\arist\\Desktop\\Images_glp\\legende.jpg"));	
		ImageIcon legendeii = new ImageIcon(bi);
		legendeLabel.setIcon(legendeii);
	}
	
	public void initStyles() {
		//Boutons
		helpButton.setBorderPainted(false);
		cuteButton.setBorderPainted(false);
		darkButton.setBorderPainted(false);
		epidemicButton.setBorderPainted(false);
		breakButton.setBorderPainted(false);
		quitButton.setBorderPainted(false);
		searchButton.setBorderPainted(false);
		initButton.setBorderPainted(false);
		stopButton.setBorderPainted(false);
		 //
		infoPanel.setPreferredSize(new Dimension(200,100));
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
		new SecondPage("Réseau");
	}
	
}
