package data;

import java.util.ArrayList;

public class Personnality {
	private String typePersonnality;
	private ArrayList<String> criterePersonnality;
	
	public Personnality(String typePersonnality, ArrayList<String> criterePersonnality) {
		this.typePersonnality = typePersonnality;
		this.criterePersonnality = criterePersonnality;
	}

	public String getTypePersonnality() {
		return typePersonnality;
	}

	public ArrayList<String> getCriterePersonnality() {
		return criterePersonnality;
	}
	
	
	
}
