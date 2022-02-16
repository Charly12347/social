package engine.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import data.Individu;

public class EvolutionElementManager {
	private ArrayList<Individu> individus = new ArrayList<Individu>();

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

	public void generateNom(Individu individu, BufferedReader csvfile) {
		List<String> list = new ArrayList<String>();
		Random randomizer = new Random();
		String random = list.get(randomizer.nextInt(list.size()));
		System.out.println(random);

		String line = "";
		try {
			while ((line = csvfile.readLine()) != null) {
				String[] values = line.split(";");
				System.out.println(values[0]);
			}
		} catch (IOException e) {
			System.err.println("Fichier non détecté.");
		}
	}

}
