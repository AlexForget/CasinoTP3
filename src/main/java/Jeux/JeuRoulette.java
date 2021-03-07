package Jeux;

public class JeuRoulette extends Jeu {

    /**
     * Constructeur sans arguments de la classe JeuRoulette
     */
    public JeuRoulette() {
        super("Jeu de la roulette");
    }

    /**
     * Constructeur par copie de la classe JeuRoulette
     * @param autre Le jeu qui servira à copier le nouvel objet créé
     */
    public JeuRoulette(Jeu autre) {
        this();
    }
     
    /**
     * Permet de calculer les gain pour le jeu de la roulette
     *
     * @param mise La mise pour jouer au jeu
     * @return Retourne la valeur du gain
     */
    @Override
    public int calculerGain(int mise) {
        int gain;
        int resultat;
        int choixJoueur = 2; //On prend pour acquis que le joueur mise toujours 2 noir

        resultat = ((int) (37 * Math.random() + 1)) - 1;

        System.out.println("Bienvenur au jeu de la roulette!\nVous avez choisi le " + choixJoueur + " noir.");
        if (resultat == 0) {
            System.out.println("Le résultat de la roulette est le 0");
        } else if (resultat % 2 == 0) {
            System.out.println("Le résultat de la roulette est le " + resultat + " noir.");
        } else if (resultat % 2 != 0) {
            System.out.println("Le résultat de la roulette est le " + resultat + " rouge.");
        }

        if ((choixJoueur == resultat) && resultat != 0) {
            gain = mise * 36;
            System.out.println("Félécitation, vous gagnez 36 fois votre mise de " + mise + "$");
        } else if (choixJoueur % 2 == 0 && resultat % 2 == 0 && resultat != 0) {
            gain = mise;
            System.out.println("Félécitation, vous gagnez votre mise de " + mise + "$");
        } else if (choixJoueur % 2 != 0 && resultat % 2 != 0 && resultat != 0) {
            gain = mise;
            System.out.println("Félécitation, vous gagnez votre mise de " + mise + "$");
        } else {
            gain = -mise;
            System.out.println("Meilleur chance la prochaine fois!");
        }
        return gain;
    }
    
    /**
     * Permet d'afficher les règles du jeu
     * @return Retourne les règles du jeu
     */
    @Override
    public String toString() {
        String chaine;

        chaine = "Règle du " + this.getNom() + " :\nLe joueur choisi un nombre entre 1 et 36. "
                + "La bille s'arrête au hasard sur l'un des nombres compris entre 0 et 36. "
                + "Les gains sont calculés de la façons suivante:"
                + "\nCouleur rouge (nombre impair) : 2 fois la mise"
                + "\nCouleur noir (nombre pair : 2 fois la mise"
                + "\nNuméro choisi : 36 fois la mise"
                + "\nLe nombre zéro : Aucun gain";
        return chaine;
    }
    
}
