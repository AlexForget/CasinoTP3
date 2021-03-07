package Jeux;

import java.util.Objects;

public abstract class Jeu {

    private String nom;
    
    
    /**
     * Constructeur avec un argument de la classe Jeu
     * @param nom Nom qui serra attribué au jeu
     */
    public Jeu(String nom) {
        this.nom = nom;
    }
    
    /**
     * Constructeur par copie de la class Jeu
     * @param autre Le jeu qui servira à copier le nouvel objet créé.
     */
    public Jeu(Jeu autre) {
        this(autre.nom);
    }


    /**
     * Compare si deux objets de la classe jeu sont les même
     *
     * @param obj L'objet qui est comparé avec celui ayant fait l'appel de la
     * méthode
     * @return Retourne vrai si les deux objets sont pareils, faux si ce n'est
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
        final Jeu other = (Jeu) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    
    @Override
    public abstract String toString();

    public abstract int calculerGain(int mise);

    /**
     * Accesseurs "nom" d'un objet Jeu
     * @return Retourne le nom du jeu de l'objet de la classe Jeu
     */
    public String getNom() {
        return nom;
    } 
}
