package onitama;


import onitama.Piece;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antoi
 */
public class Joueur {
    String nom;
    String couleur;
    Piece[] listePieces = new Piece[5];
    Carte[] listeCartes = new Carte[2];
    
    public Joueur(String unJoueur){
        nom=unJoueur;
    }
    
    public void affecterCouleur(String uneCouleur){
        couleur=uneCouleur;
    }
    
    public void definirPieces(){
        this.listePieces[0].type = "roi";
        for (int i=1; i<5; i++){
            this.listePieces[i].type = "pion";
        }
    }
}
