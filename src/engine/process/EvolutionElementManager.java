package engine.process;

import java.util.ArrayList;

import data.Individu;

public class EvolutionElementManager {
	private ArrayList<Individu> individus =new ArrayList<Individu>();
	
	public void generateAge(Individu individu) {
		int age = (int) (Math.random() * (100 + 1 - 0)) + 0;
		individu.setAge(age);
	}

	public ArrayList<Individu> getIndividus() {
		return individus;
	}
	
	public void add(Individu individu) {
		individus.add(individu);
	}
	
}
