package Joueurs;

import Casinos.*;
import java.util.Objects;

public abstract class Joueur implements Comparable {

    private String nom;
    private int capital;
    private Casino casino;

    /**
     * Constructeur d'objet de la classe Joueur à 2 arguments
     *
     * @param nom Le nom du joueur
     * @param capital Le capital initial du joueur
     */
    public Joueur(String nom, int capital) {
        this.nom = nom;
        this.capital = capital;
        casino = null;
    }

    /**
     * Constructeur par copie d'objet de la classe Joueur
     *
     * @param autre L'objet de la classe Joueur à partir duquel sera copié le
     * nouvelle objet construit
     */
    public Joueur(Joueur autre) {
        this(autre.nom, autre.capital);
    }

    /**
     * Constructeur d'objet de la classe Joueur sans argument
     */
    public Joueur() {
        this("Joueur anonyme", 1000);
    }

    /**
     * Permet d'appeler la méthode ajouterJoueur de la classe Casino pour
     * ajouter un objet joueur au tableau des joueurs présents dans un casino
     *
     * @param casino L'objet casino de la classe Casino auquel on veux ajouter
     * un joueur à son tableau de joueur présent dans le casino
     */
    public void joindreCasino(Casino casino) {
        if (this.casino != null) {
            System.out.println("Le joueur " + nom + " se trouve déjà dans le casino "
                    + this.casino.getNom() + ", il ne peut pas joindre le casino " + casino.getNom() + ".");
        } else if (casino.ajouterJoueur(this)) {
            this.casino = casino;
        }
    }
    
    /**
     * Permet d'appeler la méthode enleverJoueur de la classe Casino pour
     * enlever un objet joueur au tableau des joueurs présents dans un casino
     *
     * @param casino L'objet casino de la classe Casino auquel on veux enlever
     * un joueur à son tableau de joueur présent dans le casino
     */
    public void quitterCasino(Casino casino) {
        if (this.casino == null) {
            System.out.println("Le joueur " + nom + " n'est pas dans aucun casino.");
        } else if (!this.casino.equals(casino)) {
            System.out.println("Le joueur " + nom + " ne se trouve pas dans le casino " + casino.getNom());
        } else {
            casino.enleverJoueur(this);
            this.casino = null;
        }
    }

    /**
     * Permet à un joueur de jouer à un jeu de son choix si il se trouve dans un
     * casino
     *
     * @param mise La mise du joueur pour jouer au jeu de son choix
     * @param jeu Le jeu choisi par le joueur
     */
    public void jouer(int mise, String jeu) {
        if (casino == null) {
            System.out.println("Le joueur " + nom + " n'est pas dans un casino. "
                    + "Il doit en joindre un pour pouvoir jouer.");
        } else if (capital < mise) {
            System.out.println("Vous ne pouvez pas miser plus que votre capital restant.");
        } else {
            casino.jouer(mise, this, jeu);
        }
    }

    /**
     * Pour afficher les détails d'un objet de la classe Joueur
     *
     * @return Retourne le nom et le capital d'un joueur de la classe joueur
     */
    @Override
    public String toString() {
        String chaine;

        chaine = nom + " - Capital : " + capital + "$";
        if (casino == null) {
            chaine += " - Présentement dans aucun casino";
        } else {
            chaine += " - Présentement dans le casino " + casino.getNom();
        }
        return chaine;
    }

    /**
     * Permet de comparer si deux objets Joueurs sont les même
     *
     * @param obj L'objet qui sera comparé avec celui effectuant l'appel de la
     * méthode
     * @return Retourne vrai sir les deux objets sont pareils, faux si ce n'est
     * pas le cas
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
        final Joueur other = (Joueur) obj;
        if (this.capital != other.capital) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
   
    /**
     * Compare le capital de deux joueurs et en cas d'égalité leur nom
     *
     * @param o L'objet qui est comparé avec celui effectuant l'appel de la
     * méthode
     * @return Retourne 1 si l'objet joueur ayant appelé la méthode à un capital
     * plus élevé ou un nom plus petit en ordre alphabétique, -1 si il est plus
     * petit, 0 si le capital est le nom sont les mêmes
     */
    @Override
    public int compareTo(Object o) {
        Joueur autre = (Joueur) o;

        if (this.capital > autre.capital) {
            return 1;
        }
        if (this.capital < autre.capital) {
            return -1;
        }
        if (this.getNom().compareToIgnoreCase(autre.getNom()) < 0) {
            return 1;
        }
        if (this.getNom().compareToIgnoreCase(autre.getNom()) > 0) {
            return -1;
        } else {
            return 0;
        }

    }

    
    /**
     * Accesseur de nom d'un objet de la classe Joueur
     * @return Retourne le nom d'un objet de la classe Joueur
     */
    public String getNom() {
        return nom;
    }

    /**
     * Accesseur de capital d'un objet de la classe Joueur
     * @return Retourne le capital d'un objet de la classe Joueur
     */
    public int getCapital() {
        return capital;
    }
    
    /**
     * Accesseur du Casino d'un objet de la classe Joueur
     * @return 
     */
    public Casino getCasino() {
        return casino;
    }

    /**
     * Mutateur de capital d'un objet de la classe Joueur
     * @param capital Le nouveau capital à assigner à l'objet de la
     * classe joueur
     */
    public void setCapital(int capital) {
        if (capital < 0) {
            System.out.println("Le capital ne peut pas être négatif");
        } else {
            this.capital = capital;
        }
    }
    
    /**
     * Mutateur de casino d'un objet de la classe Joueur
     * @param casino Nouvelle objet Casino pour le joueur
     */
    public void setCasino(Casino casino) {
        this.casino = casino;
    }
}
