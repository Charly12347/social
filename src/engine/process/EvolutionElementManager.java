package engine.process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import data.Individu;
import engine.map.Bloc;

/**
 * class for treatments of social simulation
 * @author lin
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
	 * genere un individu
	 * @throws IOException
	 */
	public void generateIndividu(File f, Bloc position) throws IOException {
		Individu individu = new Individu(generateNom(f), generatePrenom(f), EvolutionElementManager.getRandomNumber(0, 100), position);
		add(individu);
	}
	
	/**
	 * affichage des individus dans le réseau
	 */
	public void printIndividus() {
		Iterator<Individu> ind = individus.iterator();
		while(ind.hasNext()) {
			Individu individu = ind.next();
			System.out.println(individu.toString()+"\n");
		}
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
				if (!elm[0].equals("Nom")) {
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
	
	/**
	 * genere une personnalité
	 * @param csvfile
	 * @return
	 * @throws IOException
	 */
	public static String generatePersonnality(File csvfile) throws IOException {
		String line = "";
		ArrayList<String> personnalities = new ArrayList<String>();
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(csvfile));

				while ((line = br.readLine()) != null) {
					String[] elm = line.split(",");
					if (!elm[0].equals("Personnalité")) {
						personnalities.add(elm[0]);
					}
				}
			} catch (FileNotFoundException e) {
				System.err.println("Fichier non trouvé");
			}
		int nombre = EvolutionElementManager.getRandomNumber(0, personnalities.size() - 1);
		return personnalities.get(nombre);
	}

	/**
	 * retourne un message comme quoi on l'a trouvé ou pas
	 * @param individu
	 * @return
	 */
	public String researchIndividuString(Individu individu) {
		if(individus.contains(individu)){
			return "trouvé";
		}
		return "non trouvé";
	}
	
	/**
	 * recherche l'individu par les paramètres 
	 * @param nom
	 * @param prenom
	 * @return
	 */
	public String researchIndividuNP(String nom, String prenom) {
		Iterator<Individu> individu = individus.iterator();
		while(individu.hasNext()) {
			Individu ind = individu.next();
			if(ind.getNom().equals(nom)&&ind.getPrenom().equals(prenom)) {
				return prenom + " " + nom + " trouvé.";
			}
		}
		return "Individu non trouvé";
	}

	/**
	 * retourne le nombre total d'individu dans le réseau
	 * @return
	 */
	public int individuCount() {
        return individus.size();
    }
    
	/**
	 *  retourne le nombre total de femmes dans le réseau
	 * @return
	 */
    public int countFemale() {
        int totalFemale = 0;
        for (Individu individu : individus) {
        	if (individu.getGender().equals("female")) {
        		totalFemale++;
        	}
        }
        return totalFemale;
    }
    
    /**
     * retourne le nombre total d'hommes dans le réseau
     * @return
     */
    public int countMale() {
        int totalMale = 0;
        for (Individu individu : individus) {
        	if (individu.getGender().equals("male")) {
        		totalMale++;
        	}
        }
        return totalMale;
    }
    
    
}
