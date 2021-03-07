package Jeux;

public class JeuDes extends Jeu {

    /**
     * Constructeur sans arguments de la classe JeuDes
     */
    public JeuDes() {
        super("Jeu des dès");
    }

    /**
     * Constructeur par copie de la classe JeuDes
     * @param autre Le jeu qui servira à copier le nouvel objet créé
     */
    public JeuDes(Jeu autre) {
        this();
    }  
        
    /**
     * Permet de calculer les gain pour le jeu des dès
     *
     * @param mise La mise pour jouer au jeu
     * @return Retourne la valeur du gain
     */
    @Override
    public int calculerGain(int mise) {
        int gain;
        int desJoueur1;
        int desJoueur2;
        int sommeDesJoueur;
        int desCasino1;
        int desCasino2;
        int sommeDesCasino;

        desJoueur1 = ((int) (6 * Math.random()) + 1);
        desJoueur2 = ((int) (6 * Math.random()) + 1);
        desCasino1 = ((int) (6 * Math.random()) + 1);
        desCasino2 = ((int) (6 * Math.random()) + 1);
        sommeDesJoueur = desJoueur1 + desJoueur2;
        sommeDesCasino = desCasino1 + desCasino2;

        System.out.println("Bienvenur au jeu des dès!\nRésultat des dès du joueur "
                + "\nDès #1 : " + desJoueur1 + "\nDès #2 : " + desJoueur2
                + "\nRésultat des dès du casino \nDès #1 : " + desCasino1 + "\nDès #2 : " + desCasino2);

        if (sommeDesJoueur > sommeDesCasino) {
            gain = mise;
            System.out.println("Félécitation!! vous gagner votre mise de " + mise + "$");
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

        chaine = "Règle du " + this.getNom() + " :\nLe joueur et le casino lance chacun deux dés. "
                + "Si la somme des deux dès du joueur est supérieur à celle des deux dès du casino "
                + "le joueur remporte sa mise. ";
        return chaine;
    }
}
