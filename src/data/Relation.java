package data;

public class Relation {
	
	private String lien;

	public Relation(String lien) {
		this.lien = lien;
	}

	public String getRelation() {
		return lien;
	}

	/**
	 * Change the link between 2 person, in parameter the change link
	 * @param lien
	 */
	public void setLien(String lien) {
		this.lien = lien;
	}
	
	
}