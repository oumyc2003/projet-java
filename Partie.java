package modele;

import java.util.Scanner;

public class Partie {
    private int tailleGrille;
    private Grille grille;
    private Joueur joueur1;
    private Joueur joueur2;
    private int scoreMax;

    public Partie(int tailleGrille, int scoreMax) {
        this.tailleGrille = tailleGrille;
        this.grille = new Grille(tailleGrille);
        this.scoreMax = scoreMax;

        // Demander le nom des joueurs//
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nom du joueur 1 : ");
        String nomJoueur1 = scanner.nextLine();
        System.out.print("Nom du joueur 2 : ");
        String nomJoueur2 = scanner.nextLine();

        this.joueur1 = new JoueurHumain(nomJoueur1);
        this.joueur2 = new JoueurHumain(nomJoueur2);
    }

    public boolean estTerminee() {
        // La partie est terminée si un joueur a atteint le score maximum
        return joueur1.getScore() >= scoreMax || joueur2.getScore() >= scoreMax;
    }

    public void jouerCoup() {
        // À implémenter en fonction des règles du jeu
    }
    
    public void afficherGrille() {
         grille.afficherGrille();
    }

    public Grille getGrille() {
        return grille;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }
    
    public int getScore() {
        // Calculer et retourner un score global pour la partie
        return joueur1.getScore() + joueur2.getScore();
    }
}
