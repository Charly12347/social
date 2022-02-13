package data;

import java.util.ArrayList;
import java.util.Random;

public class Individu {
	private String nom;
	private String prenom;
	private int age;
	private Job job;
	private Personnality personnalites;
	private ArrayList<Relation> relationsPro;
	private ArrayList<Relation> relationsFamille;
	private ArrayList<Relation> relationsAmi;
	private ArrayList<String> interets;
	private String humeur;
	private ArrayList<String> historiques;

	public void generateAge() {
		int r= new Random().nextInt(100)+1;
		setAge(r);
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Personnality getPersonnalites() {
		return personnalites;
	}

	public void setPersonnalites(Personnality personnalites) {
		this.personnalites = personnalites;
	}

	public ArrayList<Relation> getRelationsPro() {
		return relationsPro;
	}

	public void setRelationsPro(ArrayList<Relation> relationsPro) {
		this.relationsPro = relationsPro;
	}

	public ArrayList<Relation> getRelationsFamille() {
		return relationsFamille;
	}

	public void setRelationsFamille(ArrayList<Relation> relationsFamille) {
		this.relationsFamille = relationsFamille;
	}

	public ArrayList<Relation> getRelationsAmi() {
		return relationsAmi;
	}

	public void setRelationsAmi(ArrayList<Relation> relationsAmi) {
		this.relationsAmi = relationsAmi;
	}

	public ArrayList<String> getInterets() {
		return interets;
	}

	public void setInterets(ArrayList<String> interets) {
		this.interets = interets;
	}

	public String getHumeur() {
		return humeur;
	}

	public void setHumeur(String humeur) {
		this.humeur = humeur;
	}

	public ArrayList<String> getHistoriques() {
		return historiques;
	}

	public void setHistoriques(ArrayList<String> historiques) {
		this.historiques = historiques;
	}
}
