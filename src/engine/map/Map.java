package engine.map;

/**
 * Copyright SEDAMOP - Software Engineering
 * 
 * @author tianxiao.liu@cyu.fr
 *
 */
public class Map {
	private Bloc[][] blocks;

	private int lineCount;
	private int columnCount;

	public Map(int lineCount, int columnCount) {
		this.lineCount = lineCount;
		this.columnCount = columnCount;

		blocks = new Bloc[lineCount][columnCount];

		for (int lineIndex = 0; lineIndex < lineCount; lineIndex++) {
			for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
				blocks[lineIndex][columnIndex] = new Bloc(lineIndex, columnIndex);
			}
		}
	}

	public Bloc[][] getBlocs() {
		return blocks;
	}

	public int getLineCount() {
		return lineCount;
	}

	public int getColumnCount() {
		return columnCount;
	}

	public Bloc getBloc(int line, int column) {
		return blocks[line][column];
	}
}
