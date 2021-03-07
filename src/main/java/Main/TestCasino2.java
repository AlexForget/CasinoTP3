package Main;

import Casinos.*;
import Joueurs.*;
import Jeux.*;

public class TestCasino2 {
    
    public static void main(String[] args) {
        
        //-----------------------------------------------
        // Test de la classe CasinoLegal
        //-----------------------------------------------
        
        //Test des constructeurs
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Test", 10);
        Casino casino2 = new CasinoLegal();
        Casino casino3 = new CasinoLegal(casino1);
        JoueurPauvre joueur1 = new JoueurPauvre("Alex", 10);
        
        
        
        System.out.println(casino1);
        joueur1.joindreCasino(casino1);
        System.out.println(joueur1);
        System.out.println(casino1);
        
        
        
        System.out.println(casino1);
        System.out.println("");
        System.out.println(casino2);
        System.out.println("");
        System.out.println(casino3);
        */
        
        
        //Test calcul du capital du casino
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Vegas", 20);
        Casino casino2 = new CasinoLegal("Terrebonne", 20);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 1000);
        Joueur joueur3 = new JoueurPauvre("Ringo", 1000);
        Joueur joueur4 = new JoueurPauvre("Pete", 1000);
        
        
        
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino2);
        joueur4.joindreCasino(casino2);
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        System.out.println(casino2);
        System.out.println("");
        joueur1.jouer(100, "Des");
        joueur2.jouer(100, "Des");
        joueur3.jouer(100, "Des");
        joueur4.jouer(100, "Des");
        joueur1.jouer(100, "Roulette");
        joueur2.jouer(100, "Roulette");
        joueur3.jouer(100, "Roulette");
        joueur4.jouer(100, "Roulette");
        System.out.println(joueur1);
        System.out.println("");
        System.out.println(joueur2);
        System.out.println("");
        System.out.println(joueur3);
        System.out.println("");
        System.out.println(joueur4);
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        System.out.println(casino2);
        System.out.println("");
        */
        
        
        // Test acceseur et mutateur CasinoLegal
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Vegas", 20);
        Casino casino2 = new CasinoLegal("Terrebonne", 2000);
        
        System.out.println("getJeu " + casino1.getJeu());
        System.out.println("get joueur present " + casino1.getJoueursPresent());
        System.out.println("get joueur present max " + casino1.getJoueursPresentMax());
        System.out.println("get nom " + casino1.getNom());
        System.out.println("get tableau joueur " + casino1.getTabJoueur());
        casino1.setJoueurPresentMax(1000);
        casino1.setCapital(-500);
        System.out.println(casino1);
        casino1.setCapital(500);
        System.out.println(casino1);
        
        System.out.println("getJeu " + casino2.getJeu());
        System.out.println("get joueur present " + casino2.getJoueursPresent());
        System.out.println("get joueur present max " + casino2.getJoueursPresentMax());
        System.out.println("get nom " + casino2.getNom());
        System.out.println("get tableau joueur " + casino2.getTabJoueur());
        casino2.setJoueurPresentMax(1);
        casino2.setCapital(-100);
        System.out.println(casino2);
        casino2.setCapital(100);
        System.out.println(casino2);
        */
        
        
        // Test equals CasinoLegal
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Test", 10);
        Casino casino2 = new CasinoLegal("Test", 1);
        Casino casino3 = new CasinoLegal(casino1);
        Joueur joueur1 = new JoueurPauvre("Alex", 1000);
        Joueur joueur2 = new JoueurPauvre("Grant", 100);
        
        
        System.out.println(casino1.equals(casino2));
        System.out.println(casino1.equals(casino3));
        
        joueur1.joindreCasino(casino3);
        
        System.out.println(casino1.equals(casino2));
        System.out.println(casino1.equals(casino3));
        
        joueur2.joindreCasino(casino1);
        
        System.out.println(casino1.equals(casino2));
        System.out.println(casino1.equals(casino3));
        */
        
        
        
        // Test compareTo 
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Legal", 10);
        Casino casino2 = new CasinoIndien("Indien", 10);
        Joueur joueur1 = new JoueurRiche("Beth", 10000);
        Joueur joueur2 = new JoueurPauvre("Bart", 1000);
        Joueur joueur3 = new JoueurRiche("Bob", 10000);
        Joueur joueur4 = new JoueurPauvre("Billy", 100);
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino2);
        joueur4.joindreCasino(casino2);
        
        System.out.println(casino1.compareTo(casino2));        
        */
        
        
        
        // test interface ImpotFoncier evaluation
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Vegas", 10);
        Casino casino2 = new CasinoLegal("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 1000);
        Joueur joueur3 = new JoueurPauvre("Pete", 1000);
        Joueur joueur4 = new JoueurPauvre("George", 1000);
        
        
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino1);
        joueur4.joindreCasino(casino2);
        
        System.out.println(casino1.evaluationMunicipal());
        System.out.println(casino2.evaluationMunicipal());
        
        joueur4.quitterCasino(casino2);
        joueur2.quitterCasino(casino1);
        
        System.out.println(casino1.evaluationMunicipal());
        System.out.println(casino2.evaluationMunicipal());
        */
        
        
        
        // test un seul tableau pour joueur riche et pauvre
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("La Tuque", 10);
        Casino casino2 = new CasinoIndien("Oka", 10);
        Joueur joueur1 = new JoueurRiche("John", 1000);
        Joueur joueur2 = new JoueurRiche("Paul", 1000);
        Joueur joueur3 = new JoueurPauvre("Ringo", 1000);
        Joueur joueur4 = new JoueurPauvre("Pete", 1000);
        
        joueur1.joindreCasino(casino1);
        joueur3.joindreCasino(casino1);
        joueur2.joindreCasino(casino2);
        joueur4.joindreCasino(casino2);
        
        System.out.println(casino1);
        System.out.println(casino2);
        */
        
        
        // test methode collecterImpot
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("La Tuque", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 799);
        Joueur joueur3 = new JoueurPauvre("Ringo", 1000);
        Joueur joueur4 = new JoueurPauvre("Pete", 1000);
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);

        System.out.println(casino1);
        System.out.println("");
        System.out.println(joueur1);
        System.out.println("");
        System.out.println(joueur2);
        System.out.println("");
        
        ((CasinoLegal)casino1).collecterImpot();
        
        System.out.println(casino1);
        System.out.println("");
        System.out.println(joueur1);
        System.out.println("");
        System.out.println(joueur2);
        */
        
        
        
        // test payerImpot
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("La Tuque", 10);
        Joueur joueur1 = new JoueurPauvre("John", 100000);
        Joueur joueur2 = new JoueurPauvre("Paul", 799);
        Joueur joueur3 = new JoueurPauvre("Ringo", 1000);
        Joueur joueur4 = new JoueurPauvre("Pete", 1000);
        
        System.out.println(casino1);
        
        casino1.payerImpots();
        
        joueur1.joindreCasino(casino1);
        
        joueur1.jouer(5000, "des");
        
        System.out.println("");
        
        casino1.payerImpots();
        
        joueur1.jouer(5000, "Roulette");
        
        System.out.println("");
        
        casino1.payerImpots();
        
        joueur1.jouer(5000, "Des");
        
        System.out.println("");
        
        casino1.payerImpots();
        */
        
        
        
        // test jeu CasinoLegal overide Casino
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Vegas", 10);
        Casino casino2 = new CasinoLegal("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 1000);
        Joueur joueur3 = new JoueurPauvre("Pete", 1000);
        Joueur joueur4 = new JoueurPauvre("George", 1000);
        
        joueur1.joindreCasino(casino1);
        System.out.println(casino1);
        System.out.println("");
        joueur1.jouer(100, "Des");
        System.out.println(casino1);
        System.out.println("");
        joueur1.jouer(100, "Roulette");
        System.out.println(casino1);
        System.out.println("");
        joueur1.jouer(100, "Des");
        System.out.println(casino1);
        System.out.println("");
        */
        
        
        // Test super show de notre ami Greg!!!!!
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Vegas", 10);
        Casino casino2 = new CasinoLegal("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 1000);
        Joueur joueur3 = new JoueurPauvre("Pete", 1000);
        Joueur joueur4 = new JoueurPauvre("George", 1000);
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino2);
        joueur4.joindreCasino(casino2);
        
        joueur1.jouer(100, "Des");
        joueur2.jouer(100, "Des");
        joueur3.jouer(100, "Des");
        joueur4.jouer(100, "Des");
        
        ((CasinoLegal)casino1).debutSpectacle();
        
        joueur1.jouer(100, "Roulette");
        joueur2.jouer(100, "Roulette");
        joueur3.jouer(100, "Roulette");
        joueur4.jouer(100, "Roulette");
        
        ((CasinoLegal)casino1).finSpectacle();
        
        joueur1.jouer(100, "Roulette");
        joueur2.jouer(100, "Roulette");
        */
        
        
        //-----------------------------------------------
        // Test de la classe CasinoIndien
        //-----------------------------------------------
        
        
        //Test des constructeurs
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoIndien();
        Casino casino3 = new CasinoIndien(casino1);
        Joueur joueur1 = new JoueurPauvre("Alex", 10);
        
        
        
        System.out.println(casino1);
        joueur1.joindreCasino(casino1);
        System.out.println(joueur1);
        System.out.println(casino1);
        
        
        
        System.out.println(casino1);
        System.out.println("");
        System.out.println(casino2);
        System.out.println("");
        System.out.println(casino3);
        */
        
        // Test getter, setter de la classe mére
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Vegas", 20);
        Casino casino2 = new CasinoIndien("Terrebonne", 2000);
        
        System.out.println("getJeu " + casino1.getJeu());
        System.out.println("get joueur present " + casino1.getJoueursPresent());
        System.out.println("get joueur present max " + casino1.getJoueursPresentMax());
        System.out.println("get nom " + casino1.getNom());
        System.out.println("get tableau joueur " + casino1.getTabJoueur());
        casino1.setJoueurPresentMax(1000);
        casino1.setCapital(-500);
        System.out.println(casino1);
        casino1.setCapital(500);
        System.out.println(casino1);
        
        System.out.println("getJeu " + casino2.getJeu());
        System.out.println("get joueur present " + casino2.getJoueursPresent());
        System.out.println("get joueur present max " + casino2.getJoueursPresentMax());
        System.out.println("get nom " + casino2.getNom());
        System.out.println("get tableau joueur " + casino2.getTabJoueur());
        casino2.setJoueurPresentMax(1);
        casino2.setCapital(-100);
        System.out.println(casino2);
        casino2.setCapital(100);
        System.out.println(casino2);
        */
        
        
        //Test calcul du capital du casino
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 20);
        Casino casino2 = new CasinoIndien("Terrebonne", 20);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 1000);
        Joueur joueur3 = new JoueurPauvre("Ringo", 1000);
        Joueur joueur4 = new JoueurPauvre("Pete", 1000);
        
        
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino2);
        joueur4.joindreCasino(casino2);
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        System.out.println(casino2);
        System.out.println("");
        joueur1.jouer(100, "Des");
        joueur2.jouer(100, "Des");
        joueur3.jouer(100, "Des");
        joueur4.jouer(100, "Des");
        joueur1.jouer(100, "Roulette");
        joueur2.jouer(100, "Roulette");
        joueur3.jouer(100, "Roulette");
        joueur4.jouer(100, "Roulette");
        System.out.println(joueur1);
        System.out.println("");
        System.out.println(joueur2);
        System.out.println("");
        System.out.println(joueur3);
        System.out.println("");
        System.out.println(joueur4);
        System.out.println("");
        System.out.println(casino1);
        System.out.println("");
        System.out.println(casino2);
        System.out.println("");
        */
        
        
        // Test equals CasinoIndien
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Test", 10);
        Casino casino2 = new CasinoIndien("Test", 1);
        Casino casino3 = new CasinoIndien(casino1);
        Casino casino4 = new CasinoLegal("Test", 10);
        Joueur joueur1 = new JoueurPauvre("Alex", 1000);
        Joueur joueur2 = new JoueurPauvre("Grant", 100);
        
        
        System.out.println(casino1.equals(casino2));
        System.out.println(casino1.equals(casino3));
        
        joueur1.joindreCasino(casino3);
        
        System.out.println(casino1.equals(casino2));
        System.out.println(casino1.equals(casino3));
        
        joueur2.joindreCasino(casino1);
        
        System.out.println(casino1.equals(casino2));
        System.out.println(casino1.equals(casino3));
        
        System.out.println(casino1.equals(casino4));
        */
        
        
        
        // Test compareTo 
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Riche", 10);
        Casino casino2 = new CasinoIndien("Pauvre", 10);
        
        casino1.setCapital(10000);
        casino2.setCapital(10);
        System.out.println(casino1.compareTo(casino2));
        System.out.println("");
        
        casino1.setCapital(10);
        casino2.setCapital(10000);
        System.out.println(casino1.compareTo(casino2));
        System.out.println("");
        
        casino1.setCapital(10000);
        casino2.setCapital(10000);
        System.out.println(casino1.compareTo(casino2));
        System.out.println("");
        */
        
        
        
        // test interface ImpotFoncier evaluation
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 1000);
        Joueur joueur3 = new JoueurPauvre("Pete", 1000);
        Joueur joueur4 = new JoueurPauvre("George", 1000);
        
        
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino1);
        joueur4.joindreCasino(casino2);
        
        System.out.println(casino1.evaluationMunicipal());
        System.out.println(casino2.evaluationMunicipal());
        
        joueur4.quitterCasino(casino2);
        joueur2.quitterCasino(casino1);
        
        System.out.println(casino1.evaluationMunicipal());
        System.out.println(casino2.evaluationMunicipal());
        */
        
        
        
        // test descente de police
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 1000);
        Joueur joueur3 = new JoueurPauvre("Pete", 1000);
        Joueur joueur4 = new JoueurPauvre("George", 1000);
        
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino1);
        joueur4.joindreCasino(casino1);
        
        System.out.println(casino1);
        
        ((CasinoIndien)casino1).descenteDePolice();
        
        System.out.println(casino1);
        
        System.out.println("");
        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println(joueur3);
        System.out.println(joueur4);
        
        joueur3.joindreCasino(casino1);
        
        System.out.println("");
        System.out.println(casino1);
        */
        
        /*
        casino1.descenteDePolice();
        */
        
        
        
        // Test trierEtExpulser
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 500);
        Joueur joueur3 = new JoueurPauvre("Pete", 2000);
        Joueur joueur4 = new JoueurPauvre("George", 800);
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino1);
        joueur4.joindreCasino(casino1);
        
        System.out.println(casino1);
        
        ((CasinoIndien)casino1).trierEtExpulser(2);
        
        System.out.println(casino1);
        System.out.println("");
        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println(joueur3);
        System.out.println(joueur4);
        */
        
        
        // Test payerImpôts  --  Pour les tests j'ai fait en sorte qu'il y est 50% de chance de payer de l'impot au lieu de 1%
        // C'est maintenant le 1% qui est .crit dans la méthode
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 500);
        Joueur joueur3 = new JoueurPauvre("Pete", 2000);
        Joueur joueur4 = new JoueurPauvre("George", 800);
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino1);
        joueur4.joindreCasino(casino1);
        joueur1.jouer(100, "Des");
        joueur2.jouer(100, "Des");
        joueur3.jouer(100, "Des");
        joueur4.jouer(100, "Des");
       
        
        casino1.payerImpots();
        */
        
        
        //-------------------------------------
        // Test classe Joueur
        //-------------------------------------
        
        // test comparable classe joueur
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        
        /*
        Joueur joueur1 = new JoueurPauvre("b", 1000);
        Joueur joueur2 = new JoueurPauvre("c", 500);
        Joueur joueur3 = new JoueurPauvre("a", 2000);
        Joueur joueur4 = new JoueurPauvre("b", 1000);
        */
        /*
        Joueur joueur1 = new JoueurPauvre("b", 1000);
        Joueur joueur2 = new JoueurPauvre("bc", 1000);
        Joueur joueur3 = new JoueurPauvre("ab", 1000);
        Joueur joueur4 = new JoueurPauvre("bb", 1000);
        

        
        System.out.println(joueur1.compareTo(joueur2));
        System.out.println(joueur1.compareTo(joueur3));
        System.out.println(joueur1.compareTo(joueur4));
        */
        
        
        // Test joueur pauvre ou riche joindre casino
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoLegal("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurRiche("John", 1);
        Joueur joueur2 = new JoueurRiche("Paul", 1000);
        Joueur joueur3 = new JoueurPauvre("Pete", 1);
        Joueur joueur4 = new JoueurPauvre("George", 10);
        
        joueur1.joindreCasino(casino1);
        joueur2.joindreCasino(casino1);
        joueur3.joindreCasino(casino1);
        joueur4.joindreCasino(casino1);
        System.out.println("");
        System.out.println("");
        
        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println(joueur3);
        System.out.println(joueur4);
        System.out.println("");
        System.out.println("");
        
        System.out.println(casino1);
        */
        
        //-------------------------------------
        // Test classe JoueurRiche
        //-------------------------------------
        
        //test constructeurs
        //***********************************************
        
        /*
        Joueur joueur1 = new JoueurRiche("Alex", 100);
        Joueur joueur2 = new JoueurRiche();
        Joueur joueur3 = new JoueurRiche(joueur1);
        
        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println(joueur3);
        */
        
        
        // test getter et setter par héritage
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoLegal("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurRiche("John", 1000);
        Joueur joueur2 = new JoueurRiche("Paul", 500);
        Joueur joueur3 = new JoueurRiche("Pete", 2000);
        Joueur joueur4 = new JoueurRiche("George", 800);
        
        System.out.println(joueur1.getCapital());
        System.out.println(joueur1.getNom());
        System.out.println(joueur1.getCasino());
        
        joueur1.setCapital(10000000);
        joueur1.setCasino(casino2);
        
        System.out.println(joueur1);
        */
        
        
        // Test equals par héritage
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoLegal("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurRiche("John", 1000);
        Joueur joueur2 = new JoueurRiche("Paul", 500);
        Joueur joueur3 = new JoueurRiche("John", 1000);
        Joueur joueur4 = new JoueurPauvre("John", 1000);
        
        System.out.println(joueur1.equals(joueur2));
        System.out.println(joueur1.equals(joueur3));
        System.out.println(joueur1.equals(joueur4));
        */
        
        
        // Test toString - over ride
        //***********************************************
        
        /*
        Joueur joueur1 = new JoueurRiche("John", 1000);
        
        System.out.println(joueur1);
        */
        
        
        // Test banqueRoute
        //***********************************************
        
        /*
        Casino casino1 = new CasinoIndien("Oka", 10);
        Casino casino2 = new CasinoLegal("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurRiche("John", 1000);
        Joueur joueur2 = new JoueurRiche("Paul", 500);
        Joueur joueur3 = new JoueurRiche("John", 1000);
        Joueur joueur4 = new JoueurPauvre("John", 1000);
        
        joueur1.joindreCasino(casino1);
        System.out.println(joueur1);
        System.out.println(casino1);
        ((JoueurRiche)joueur1).banqueRoute();
        System.out.println(joueur1);
        System.out.println(casino1);
        
        ((JoueurRiche)joueur2).banqueRoute();
        joueur2.joindreCasino(casino2);
        System.out.println(joueur2);
        System.out.println(casino1);
        */
        
        
        
        
        //-------------------------------------
        // Test classe JoueurPauvre
        //-------------------------------------
        
        // test constructeur
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre();
        Joueur joueur3 = new JoueurPauvre(joueur1);
        Joueur joueur4 = new JoueurRiche(joueur1);
        
        
        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println(joueur3);
        System.out.println(joueur4);
        */
        
        
        // test getter, setter en héritage
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 500);
        Joueur joueur3 = new JoueurPauvre("Pete", 2000);
        Joueur joueur4 = new JoueurRiche("George", 800);
        
        System.out.println(joueur1.getCapital());
        System.out.println(joueur1.getCasino());
        System.out.println(joueur1.getNom());
        
        joueur1.setCapital(100000);
        joueur1.setCasino(casino2);
        
        System.out.println(joueur1);
        */
        
        
        
        
        // Test toString
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 500);
        Joueur joueur3 = new JoueurPauvre("Pete", 2000);
        Joueur joueur4 = new JoueurRiche("George", 800);
        
        System.out.println(joueur1);
        
        joueur1.joindreCasino(casino1);
        
        System.out.println(joueur1);
        */
        
        
        
        // Test Equals
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 500);
        Joueur joueur3 = new JoueurPauvre(joueur1);
        Joueur joueur4 = new JoueurRiche("John", 1000);
        
        
        joueur1.joindreCasino(casino1);
        
        System.out.println(joueur1.equals(joueur2));
        System.out.println(joueur1.equals(joueur3));
        System.out.println(joueur1.equals(joueur4));
        */
        
        
        // test compare
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 500);
        Joueur joueur3 = new JoueurPauvre("Pete", 2000);
        Joueur joueur4 = new JoueurRiche("John", 1000);
        
        System.out.println(joueur1.compareTo(joueur2));
        System.out.println(joueur1.compareTo(joueur3));
        System.out.println(joueur1.compareTo(joueur4));
        */
        
        
        
        
        // test collecterCheque
        //***********************************************
        
        /*
        Casino casino1 = new CasinoLegal("Oka", 10);
        Casino casino2 = new CasinoIndien("St-Hipolyte", 10);
        Joueur joueur1 = new JoueurPauvre("John", 1000);
        Joueur joueur2 = new JoueurPauvre("Paul", 500);
        Joueur joueur3 = new JoueurPauvre(joueur1);
        Joueur joueur4 = new JoueurRiche("John", 1000);
        
        System.out.println(joueur1);
        ((JoueurPauvre)joueur1).collecterCheque();
        System.out.println(joueur1);
        */
        
        
        
        //-----------------------------------------------
        // Test de la classe JeuDes et JeuRoulette
        //-----------------------------------------------
        
        // test constructeurs + toString
        //***********************************************
        
        /*
        Jeu des1 = new JeuDes();
        Jeu des2 = new JeuDes(des1);
        Jeu roulette1 = new JeuRoulette();
        Jeu roulette2 = new JeuRoulette(roulette1);
        
        System.out.println(des1);
        System.out.println("");
        System.out.println(roulette1);
        System.out.println("");
        System.out.println(des2);
        System.out.println("");
        System.out.println(roulette2);
        System.out.println("");
        */
        
        // test equals en héritage
        //***********************************************
        
        /*
        Jeu des1 = new JeuDes();
        Jeu des2 = new JeuDes(des1);
        Jeu roulette1 = new JeuRoulette();
        Jeu roulette2 = new JeuRoulette(roulette1);
        
        System.out.println(des1.equals(des2));
        System.out.println(des1.equals(roulette1));
        System.out.println(des1.equals(roulette2));
        */
        
        
        // test calcul gain
        //***********************************************
        
        /*
        Jeu des = new JeuDes();
        Jeu roulette = new JeuRoulette();
        
        System.out.println(des.calculerGain(100));
        System.out.println(roulette.calculerGain(100));
        */
        
        
        
        
        
    }
    
}
