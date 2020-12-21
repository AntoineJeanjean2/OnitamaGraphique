/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama;

/**
 *
 * @author antoi
 */
public class Onitama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenue dans le jeu Onitama");
        Partie premierePartie = new Partie();
        premierePartie.debuterPartie();
    }
    
}
