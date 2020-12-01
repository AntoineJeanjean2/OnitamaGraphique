package onitama;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antoi
 */
public class Partie {
    Joueur[] listeJoueurs = new Joueur[2];
    Grille grilleJeu;
    Joueur joueurCourant;
    Pioche piochePartie;
    
    public void echangerCarte(Joueur joueurCourant, int numeroCarte ){
        
        Carte temp = joueurCourant.listeCartes[numeroCarte];
        joueurCourant.listeCartes[numeroCarte] = grilleJeu.carteEchiquier;
        grilleJeu.carteEchiquier = temp;               
    }
    
    public void piocherCarte(Joueur unJoueur){        
        for (int i=0; i < unJoueur.listeCartes.length; i++){
            unJoueur.listeCartes[i] = piochePartie.cartePioche[0];
        }
    }
    
    public void tasserPioche(){
        
        for (int i=0; i < piochePartie.cartePioche.length-1; i++){
            piochePartie.cartePioche[i] = piochePartie.cartePioche[i+1];            
        }
        piochePartie.cartePioche[piochePartie.cartePioche.length-1] = null;
    }
}

