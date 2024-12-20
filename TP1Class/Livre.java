package TP1Class;

public class Livre extends Document {

	private int page;
	private String auteur;
	private String editeur;
	
	public Livre(String titre,int page, String auteur,String editeur) {
		super(titre);
		this.page=page;
		this.auteur=auteur;
		this.editeur=editeur;
	}
	public String toString() {
		return "Le titre est :"+this.getTitre()+""
				+ "\n La page :"+this.page+
				"\n L'auteur est :"+this.auteur+
				"\n L'editeur :"+this.editeur;
	}

}
