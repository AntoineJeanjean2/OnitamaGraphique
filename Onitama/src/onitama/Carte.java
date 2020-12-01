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
    int[][] tabDeplacement;
    String nom;
    
    public Carte(int[][] tabDeplacement, String unNom){        
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                tabDeplacement[i][j] = 0;
            }
        }
    }
    
    public void definirMotif(Carte uneCarte, int[][] tabCoup){        
        for (int i=0; i< tabCoup.length; i++){
             int x = tabCoup[i][0];
             int y = tabCoup[i][1];
             uneCarte.tabDeplacement[x][y]=1;       
            }
        }    
   
    
}    
