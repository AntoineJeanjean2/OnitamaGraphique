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
    
    public Carte(int[][] unTabDeplacement, String unNom){               
        int a = unTabDeplacement.length;               
        tabDeplacement = new int[a][2];
        
        for (int i = 0; i < tabDeplacement.length; i++){
            for (int j = 0; j < 2; j++){
                tabDeplacement[i][j] = unTabDeplacement[i][j];
            }
        }
        nom = unNom;
    }
    
    public void definirMotif(Carte uneCarte, int[][] tabCoup){        
        for (int i=0; i< tabCoup.length; i++){
             int x = tabCoup[i][0];
             int y = tabCoup[i][1];
             uneCarte.tabDeplacement[x][y]=1;       
            }
        }      
}    
