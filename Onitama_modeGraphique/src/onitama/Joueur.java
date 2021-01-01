package onitama;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import onitama.Piece;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Antoine et Thomas
 */
public class Joueur {
    String nom;
    String couleur;
    /**
     * On stock les pièces et les cartes dans des listes car le nombre d'élément stocké va varier
     */
    List<Piece> listePieces = new ArrayList<>();
    List<Carte> listeCartes = new ArrayList<>();

    public Joueur(String unJoueur) {
        nom = unJoueur;
    }

    public void affecterCouleur(String uneCouleur) {
        couleur = uneCouleur;
    }

    /**
     * initialise les pieces du joueur. 
     * Doit etre appele lorsque la couleur du joueur est définie
     */
    public void definirPieces() throws IOException {
        listePieces.add(new Piece("roi", couleur));
        for (int i = 1; i < 5; i++) {
            listePieces.add(new Piece("pion", couleur));
        }
    }

    /**
     * Cette fonction affiche les cartes du joeuer
     */
    public void afficherCartesJoueur() {
        listeCartes.forEach(c -> {
            System.out.println(c.nom);
            for (int j = 0; j < c.tabDeplacement.length; j++) {
                for (int k = 0; k < c.tabDeplacement[j].length; k++) {
                    System.out.print(c.tabDeplacement[j][k]);
                }
                System.out.println();
            }
        });
        System.out.println();
        System.out.println();
    }
}
