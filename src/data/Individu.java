package data;

import java.util.ArrayList;

public class Individu {
	private String nom;
	private String prenom;
	private int age;
	private Job job;
	private Personnality personnalites;
	private ArrayList<Individu> relationsPro;
	private ArrayList<Individu> relationsFamille;
	private ArrayList<Individu> relationsAmi;
	private ArrayList<String> interets;
	private String humeur;
	private ArrayList<String> historiques;

	public Individu(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public ArrayList<Individu> getRelationsPro() {
		return relationsPro;
	}

	public void setRelationsPro(ArrayList<Individu> relationsPro) {
		this.relationsPro = relationsPro;
	}

	public ArrayList<Individu> getRelationsFamille() {
		return relationsFamille;
	}

	public void setRelationsFamille(ArrayList<Individu> relationsFamille) {
		this.relationsFamille = relationsFamille;
	}

	public ArrayList<Individu> getRelationsAmi() {
		return relationsAmi;
	}

	public void setRelationsAmi(ArrayList<Individu> relationsAmi) {
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
