package modele;
public void jouerCoup(Joueur joueur, Position position) {
        // Vérifiez si la position est valide et si la case n'a pas déjà été choisie
        if (positionEstValide(position) && !caseDejaChoisie(position)) {
            Case caseSelectionnee = grille.getCase(position);
            Coup coup = new Coup(joueur, caseSelectionnee);
            coupsJoues.add(coup);
            joueur.incrementerScore(caseSelectionnee.getValeur());
        } else {
            System.out.println("Case invalide ou déjà choisie. Veuillez choisir une autre case.");
        }
    }
    


    
    