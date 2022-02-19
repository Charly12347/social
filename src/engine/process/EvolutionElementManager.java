package engine.process;

/**
 * 
 * @author charlylin
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import data.Individu;

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
	 * @param individu
	 * @param csvfile
	 * @throws IOException 
	 */
	public static void generateNom(File csvfile) throws IOException {
		String line = "";
		ArrayList<String>prenoms = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvfile));
			
			while ((line = br.readLine()) != null) {
				String[] elm = line.split(";");
				if (!elm[1].equals("Boy name")) {
					prenoms.add(elm[0]);
				}
			}
			
			int nombre = EvolutionElementManager.getRandomNumber(0, prenoms.size());
			System.out.println(prenoms.get(nombre));
		} catch (FileNotFoundException e) {
			System.err.println("Fichier non trouvé");
		}
	}
	
	public static void generatePrenom(File csvfile, String genre) throws IOException {
		String line = "";
		ArrayList<String>prenoms = new ArrayList<String>();
		int nombre = EvolutionElementManager.getRandomNumber(0, prenoms.size());
		
		if(genre.equals("Fille")||genre.equals("Femme")) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(csvfile));
				
				while ((line = br.readLine()) != null) {
					String[] elm = line.split(";");
					if (!elm[1].equals("Girl name")) {
						prenoms.add(elm[2]);
					}
				}
				
				System.out.println(prenoms.get(nombre));
			} catch (FileNotFoundException e) {
				System.err.println("Fichier non trouvé");
			}
		}else {
			try {
				BufferedReader br = new BufferedReader(new FileReader(csvfile));
				
				while ((line = br.readLine()) != null) {
					String[] elm = line.split(";");
					if (!elm[1].equals("Boy name")) {
						prenoms.add(elm[1]);
					}
				}
				System.out.println(prenoms.get(nombre));
			} catch (FileNotFoundException e) {
				System.err.println("Fichier non trouvé");
			}
		}
	}
	
	

}
