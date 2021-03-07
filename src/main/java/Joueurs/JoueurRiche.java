package Joueurs;

public class JoueurRiche extends Joueur {

    /**
     * Constructeur à deux arguments d'un objet JoueurRiche
     * @param nom Nom de l'objet JoueurRiche
     * @param capital Le capital de l'objet JoueurRiche
     */
    public JoueurRiche(String nom, int capital) {
        super(nom, capital);
    }

    /**
     * Constructeur par copie d'un objet JoueurRiche
     * @param autre L'objet joueur copié pour construire le nouvel objet JoueurRiche
     */
    public JoueurRiche(Joueur autre) {
        this(autre.getNom(), autre.getCapital());
    }

    /**
     * Constructeur sans argument d'un objet JoueurRiche
     */
    public JoueurRiche() {
        this("Riche anonyme", 1000);
    }

    /**
     * Fait en sorte que le joueur perd tous son capital et doit quitter le
     * casino dans lequel il se trouve si il est dans un casino
     */
    public void banqueRoute() {
        System.out.println("Les investissements de " + getNom() + " on été saisis. "
                + "Il se retrouve sans aucun capital.");
        if (this.getCasino() != null) {
            System.out.println("Il se retrouve également dans l'obligation de quitter le casino " + getCasino().getNom() + ".");
            quitterCasino(getCasino());
        }
        setCapital(0);
    }

    /**
     * Affiche les information de l'objet JoueurRiche
     *
     * @return Retourne les information de l'objet JoueurRiche
     */
    @Override
    public String toString() {
        String chaine;

        chaine = super.toString() + " - Joueur riche";
        return chaine;
    }

}
