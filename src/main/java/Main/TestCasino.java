package Main;

import Casinos.*;
import Joueurs.*;
import Jeux.*;

public class TestCasino {
    
    public static void main(String[] args) {
        

        //--------------------------------------------
        //Test de la classe Casino
        //--------------------------------------------
        
        
        //Test constructeur avec arguments
        /*
        Joueur joueur1 = new Joueur("Alex", 100);
        Joueur joueur2 = new Joueur("Marc", 10);
        Joueur joueur3 = new Joueur("Zeus", 1000);
        
        Casino casino1 = new Casino("Deux-Montagnes", 50);
        joueur1.joindreCasino(casino1);
        System.out.println("");
        System.out.println(casino1.toString());
        
        
        //Test constructeur sans arguments
        
        Casino casino2 = new Casino();
        joueur2.joindreCasino(casino2);
        System.out.println("");
        System.out.println(casino2.toString());
        
        
        //Test constructeur par copie
        
        Casino casino3 = new Casino(casino1);
        joueur3.joindreCasino(casino3);
        System.out.println("");
        System.out.println(casino3.toString());
        */
        
        
        // Test getter
        
        /*
        Casino casino1 = new Casino("Deux-Montagnes", 50);
        Casino casino2 = new Casino();
        Casino casino3 = new Casino(casino1);
        
        System.out.println(casino1.getNom());
        System.out.println("");
        System.out.println(casino1.getJoueursPresent());
        System.out.println("");
        System.out.println(casino1.getJoueursPresentMax());
        System.out.println("");
        System.out.println(casino1.getTabJoueur());
        System.out.println("");
        System.out.println(casino1.getJeu());
        System.out.println("");
        
        System.out.println(casino2.getNom());
        System.out.println("");
        System.out.println(casino2.getJoueursPresent());
        System.out.println("");
        System.out.println(casino2.getJoueursPresentMax());
        System.out.println("");
        System.out.println(casino2.getTabJoueur());
        System.out.println("");
        System.out.println(casino2.getJeu());
        System.out.println("");
        
        System.out.println(casino3.getNom());
        System.out.println("");
        System.out.println(casino3.getJoueursPresent());
        System.out.println("");
        System.out.println(casino3.getJoueursPresentMax());
        System.out.println("");
        System.out.println(casino3.getTabJoueur());
        System.out.println("");
        System.out.println(casino3.getJeu());
        System.out.println("");
        */
        
        
        // test setter
        
        /*
        Casino casino1 = new Casino("Deux-Montagnes", 50);
        
        System.out.println(casino1);
        
        casino1.setJoueurPresentMax(150);
        
        System.out.println(casino1);
        
        casino1.setJoueurPresentMax(-150);
        
        System.out.println(casino1);
        
        */
        

        // Test toString
        
        /*
        Casino casino1 = new Casino("Deux-Montagnes", 2);
        Joueur joueur1 = new Joueur("Alex", 100);
        
        joueur1.joindreCasino(casino1);
        System.out.println("");
        System.out.println(casino1);
        */
        
        /*
        
        Casino casino1 = new Casino("Deux-Montagnes", 2);
        Joueur joueur1 = new Joueur("Alex", 100);
        Joueur joueur2 = new Joueur();
        Joueur joueur3 = new Joueur("Josée", 0);
        
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        casino1.ajouterJoueur(joueur1);
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        casino1.ajouterJoueur(joueur2);
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        casino1.ajouterJoueur(joueur3);
        System.out.println("");
        System.out.println(casino1);
        */
        
        /*
        Casino casino1 = new Casino("Deux-Montagnes", 50);
        
        System.out.println(casino1.toString());
        */
        
        
        // Test ajouterJoueur
        // Cet méthode ne doit pas être appelé du main mais je 
        // voulais la tester indépendament de joindreCasino
        
        /*
        Casino casino1 = new Casino("Deux-Montagnes", 2);
        Joueur joueur1 = new Joueur("Alex", 100);
        Joueur joueur2 = new Joueur();
        Joueur joueur3 = new Joueur("Josée", 0);
        
        casino1.ajouterJoueur(joueur1);
        
        casino1.ajouterJoueur(joueur2);
        
        casino1.ajouterJoueur(joueur3);
        
        joueur1 = null;
        joueur2 = null;
        
        System.out.println(casino1);
        */
        
        
        // Test enleverJoueur
        // Cet méthode ne doit pas être appelé du main mais je 
        // voulais la tester indépendament de quitterCasino
        
        /*
        Casino casino1 = new Casino("Deux-Montagnes", 3);
        Joueur joueur1 = new Joueur("Alex", 100);
        Joueur joueur2 = new Joueur("Alain", 10000);
        Joueur joueur3 = new Joueur("Josée", 1000);
        Joueur joueur4 = new Joueur("Igor", 10);

        
        casino1.ajouterJoueur(joueur1);
        
        casino1.ajouterJoueur(joueur2);
        
        casino1.ajouterJoueur(joueur3);
        
        System.out.println("");       
        System.out.println(casino1);
        
        System.out.println("");
        casino1.enleverJoueur(joueur2);
        
        System.out.println("");       
        System.out.println(casino1);
        
        System.out.println("");
        casino1.enleverJoueur(joueur4);
        
        System.out.println("");       
        System.out.println(casino1);
        */
        
        
        
        
        
        //--------------------------------------------
        //Test de la classe Joueur
        //--------------------------------------------
        
        
        //Test constructeur avec arguments
        
        /*
        
        Joueur joueur1 = new Joueur("Alex", 100);
        System.out.println("");
        System.out.println(joueur1);
        
        
        
        //Test constructeur sans arguments
        
        Joueur joueur2 = new Joueur();
        System.out.println("");
        System.out.println(joueur2);
        
        
        
        //Test constructeur par copie
        
        Joueur joueur3 = new Joueur(joueur1);
        System.out.println("");
        System.out.println(joueur3);
        
        */

        
        
        // Test toString
        
        /*
        Joueur joueur1 = new Joueur("Alex", 100);
        Joueur joueur2 = new Joueur();
        Joueur joueur3 = new Joueur(joueur1);
        
        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println(joueur3);
        */
        
        
        // Test getter + setter
        
        /*
        Joueur joueur1 = new Joueur("Alex", 100);
        
        System.out.println(joueur1.getNom());
        System.out.println(joueur1.getCapital());
        System.out.println(joueur1);
        
        joueur1.setCapital(0);

        System.out.println(joueur1.getNom());
        System.out.println(joueur1.getCapital());
        System.out.println(joueur1);
        
        joueur1.setCapital(-100);

        System.out.println(joueur1.getNom());
        System.out.println(joueur1.getCapital());
        System.out.println(joueur1);
        
        joueur1.setCapital(50);

        System.out.println(joueur1.getNom());
        System.out.println(joueur1.getCapital());
        System.out.println(joueur1);
        */
        
        
        // Test equals
        
        /*
        Joueur joueur1 = new Joueur("Alex", 100);
        Joueur joueur2 = new Joueur();
        Joueur joueur3 = new Joueur(joueur1);
        Joueur joueur4 = new Joueur("Alex", 100);
        Joueur joueur5 = new Joueur("Alex", 1000);
        
        System.out.println(joueur1.equals(joueur2));
        System.out.println(joueur1.equals(joueur3));
        System.out.println(joueur1.equals(joueur4));
        System.out.println(joueur1.equals(joueur5));
        */
        
        
        // Test joindreCasino
        
        /*
        Casino casino1 = new Casino("Deux-Montagnes", 3);
        Casino casino2 = new Casino("de l'abitibi", 3);
        Joueur joueur1 = new Joueur("Alex", 100);
        Joueur joueur2 = new Joueur();
        Joueur joueur3 = new Joueur("Josée", 0);
        Joueur joueur4 = new Joueur("Sylvain", 100000);
        Joueur joueur5 = new Joueur("Bob", 1);
        */
        
        /*
        joueur1.joindreCasino(casino1);
        joueur1.joindreCasino(casino2);
        
        joueur1.quitterCasino(casino2);
        joueur1.quitterCasino(casino1);
        
        System.out.println(joueur1);
        */
        
        /*
        System.out.println(casino1);
        System.out.println("");
        joueur1.joindreCasino(casino1);
        joueur1 = null;
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        joueur2.joindreCasino(casino1);
        joueur2 = null;
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        joueur3.joindreCasino(casino1);
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        joueur4.joindreCasino(casino1);
        joueur4 = null;
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        joueur5.joindreCasino(casino1);
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        */
        
        
        
        // Test quitterCasino
        /*
        Casino casino1 = new Casino("Deux-Montagnes", 3);
        Casino casino2 = new Casino("Shawi", 3);
        Joueur joueur1 = new Joueur("Alex", 100);
        Joueur joueur2 = new Joueur("Josée", 25);
        Joueur joueur3 = new Joueur("Sylvain", 100000);
        Joueur joueur4 = new Joueur("Bob", 1);
        
        
        
        joueur1.joindreCasino(casino2);
        //joueur1.joindreCasino(casino1);
        
        System.out.println(casino1);
        System.out.println(casino2);
        
        //joueur1.quitterCasino(casino2);
        joueur1.quitterCasino(casino1);
        
        
        
        
        
//        joueur1.joindreCasino(casino1);
//        joueur1.quitterCasino(casino1);
//        joueur1.joindreCasino(casino1);
        
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino1);
        
        System.out.println("");
        System.out.println(casino1);
        
        joueur4.quitterCasino(casino1);
        joueur2.quitterCasino(casino1);
        
        System.out.println("");
        System.out.println(casino1);
        
        joueur1.quitterCasino(casino1);
        joueur3.quitterCasino(casino1);
        
        System.out.println("");
        System.out.println(casino1);
        
        joueur1.quitterCasino(casino1);
        
        System.out.println("");
        System.out.println(casino1);
        */
        
        
        
        
        // Test jouer 
        /*
        Casino casino1 = new Casino("Deux-Montagnes", 3);
        Casino casino2 = new Casino("Tatoine", 3);
        Joueur joueur2 = new Joueur("Alex", 100);
        Joueur joueur1 = new Joueur(joueur2);
        Joueur joueur3 = new Joueur("Sylvain", 100000);
        */
        
        /*
        joueur1.jouer(50);
        */
        
        
        
        
        
        /*
        System.out.println("");
        System.out.println(joueur1);
        System.out.println("");
        
        joueur1.joindreCasino(casino1);
        
        joueur1.jouer(100);
        joueur1.jouer(100);
        
        System.out.println(joueur1);
        System.out.println("");
        joueur1.quitterCasino(casino1);
        System.out.println("");
        joueur1.jouer(100);
        
        System.out.println(joueur1);
        System.out.println("");
        
        joueur1.joindreCasino(casino1);
        
        System.out.println("");
        System.out.println(joueur1);
        */
        
        //--------------------------------------------
        //Test de la classe Jeu
        //--------------------------------------------
        
        
        //Test constructeur avec arguments + getNom + toString
        /*
        Jeu jeu1 = new Jeu("Jeu de roulette");
        System.out.println("");
        System.out.println(jeu1 + " " + jeu1.getNom());
        
        
        //Test constructeur sans arguments + getNom + toString
        
        Jeu jeu2 = new Jeu();
        System.out.println("");
        System.out.println(jeu2 + " " + jeu2.getNom());
        
        
        //Test constructeur par copie + getNom + toString
        
        Jeu jeu3 = new Jeu(jeu1);
        System.out.println("");
        System.out.println(jeu3 + " " + jeu3.getNom());
*/
        
        
        
        //Test equals
        
        /*
        Jeu jeu1 = new Jeu("Jeu de dés");
        Jeu jeu2 = new Jeu("Roulette");
        Jeu jeu3 = new Jeu("Jeu de dés");
        System.out.println(jeu1.equals(jeu2));
        System.out.println(jeu1.equals(jeu3));
        */
        
        
        // Test jeu de dès
        
        
        /*
        Jeu jeu1 = new Jeu("Jeu de dès");
        //System.out.println(jeu1.calculerGain(100));
        int resultat = jeu1.calculerGain(100);
        System.out.println("");
        System.out.println(resultat);
        */
        
        
        
        
        
        
        
        
        
        // Autre test
        
        /*
        
        Casino casino1 = new Casino("Vegas", 5);
        Joueur joueur1 = new Joueur("Alpha", 1000);
        Joueur joueur2 = new Joueur("Beta", 1000);
        Joueur joueur3 = new Joueur("Charlie", 1000);
        Joueur joueur4 = new Joueur("Delat", 1000);
        Joueur joueur5 = new Joueur("Gamma", 1000);
        Joueur joueur6 = new Joueur("Omega", 1000);
        
        
        System.out.println(casino1);
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino1);
        joueur4.joindreCasino(casino1);
        joueur5.joindreCasino(casino1);
        joueur6.joindreCasino(casino1);
        
        System.out.println(casino1);
        
        joueur1.jouer(1000);
        System.out.println("");
        System.out.println(joueur1);
        joueur2.jouer(1000);
        System.out.println("");
        System.out.println(joueur2);
        joueur3.jouer(1000);
        System.out.println("");
        System.out.println(joueur3);
        
        joueur1.jouer(1000);
        System.out.println("");
        System.out.println(joueur1);
        joueur2.jouer(1000);
        System.out.println("");
        System.out.println(joueur2);
        joueur3.jouer(1000);
        System.out.println("");
        System.out.println(joueur3);
        
        joueur1.quitterCasino(casino1);
        System.out.println("");
        System.out.println(joueur1);
        joueur2.quitterCasino(casino1);
        System.out.println("");
        System.out.println(joueur2);
        joueur3.quitterCasino(casino1);
        System.out.println("");
        System.out.println(joueur3);

        joueur1.joindreCasino(casino1);
        System.out.println("");
        System.out.println(joueur1);
        joueur2.joindreCasino(casino1);
        System.out.println("");
        System.out.println(joueur2);
        joueur3.joindreCasino(casino1);
        System.out.println("");
        System.out.println(joueur3);
        joueur6.joindreCasino(casino1);
        System.out.println("");
        System.out.println(joueur6);
        
        joueur1.quitterCasino(casino1);
        joueur2.quitterCasino(casino1);
        joueur3.quitterCasino(casino1);
        joueur4.quitterCasino(casino1);
        joueur5.quitterCasino(casino1);
        joueur6.quitterCasino(casino1);
        */
        
        
        
        
        
    }
    
}
