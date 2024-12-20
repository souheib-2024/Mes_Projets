package TP1Class;

public class Cassestte extends Document {
	private String auteur;
	private int duree;
	
	public Cassestte(String titre, String auteur, int duree) {
		super(titre);
		this.auteur=auteur;
		this.duree=duree;
	}
	public String toString() {
		return "Le titre est :"+this.getTitre()+""+
				"\n L'auteur est :"+this.auteur+
				"\n La durer :"+this.duree;
	}

}
