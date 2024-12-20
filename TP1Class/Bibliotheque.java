package TP1Class;

public class Bibliotheque extends Document{
	
    private Document[] documents;
    private int nombreDocuments;

    public Bibliotheque(String titre) {
    	super(titre);
    	this.nombreDocuments = 0;
        this.documents = new Document[3];
        
    }

    public void ajouterDocument(Document document) {
        this.documents[nombreDocuments] = document;
        nombreDocuments++;
    }


    public void listerDocuments() {
        for (int i = 0; i < nombreDocuments; i++) {
            System.out.println(documents[i].getTitre());
        }
    }
}


		








































