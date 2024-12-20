package TP1Class;

public class Periodique extends Document {
	private String frequence;
	private int page;
	
	public Periodique(String titre,int page, String frequence) {
		super(titre);
		this.page=page;
		this.frequence=frequence;
		
	}
	public String toString() {
		return "Le titre est ="+this.getTitre()+
				"\nLa page ="+this.page+
				"\nLa frequence est = "+this.frequence;
		
	}

}
