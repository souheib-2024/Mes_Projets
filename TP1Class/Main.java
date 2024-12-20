package TP1Class;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Document d1=new Document("Chiraq_Gang");
		d1.creationDate=new Date();
		System.out.println(d1);
		Periodique p1=new Periodique(d1.getTitre(),10,"deuxiem");
		System.out.println(p1);
		Cassestte c1= new Cassestte(d1.getTitre(),"CHief Keef",10);
		System.out.println("\n");
		System.out.println(c1);
		Livre l1= new Livre("Folio",10,"izi","yizi");
		
		Bibliotheque bibliotheque = new Bibliotheque("Ma Bibliothèque");

	      

	        bibliotheque.ajouterDocument(l1);
	        bibliotheque.ajouterDocument(p1);
	        bibliotheque.ajouterDocument(c1);

	        bibliotheque.listerDocuments();
		
		
		
		
	}

}



     
