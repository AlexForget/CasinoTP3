package Casinos;

import Joueurs.*;

public class CasinoIndien extends Casino {

    /**
     * Constructeur à deux arguments d'un objet CasinoIndien
     *
     * @param nom Nom qui sera attribué à l'objet CasinoIndien
     * @param capacite Capacité de joueurs maximum qui sera attribué à l'objet
     * CasinoIndien
     */
    public CasinoIndien(String nom, int capacite) {
        super(nom, capacite);
    }

    /**
     * Constructeur sans argument d'un objet CasinoIndien
     */
    public CasinoIndien() {
        this("sans nom", 100);
    }

    /**
     * Constructeur par copie d'un objet CasinoIndien
     *
     * @param autre L'objet CasinoLegal qui sera copié pour construire un nouvel
     * objet CasinoIndien
     */
    public CasinoIndien(Casino autre) {
        this(autre.getNom(), autre.getJoueursPresentMax());
    }
    
    /**
     * Fait en sorte que tous les joueurs présent dans le casino le quitte
     */
    public void descenteDePolice() {
        Joueur[] tabJoueur;

        tabJoueur = getTabJoueur();
        System.out.println("La police fait une descente au casino " + getNom() + ", tous les joueurs fuient!!!");
        for (int i = getJoueursPresent() - 1; i >= 0; i--) {
            tabJoueur[i].quitterCasino(this);
        }
    }

    
    /**
     * Fait un trie des Joueurs présent dans le casino selon leur capital et nom
     * en cas d'égalité et expulse le nombre désiré du casino à partir du plus
     * capital le moins élevé
     *
     * @param nbJoueurAExpulser Nombre de joueur à expulsé du Casino
     */
    public void trierEtExpulser(int nbJoueurAExpulser) {
        int indiceJoueurAExpulser;
        Joueur temp;
        Joueur[] tabJoueur;

        tabJoueur = getTabJoueur();
        if (getJoueursPresent() <= 0) {
            System.out.println("Il n'y a personne a expulsé dans le casino " + getNom() + " car il est vide.");
        } else if (nbJoueurAExpulser > getJoueursPresent()) {
            System.out.println("Il y a " + getJoueursPresent() + " joueurs présent dans le casino "
                    + getNom() + " en ce moment. Vous ne pouvez pas en expluser " + nbJoueurAExpulser);
        } else {
            for (int i = 0; i < getJoueursPresent() - 1; i++) {
                for (int j = i + 1; j < getJoueursPresent(); j++) {
                    if (tabJoueur[i].getCapital() < tabJoueur[j].getCapital()) {
                        temp = tabJoueur[i];
                        tabJoueur[i] = tabJoueur[j];
                        tabJoueur[j] = temp;
                    }
                }
            }
            indiceJoueurAExpulser = getJoueursPresent();
            for (int i = indiceJoueurAExpulser - 1; i > (indiceJoueurAExpulser - 1 - nbJoueurAExpulser); i--) {
                System.out.println(tabJoueur[i].getNom() + " a été expulsé du casino.");
                tabJoueur[i].quitterCasino(this);
            }
            this.setJoueurPresent(indiceJoueurAExpulser - nbJoueurAExpulser);
        }
    }

    /**
     * 1% de chance que le Casino se fasse saisir la moitié de son capital
     */
    @Override
    public void payerImpots() {

        if ((int) (100 * Math.random()) + 1 == 1) {
            System.out.println("Revenu Québec a saisie la moitié du capital du casino " + getNom()
                    + "\nAncient capital : " + getCapital() + "$");
            setCapital((int) (getCapital() * 0.5));
            System.out.println("Nouveau capital : " + getCapital() + "$");
        } else {
            System.out.println("Aucun impôt à payer");
        }
    }
    
    /**
     * Permet d'afficher les informations de l'objet CasinoIndien
     *
     * @return Retourne un String avec les informations de l'objet CasinoIndien
     */
    @Override
    public String toString() {
        String chaine;

        chaine = "Casino indien de " + getNom() + super.toString();
        return chaine;
    }
}





