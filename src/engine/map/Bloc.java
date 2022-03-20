package engine.map;

/**
 * Copyright SEDAMOP - Software Engineering
 * 
 * @author tianxiao.liu@cyu.fr
 *
 */
public class Bloc {
	private int line;
	private int column;

	public Bloc(int line, int column) {
		this.line = line;
		this.column = column;
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}

	@Override
	public String toString() {
		return "Block [line=" + line + ", column=" + column + "]";
	}

}
