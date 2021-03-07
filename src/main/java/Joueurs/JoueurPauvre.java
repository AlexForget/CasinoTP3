package Joueurs;

import java.util.Date;

public class JoueurPauvre extends Joueur {
    
    /**
     * Constructeur à deux arguments d'un objet JoueurPauvre
     *
     * @param nom Nom de l'objet JoueurPauvre
     * @param capital Le capital de l'objet JoueurPauvre
     */
    public JoueurPauvre(String nom, int capital) {
        super(nom, capital);
    }

    /**
     * Constructeur par copie d'un objet JoueurPauvre
     *
     * @param autre L'objet joueur copié pour construire le nouvel objet
     * JoueurPauvre
     */
    public JoueurPauvre(Joueur autre) {
        this(autre.getNom(), autre.getCapital());
    }

    /**
     * Constructeur sans argument d'un objet JoueurPauvre
     */
    public JoueurPauvre() {
        this("Pauvre anonyme", 10);
    }
    
    /**
     * Si la date actuelle est le premier du mois le joueur verra son capital
     * augmenter de 700$
     */
    public void collecterCheque() {
        Date date = new Date();

        if (date.getDate() == 1) {
            setCapital(getCapital() + 700);
            System.out.println("C'est le premier du mois. Le joueur " + getNom()
                    + " a droit à son chèque mensuel de 700$");
        } else {
            System.out.println("Ce n'est pas le premier du mois, pas de chèque pour "
                    + getNom() + "!");
        }
    }
    
    /**
     * Affiche les information de l'objet JoueurPauvre
     *
     * @return Retourne les information de l'objet JoueurPauvre
     */
    @Override
    public String toString() {
        String chaine;

        chaine = super.toString() + " - Joueur pauvre";
        return chaine;
    }
    
}
