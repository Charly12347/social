package test;

import java.io.File;
import java.io.IOException;
import engine.process.EvolutionElementManager;

public class Main {

	public static void main(String[] args) throws IOException {
		String file = "./src/fichiers/noms individus social.csv";
		
		File f = new File(file);
		String nom = EvolutionElementManager.generateNom(f);
		String prenom = EvolutionElementManager.generatePrenom(f);
		System.out.println("Last name = " + nom + " ,First Name = " + prenom);
	}
}