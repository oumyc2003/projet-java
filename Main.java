package modele;

public class Main {
    public static void main(String[] args) {
        Partie partie = new Partie(4, 100);

        // Affichage de la grille
        System.out.println("Grille actuelle :");
        partie.afficherGrille();

        while (!partie.estTerminee()) {
            // Affichage de la grille
            System.out.println("Grille actuelle :");
            partie.getGrille().afficherGrille();

            // Le joueur actuel joue son coup
            partie.jouerCoup();

            // Affichage des scores
            System.out.println("Score Joueur 1 : " + partie.getJoueur1().getScore());
            System.out.println("Score Joueur 2 : " + partie.getJoueur2().getScore());
        }

        
    }
}
