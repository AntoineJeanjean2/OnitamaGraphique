package onitama;

import java.util.Random;
import java.util.Scanner;

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
    
    public void placerTemple(){
        grilleJeu.Cellules[0][2].templeBleu=true;
        grilleJeu.Cellules[5][2].templeRouge=true;        
    }
    
    public void placerPieces(){
        grilleJeu.Cellules[0][2].pieceCourante = listeJoueurs[0].listePieces[0];
        grilleJeu.Cellules[0][0].pieceCourante = listeJoueurs[0].listePieces[1];
        grilleJeu.Cellules[0][1].pieceCourante = listeJoueurs[0].listePieces[2];
        grilleJeu.Cellules[0][3].pieceCourante = listeJoueurs[0].listePieces[3];
        grilleJeu.Cellules[0][4].pieceCourante = listeJoueurs[0].listePieces[4];
        
        grilleJeu.Cellules[4][2].pieceCourante = listeJoueurs[1].listePieces[0];
        grilleJeu.Cellules[4][0].pieceCourante = listeJoueurs[1].listePieces[1];
        grilleJeu.Cellules[4][1].pieceCourante = listeJoueurs[1].listePieces[2];
        grilleJeu.Cellules[4][3].pieceCourante = listeJoueurs[1].listePieces[3];
        grilleJeu.Cellules[4][4].pieceCourante = listeJoueurs[1].listePieces[4];
}
    
    public boolean choisirCarte(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le numéro de la carte que vous souhaitez jouer");
        int numero=sc.nextInt();
        
        if (numero != 1 && numero !=2){
            System.out.println("Choisissez un numéro de carte valide");
            choisirCarte();
        }
        else{
            Carte carteAJouer=joueurCourant.listeCartes[numero-1];
            return true;
        }return false;        
    }
    
    public boolean choisirPion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le numéro de la ligne du pion que vous souhaitez déplacer");
        int x=sc.nextInt();
        System.out.println("Saisir le numéro de la colonne du pion que vous souhaitez déplacer");
        int y=sc.nextInt();
        
        Piece pieceADeplacer;
        
        if (this.grilleJeu.Cellules[x][y].pieceCourante != null){
            if (this.grilleJeu.Cellules[x][y].pieceCourante.couleur.equals(joueurCourant.couleur)){
                pieceADeplacer = this.grilleJeu.Cellules[x][y].pieceCourante;
                return true;
            }
            else{
                System.out.println("Saisissez des coordonnées de pièces correspondant à une de vos pièces");
                choisirPion();
            }
        }
        else{
            System.out.println("Saisissez des coordonnées de pièces correspondant à une de vos pièces");
            choisirPion();
        }return false;        
    }
}

