package Casinos;

import Joueurs.*;
import Jeux.*;
import java.util.Arrays;
import java.util.Objects;

public abstract class Casino implements Comparable, ImpotFoncier {

    private String nom;
    private int joueursPresent;
    private int joueursPresentMax;
    private int capital;
    private Joueur[] tabJoueur;
    private Jeu[] tabJeu;       
    
    
    /**
     * Constructeur d'objet de la classe Casino à 2 arguments
     *
     * @param nom Le nom du Casino
     * @param capacite La capacité de joueurs maximum que le Casino peu contenir
     */
    public Casino(String nom, int capacite) {
        this.nom = nom;
        this.joueursPresentMax = capacite;
        joueursPresent = 0;
        tabJoueur = new Joueur[capacite];
        tabJeu = new Jeu[]{new JeuDes(), new JeuRoulette()};
        capital = 100000;
    }
    
    /**
     * Constructeur d'objet de la classe Casino sans argument
     */
    public Casino() {
        this("sans nom", 100);
    }
    
    /**
     * Constructeur d'objet de la classe Casino par copie
     *
     * @param autre L'objet de la classe Casino à partir duquel sera copié le
     * nouvelle objet construit
     */
    public Casino(Casino autre) {
        this(autre.nom, autre.joueursPresentMax);
        for (int i = 0; i < tabJeu.length; i++) {
            this.tabJeu[i] = autre.tabJeu[i];
        }
    }
    
    /**
     * Permet d'ajouter un objet de la classe Joueur au tableau des joueurs
     * présent dans le casino qui appel cet méthode
     *
     * @param joueur L'objet de la classe Joueur qui va être ajouter au tableau
     * des joueurs présents dans le casino
     */
    public boolean ajouterJoueur(Joueur joueur) {
        if (joueursPresent >= joueursPresentMax) {
            System.out.println("Désolé " + joueur.getNom() + ", le casino est à capacité "
                    + "maximum, aucun joueur suplémentaire ne peut entrer dans le casion.");
            return false;
        } else if (joueur instanceof JoueurRiche && joueur.getCapital() < 1000) {
            System.out.println(joueur.getNom() + " doit avoir minimum 1 000$ pour entrer dans le casino " + getNom());
            return false;
        } else if (joueur instanceof JoueurPauvre && joueur.getCapital() < 10) {
            System.out.println(joueur.getNom() + " doit avoir minimum 10$ pour entrer dans le casino " + getNom());
            return false;
        }
        tabJoueur[joueursPresent] = joueur;
        System.out.println("Bienvenue au casino " + nom + " " + tabJoueur[joueursPresent].getNom() + "!");
        joueursPresent++;
        return true;
    }
    
    /**
     * Permet de retirer un objet de la classe Joueur au tableau des joueurs
     * présent dans le casino qui appel cet méthode
     *
     * @param joueur L'objet de la classe Joueur qui va être retiré du tableau
     * des joueurs présents dans le casino
     */
    public void enleverJoueur(Joueur joueur) {
        int indiceJoueurEnleve;
        boolean joueurPresent = false;

        if (joueursPresent == 0) {
            System.out.println("Le casino est vide, aucun joueur ne peut être enlevé du casino.");
        } else {
            for (int i = 0; i < joueursPresent; i++) {
                if (tabJoueur[i].equals(joueur)) {
                    joueurPresent = true;
                    indiceJoueurEnleve = i;
                    for (int j = indiceJoueurEnleve; j < tabJoueur.length - 1; j++) {
                        tabJoueur[j] = tabJoueur[j + 1];
                    }
                    joueursPresent--;
                }
            }
            if (joueurPresent == false) {
                System.out.println("Le joueur " + joueur.getNom() + " n'est pas dans le casino " + nom);
            } else {
                System.out.println("Au revoir " + joueur.getNom());
            }
        }
    }
    
    /**
     * Permet de jouer au jeu du casino. Calcul le gain et met à jour le capital
     * du joueur
     *
     * @param mise Mise pour participer au jeu
     * @param joueur L'objet de la classe joueur qui participera au jeu
     * @param jeu Le jeu sélectionné pour jouer
     */
    public void jouer(int mise, Joueur joueur, String jeu) {
        int gain;
        int ancientCapital;
        int nouveauCapital;

        gain = 0;
        if (!jeu.equalsIgnoreCase("Des") && !jeu.equalsIgnoreCase("Roulette")) {
            System.out.println("Erreur, ce jeu n'est pas disponible au casino " + nom + ".");
        } else if (jeu.equalsIgnoreCase("Des")) {
            gain = tabJeu[0].calculerGain(mise);
        } else if (jeu.equalsIgnoreCase("Roulette")) {
            gain = tabJeu[1].calculerGain(mise);
        }
        ancientCapital = joueur.getCapital();
        nouveauCapital = ancientCapital + gain;
        joueur.setCapital(nouveauCapital);
        setCapital(getCapital() - gain);
    }
    
    
    /**
     * Permet de calculer l'évaluation municipale de l'objet Casino qui appel la
     * methode
     *
     * @return Retourne la valeur de l'évaluation
     */
    @Override
    public int evaluationMunicipal() {
        return joueursPresent * 1000;
    }
    
    /**
     * Afficher les détails de l'objet Casino et la liste des joueurs présents
     * dans le casino
     *
     * @return Retourne un String avec les détails de l'objet casino et la liste
     * des joueurs présent si il y en a
     */
    @Override
    public String toString() {
        String chaine;

        chaine = "\nCapacité : " + joueursPresentMax
                + "\nNombre de joueurs présents : " + joueursPresent
                + "\nCapital du Casino : " + capital + "$"
                + "\nJeux disponible : ";
        for (int i = 0; i < tabJeu.length; i++) {
            chaine += "\n\t" + tabJeu[i].getNom();
        }
        if (joueursPresent > 0) {
            chaine += "\nJoueurs présents dans le casino : ";
            for (int i = 0; i < joueursPresent; i++) {
                chaine += "\n\t" + tabJoueur[i].getNom() + " - Capital : " + tabJoueur[i].getCapital();
            }
        }
        return chaine;
    }

    /**
     * Permet ce comparer si deux objets Casino sont les mêmes
     *
     * @param obj L'objet casino qui est comparé avec celui qui a fait l'appel
     * de la méthode
     * @return Retourne vrai si les deux objets Casino sont les mêmes, faux si
     * ils ne le sont pas
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Casino other = (Casino) obj;
        if (this.joueursPresentMax != other.joueursPresentMax) {
            return false;
        }
        if (this.capital != other.capital) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Arrays.deepEquals(this.tabJeu, other.tabJeu)) {
            return false;
        }
        return true;
    }
    
    /**
     * Permet de comparer la somme total du capital des objets joueurs présent
     * dans l'objet Casino
     *
     * @param o L'objet casino qui est comparé avec celui qui a fait l'appel de
     * la méthode
     * @return Retourne 1 si la sommme du capital des objets Joueur de l'objet
     * Casino qui a appelé la fonction est plus grande, -1 si elle est plus
     * petite ou 0 si elle est identique
     */
    @Override
    public int compareTo(Object o) {
        Casino autre = (Casino) o;
        int capitalDesJoueursThis;
        int capitalDesJoueursAutre;

        capitalDesJoueursThis = 0;
        capitalDesJoueursAutre = 0;

        for (int i = 0; i < this.joueursPresent; i++) {
            capitalDesJoueursThis += this.tabJoueur[i].getCapital();
        }
        for (int i = 0; i < autre.joueursPresent; i++) {
            capitalDesJoueursAutre += autre.tabJoueur[i].getCapital();
        }
        if (capitalDesJoueursThis > capitalDesJoueursAutre) {
            return 1;
        }
        if (capitalDesJoueursThis < capitalDesJoueursAutre) {
            return -1;
        } else {
            return 0;
        }
    }
    
    /**
     * Pour obtenir le nom de l'objet de la classe Casino
     * @return retourne le nom de l'objet de la classe Casino
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Pour obtenir le capital de l'objet casino
     * @return Retourne la valeur du capital
     */
    public int getCapital() {
        return capital;
    }
    
    /**
     * Pour obtenir le nombre de joueur présent de l'objet de la classe Casino
     *
     * @return retourne le nombre de joueur présent de l'objet de la classe
     * Casino
     */
    public int getJoueursPresent() {
        return joueursPresent;
    }
    
    /**
     * Pour obtenir le nombre de joueur maximum permis dans de l'objet de la
     * classe Casino
     *
     * @return retourne le nombre de joueur maximum permis dans de l'objet de la
     * classe Casino
     */
    public int getJoueursPresentMax() {
        return joueursPresentMax;
    }
    
    /**
     * Accesseur du tableau joueur
     *
     * @return Retourne l'adresse mémoire du tableau des joueurs de la classe
     * Casino
     */
    public Joueur[] getTabJoueur() {
        return tabJoueur;
    }
    
    /**
     * Pour obtenir l'adresse du tableau des jeux de l'objet Casino
     * @return Retourne l'adresse du tableau des jeux de l'objet Casino
     */
    public Jeu[] getJeu() {
        return tabJeu;
    }
    
    /**
     * Mutateur du nombre de joueur maximum permis dans l'objet Casino
     *
     * @param joueurPresentMax Nouveau nombre de joueur maximum permis
     */
    public void setJoueurPresentMax(int joueurPresentMax) {
        if (joueurPresentMax > 0) {
            this.joueursPresentMax = joueurPresentMax;
        } else {
            System.out.println("La capacité du casino ne peu pas être négative.");
        }
    }
    
    /**
     * Mutateur de la variable capital de l'objet Casino
     *
     * @param capital La nouvelle valeur de la variable capital a assigner
     */
    public void setCapital(int capital) {
        if (capital < 0) {
            System.out.println("Le capital du casino " + nom + " ne peu pas être mis à moins de zéro.");
        } else {
            this.capital = capital;
        }
    }
    
    /**
     * Mutateur de la variable joueursPresent de l'objet Casino
     *
     * @param joueursPresent La nouvelle valeur de la variable joueursPresent a
     * assigner
     */
    public void setJoueurPresent(int joueursPresent) {
        if (joueursPresent < 0) {
            System.out.println("Le nombre de jouers présents au casino " + nom + " ne peu pas être négatif.");
        } else {
            this.joueursPresent = joueursPresent;
        }
    }     
}
