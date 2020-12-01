package onitama;


import onitama.Grille;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antoi
 */
public class Carte {
    Grille grilleCarte;
    String nom;
    
    public Carte(Grille grilleCarte, String unNom){        
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                grilleCarte.Cellules[i][j] = null;
            }
        }
    }
    
    public void definirMotif(Carte uneCarte, int[][] placementMotif){
        
        for (int i=0; i< placementMotif.length; i++){
             int x = placementMotif[i][0];
             int y = placementMotif[i][1];
             uneCarte.grilleCarte.Cellules[x][y].motifDeplacement = true;        
            }
        }
        
                
}    
