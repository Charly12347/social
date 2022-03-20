package data;

import java.util.ArrayList;
import engine.stable.*;
import engine.map.Bloc;

public class Individu extends Element{
	private String nom; //
	private String prenom; //
	private int age; //
	private String job; //
	private Personnality personnalites; //
	private ArrayList<Individu> relationsPro;
	private ArrayList<Individu> relationsFamille;
	private ArrayList<Individu> relationsAmi;
	private ArrayList<String> interets; //
	private String humeur; //
	private String gender;  //
	private String etat; //
	private ArrayList<String> historiques; //
	private Bloc position;

	public Individu(String nom, String prenom, int age, Bloc position) {
		super(position);
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.etat="vivant";
		this.position=position;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public ArrayList<String> getHistoriques() {
		return historiques;
	}

	public void setHistoriques(ArrayList<String> historiques) {
		this.historiques = historiques;
	}
}