package onitama;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

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
            tasserPioche();
        }
    }
    
    public void piocherCarteEchiquier(){
        grilleJeu.carteEchiquier = piochePartie.cartePioche[0];
        tasserPioche();
    }
    
    public void tasserPioche(){
        
        for (int i=0; i < piochePartie.cartePioche.length-1; i++){
            piochePartie.cartePioche[i] = piochePartie.cartePioche[i+1];            
        }
        piochePartie.cartePioche[piochePartie.cartePioche.length-1] = null;
    }
    
    public void placerTemple(){
        grilleJeu.Cellules[0][2].templeBleu=true;
        grilleJeu.Cellules[4][2].templeRouge=true;        
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
    
    public int choisirCarte(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le numéro de la carte que vous souhaitez jouer");
        int numero=sc.nextInt();
        
        if (numero != 1 && numero !=2){
            System.out.println("Choisissez un numéro de carte valide");
            choisirCarte();
        }
        else{
            Carte carteAJouer=joueurCourant.listeCartes[numero-1];
            return numero;
        }return 0;        
    }
    
    public int[] choisirPion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le numéro de la ligne de la pièce que vous souhaitez déplacer");
        int x=sc.nextInt()-1;
        System.out.println("Saisir le numéro de la colonne de la pièce que vous souhaitez déplacer");
        int y=sc.nextInt()-1;
        
        Piece pieceADeplacer;
        
        if (this.grilleJeu.Cellules[x][y].pieceCourante != null){
            if (this.grilleJeu.Cellules[x][y].pieceCourante.couleur.equals(joueurCourant.couleur)){
                pieceADeplacer = this.grilleJeu.Cellules[x][y].pieceCourante;
                int[] coordonneesPiece = {x,y};
                return coordonneesPiece;
            }
            else{
                System.out.println("Saisissez des coordonnées de pièces correspondant à une de vos pièces");
                choisirPion();
            }
        }
        else{
            System.out.println("Saisissez des coordonnées de pièces correspondant à une de vos pièces");
            choisirPion();
        }return null;        
    }
    
    public int[] choisirDeplacement(Piece pieceADeplacer, Carte carteAJouer, int[] coordonneesPiece,int numero){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le numéro de la ligne où vous souhaitez déplacer votre pièce");
        int x=sc.nextInt()-1;
        System.out.println("Saisir le numéro de la colonne où vous souhaitez déplacer votre pièce");
        int y=sc.nextInt()-1;
        
        if (x > 4 || x < 0 || y > 4 || y < 0){
            System.out.println("Saisissez des coordonnées correctes");
            choisirDeplacement(pieceADeplacer, carteAJouer, coordonneesPiece,numero);
        }
                
        if(grilleJeu.Cellules[x][y].pieceCourante != null){
            if(!grilleJeu.Cellules[x][y].pieceCourante.couleur.equals(joueurCourant.couleur)){
                int xVect = x - coordonneesPiece[0];
                int yVect = y - coordonneesPiece[1];
                
                for (int i=0; i < carteAJouer.tabDeplacement.length; i++){
                    if (xVect == carteAJouer.tabDeplacement[i][0] && yVect == carteAJouer.tabDeplacement[i][1]){
                        int[] tabVecteur = {xVect,yVect};
                        echangerCarte(joueurCourant,numero);
                        return tabVecteur;
            }
            }
            }
            else{
                System.out.println("Vous ne pouvez pas manger vos propre pion");
                choisirDeplacement(pieceADeplacer, carteAJouer, coordonneesPiece,numero);
            }
    }
        else{
            int xVect = x - coordonneesPiece[0];
            int yVect = y - coordonneesPiece[1];
            
            for (int i=0; i < carteAJouer.tabDeplacement.length; i++){
                    if (xVect == carteAJouer.tabDeplacement[i][0] && yVect == carteAJouer.tabDeplacement[i][1]){
                        int[] tabVecteur = {xVect,yVect};
                        echangerCarte(joueurCourant,numero);
                        return tabVecteur;                       
            }               
            }
            }System.out.println("Saisissez des coordonnées valides de déplacement par rapport à la carte choisie");
            choisirDeplacement(pieceADeplacer, carteAJouer, coordonneesPiece,numero);
            return null;
        }
    
    public void deplacerPion(int[] tabVecteur, Piece pieceADeplacer, int[] coordonneesPiece){
        int xArrivee = coordonneesPiece[0] + tabVecteur[0];
        int yArrivee = coordonneesPiece[1] + tabVecteur[1];
        grilleJeu.Cellules[xArrivee][yArrivee].pieceCourante = pieceADeplacer;
        grilleJeu.Cellules[coordonneesPiece[0]][coordonneesPiece[1]].pieceCourante = null;
        
    }
    
    
       public void attribuerCouleursAuxJoueurs() {  //Attribution des couleurs au hasard
        Random r = new Random();
        boolean couleur;
        couleur = r.nextBoolean();
        if (couleur) {
            listeJoueurs[0].couleur = "Rouge";
            listeJoueurs[1].couleur = "Bleu";
        } else {
            listeJoueurs[0].couleur = "Bleu";
            listeJoueurs[1].couleur = "Rouge";

        }
    }
    
    public void initialiserPartie(){
        grilleJeu.viderGrille();
        
        Scanner sc = new Scanner(System.in);    // Création des joueurs
        
        System.out.println("Le pseudo du joueur 1 est :");
        Joueur J1 = new Joueur(sc.nextLine());
        
        System.out.println("Le pseudo du joueur 2 est :");
        Joueur J2 = new Joueur(sc.nextLine());
        
        listeJoueurs[0] = J1;
        listeJoueurs[1] = J2;
        
        attribuerCouleursAuxJoueurs();
        
        System.out.println("Le joueur "+J1.nom+" est de couleur "+J1.couleur);
        System.out.println("Le joueur "+J2.nom+" est de couleur "+J2.couleur);       
        
        placerTemple();
        placerPieces();
        placerPieces();
        
        piocherCarteEchiquier();
        piocherCarte(J1);
        piocherCarte(J2);
        
        Random r = new Random();    //On définit au hasard le premier joueur
        boolean premierJoueur = r.nextBoolean();
        if (premierJoueur) {
            joueurCourant = listeJoueurs[0];
        } else {
            joueurCourant = listeJoueurs[1];
        }
        
    }
    
    public void tourDeJeu(){
        
    }
}


