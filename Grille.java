package modele;

import java.util.Random;

public class Grille {
    private int taille;
    private Case[][] cases;

    public Grille(int taille) {
        this.taille = taille;
        this.cases = new Case[taille][taille];
        // Initialisation de la grille avec des valeurs aléatoires pour les cases
        Random random = new Random();
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                int valeur = random.nextInt(10); // Valeur aléatoire entre 0 et 9
                cases[i][j] = new Case(new Position(i, j), valeur);
            }
        }
    }

    // Méthode pour accéder à une case de la grille
    public Case getCase(Position position) {
        return cases[position.getX()][position.getY()];
    }

    // Méthode pour afficher la grille en mode texte
    public void afficherGrille() {
        // Affichage de la ligne supérieure de la grille
        System.out.print("+");
        for (int i = 0; i < taille; i++) {
            System.out.print("--+");
        }
        System.out.println();

        // Affichage des valeurs des cases
        for (int i = 0; i < taille; i++) {
            System.out.print("|");
            for (int j = 0; j < taille; j++) {
                System.out.print(" " + cases[i][j].getValeur() + "|");
            }
            System.out.println();

            // Affichage de la ligne de séparation entre les lignes de la grille
            System.out.print("+");
            for (int j = 0; j < taille; j++) {
                System.out.print("--+");
            }
            System.out.println();
        }
    }
}
