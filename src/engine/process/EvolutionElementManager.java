package engine.process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import data.Individu;

/**
 * class for treatments of social simulation
 * @author lin
 *
 */
public class EvolutionElementManager {
	private ArrayList<Individu> individus = new ArrayList<Individu>();

	public static int getRandomNumber(int min, int max) {
		return (int) (Math.random() * (max + 1 - min)) + min;
	}

	public ArrayList<Individu> getIndividus() {
		return individus;
	}

	public void add(Individu individu) {
		individus.add(individu);
	}

	/**
	 * genere un nom de famille
	 * 
	 * @param individu
	 * @param csvfile
	 * @return 
	 * @throws IOException
	 */
	public static String generateNom(File csvfile) throws IOException {
		String line = "";
		ArrayList<String> noms = new ArrayList<String>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(csvfile));

			while ((line = br.readLine()) != null) {
				String[] elm = line.split(",");
				if (!elm[0].equals("Last Name")) {
					noms.add(elm[0]);
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("Fichier non trouvé");
		}
		int nombre = EvolutionElementManager.getRandomNumber(0, noms.size() - 1);
		return noms.get(nombre);
	}

	/**
	 * genere un prenom
	 * 
	 * @param individu
	 * @param csvfile
	 * @param genre
	 * @return 
	 * @throws IOException
	 */
	public static String generatePrenom(File csvfile) throws IOException {
		String line = "";
		ArrayList<String> prenoms = new ArrayList<String>();
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(csvfile));

				while ((line = br.readLine()) != null) {
					String[] elm = line.split(",");
					if (!elm[1].equals("Prénom")) {
						prenoms.add(elm[1]);
					}
				}
			} catch (FileNotFoundException e) {
				System.err.println("Fichier non trouvé");
			}
		int nombre = EvolutionElementManager.getRandomNumber(0, prenoms.size() - 1);
		return prenoms.get(nombre);
	}
}
