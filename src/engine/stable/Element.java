package engine.stable;

import engine.map.Bloc;

/**
 * Copyright SEDAMOP - Software Engineering
 * 
 * @author tianxiao.liu@cyu.fr
 *
 */
public abstract class Element {
	private Bloc position;

	public Element(Bloc position) {
		this.position = position;
	}

	public Bloc getPosition() {
		return position;
	}

	public void setPosition(Bloc position) {
		this.position = position;
	}

}
