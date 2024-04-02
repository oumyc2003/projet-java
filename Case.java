package modele;

public class Case {
    private Position position;
    private int valeur;

    public Case(Position position, int valeur) {
        this.position = position;
        this.valeur = valeur;
    }

    public Position getPosition() {
        return position;
    }

    public int getValeur() {
        return valeur;
    }
}


