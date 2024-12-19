package test;
import java.util.Scanner;
public class TicTacToe {
	

	    public static void main(String[] args) {
	        char[][] plateau = new char[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                plateau[i][j] = ' ';
	            }
	        }

	        char joueurActuel = 'X';
	        int tours = 0;
	        boolean partieTerminee = false;
	        Scanner scanner = new Scanner(System.in);

	        while (!partieTerminee) {
	            afficherPlateau(plateau);
	            System.out.println("Joueur " + joueurActuel + ", entrez les coordonnées (ligne et colonne) : ");
	            System.out.print("Ligne : ");
	            int ligne = scanner.nextInt();
	            System.out.print("Colonne : ");
	            int colonne = scanner.nextInt();

	            if (ligne < 0 || ligne > 2 || colonne < 0 || colonne > 2 || plateau[ligne][colonne] != ' ') {
	                System.out.println("Coup invalide. Réessayez.");
	                continue;
	            }

	            plateau[ligne][colonne] = joueurActuel;
	            tours++;

	            if (aGagne(plateau, joueurActuel)) {
	                afficherPlateau(plateau);
	                System.out.println("Joueur " + joueurActuel + " a gagné!");
	                partieTerminee = true;
	            } else if (tours == 9) {
	                afficherPlateau(plateau);
	                System.out.println("Match nul!");
	                partieTerminee = true;
	            } else {
	                joueurActuel = (joueurActuel == 'X') ? 'O' : 'X';
	            }
	        }

	        scanner.close();
	    }

	    public static void afficherPlateau(char[][] plateau) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(plateau[i][j]);
	                if (j < 2) System.out.print(" | ");
	            }
	            System.out.println();
	            if (i < 2) System.out.println("---------");
	        }
	    }

	    public static boolean aGagne(char[][] plateau, char joueur) {
	       
	        for (int i = 0; i < 3; i++) {
	            if (plateau[i][0] == joueur && plateau[i][1] == joueur && plateau[i][2] == joueur) {
	                return true;
	            }
	            if (plateau[0][i] == joueur && plateau[1][i] == joueur && plateau[2][i] == joueur) {
	                return true;
	            }
	        }
	        if (plateau[0][0] == joueur && plateau[1][1] == joueur && plateau[2][2] == joueur) {
	            return true;
	        }
	        if (plateau[0][2] == joueur && plateau[1][1] == joueur && plateau[2][0] == joueur) {
	            return true;
	        }
	        return false;
	    }
	
}

