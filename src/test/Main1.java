package test;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main1 {
	
	public Main1() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me");
		//button.addActionListener(this);
		
		JLabel label = new JLabel("Number of clicks: 0");
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		frame.add(panel);
		
	}
	
	public static void main(String[] args) {
		new Main1();
	}
}
