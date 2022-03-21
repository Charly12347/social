package gui;

import java.awt.Color; 
import java.awt.Graphics;
import config.Configuration;
import data.Individu;
import engine.map.Bloc;
import engine.map.Map;
import engine.process.SimulationUtility;

/**
 * Copyright SEDAMOP - Software Engineering
 * 
 * @author tianxiao.liu@cyu.fr
 *
 */
public class PaintStrategy {
	public void paint(Map map, Graphics graphics) {
		int blockSize = Configuration.BLOCK_SIZE;
		Bloc[][] blocks = map.getBlocs();

		for (int lineIndex = 0; lineIndex < map.getLineCount(); lineIndex++) {
			for (int columnIndex = 0; columnIndex < map.getColumnCount(); columnIndex++) {
				Bloc block = blocks[lineIndex][columnIndex];

				if ((lineIndex + columnIndex) % 2 == 0) {
					graphics.setColor(Color.GRAY);
					graphics.fillRect(block.getColumn() * blockSize, block.getLine() * blockSize, blockSize, blockSize); //faire quoi ca ? fill veut dire dessiner
				}
			}
		}
	}

	/**
	 * affiche sur l'interface l'individu
	 * @param individu
	 * @param graphics
	 */
	public void paint(Individu individu, Graphics graphics) {
		Bloc position = individu.getPosition();
		int blockSize = Configuration.BLOCK_SIZE;

		int y = position.getLine();
		int x = position.getColumn();
		
		graphics.setColor(Color.RED);
		graphics.drawImage(SimulationUtility.readImage("src/fichiers/silhouette.png"), x, y, 20, 40, null);
	}
}
