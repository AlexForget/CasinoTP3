package Casinos;

import Joueurs.*;

public class CasinoLegal extends Casino {

    private boolean impotDejaPaye;
    private boolean spectacleEnCours;
    int capitalDepart;
    int capitalDejaImpose;
    
    
    /**
     * Constructeur à deux arguments d'un objet CasinoLegal
     *
     * @param nom Nom qui sera attribué à l'objet CasinoLegal
     * @param capacite Capacité de joueurs maximum qui sera attribué à l'objet
     * CasinoLegal
     */
    public CasinoLegal(String nom, int capacite) {
        super(nom, capacite);
        impotDejaPaye = false;
        spectacleEnCours = false;
        capitalDepart = getCapital();
    }
    
    /**
     * Constructeur sans argument d'un objet CasinoLegal
     */
    public CasinoLegal() {
        this("sans nom", 100);
    }

    /**
     * Constructeur par copie d'un objet CasinoLegal
     *
     * @param autre L'objet CasinoLegal qui sera copié pour construire un nouvel
     * objet CasinoLegal
     */
    public CasinoLegal(Casino autre) {
        this(autre.getNom(), autre.getJoueursPresentMax());
    }
    
    /**
     * Permet à un joueur de jouer un des jeux disponible dans un casino
     *
     * @param mise La mise que le joueur met en jeu pour jouer
     * @param joueur L'objet Joueur qui joue au jeu
     * @param jeu Le choix du jeu
     */
    @Override
    public void jouer(int mise, Joueur joueur, String jeu) {
        if (spectacleEnCours) {
            System.out.println("Le spectacle de Greg est en cours, le joueur " + joueur.getNom()
                    + " s'empresse de quitter les jeux et d'aller assister au spectacle!");
        } else {
            super.jouer(mise, joueur, jeu);
        }
    }
    
    /**
     * Début d'un spectacle qui empêche à tous les joueur de jouer dans le casino
     */
    public void debutSpectacle() {
        spectacleEnCours = true;
    }

    /**
     * Fin d'un spectacle qui empêche à tous les joueur de jouer dans le casino
     */
    public void finSpectacle() {
        spectacleEnCours = false;
    }

    /**
     * Fait en sorte que le casino doit payer l'impôt sur ses gains depuis son
     * ouverture ou depuis le dernier appel de cette fonction
     */
    @Override
    public void payerImpots() {
        int impot;
        int gainImposable;
        int capitalActuel;

        capitalActuel = getCapital();
        if (!impotDejaPaye) {
            impotDejaPaye = true;
            gainImposable = capitalActuel - capitalDepart;
            impot = (int) (gainImposable * 0.15);
            if (impot <= 0) {
                impot = 0;
            }
            capitalActuel -= impot;
            setCapital(capitalActuel);
            capitalDejaImpose = capitalActuel;
            System.out.println("Le casino a payé " + impot + "$ en impôt. "
                    + "Gain depuis la dernière imposition : " + gainImposable + "$");
        } else {
            gainImposable = capitalActuel - capitalDejaImpose;
            impot = (int) (gainImposable * 0.15);
            if (impot <= 0) {
                impot = 0;
            }
            capitalActuel -= impot;
            setCapital(capitalActuel);
            capitalDejaImpose = capitalActuel;
            System.out.println("Le casino a payé " + impot + "$ en impôt. "
                    + "Gain depuis la dernière imposition : " + gainImposable + "$");
        }
    }
        
    /**
     * Fait en sorte que tous les joueurs présents dans le casino payent leur
     * impôt
     */
    public void collecterImpot() {
        int impotCollecte;
        int ancientCapital;
        int nouveauCapital;
        Joueur[] tabJoueur;

        tabJoueur = getTabJoueur();
        for (int i = 0; i < getJoueursPresent(); i++) {
            ancientCapital = tabJoueur[i].getCapital();
            impotCollecte = (int) (0.15 * ancientCapital);
            nouveauCapital = ancientCapital - impotCollecte;
            tabJoueur[i].setCapital(nouveauCapital);
            System.out.println("Le casino à collecté les impôts du joueur "
                    + tabJoueur[i].getNom() + ", ce qui représente un montant de " + impotCollecte + "$");
        }
    }
    
    /**
     * Permet d'afficher les informations de l'objet CasinoLegal
     *
     * @return Retourne un String avec les informations de l'objet CasinoLegal
     */
    @Override
    public String toString() {
        String chaine;

        chaine = "Casino legal de " + getNom() + super.toString();
        return chaine;
    }   
}
