package onitama;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antoine et Thomas
 */
public class Piece {
    String type;
    String couleur;    
    BufferedImage img;
    /**
     * position x de la pièce sur la grille
     */
    int x;
    /**
     * position y de la pièce sur la grille
     */
    int y;

    public Piece(String type, String couleur) throws IOException {
        this.type = type;
        this.couleur = couleur;
        /**
         * Aprés avoir remonté l'erreur d'exception le plus haut possible dans le code,
         * on attrape cette exception et affiche un message d'erreur avec les lignes suivantes
         */
        String fileName = "/images/"+type+"."+couleur+".png";
        try{
                img=ImageIO.read(getClass().getResourceAsStream(fileName));
        }catch(Exception t){
            throw new IOException("Erreur sur "+fileName, t);
        }
    }

    
    
    public void attribuerCouleur(String uneCouleur){
        couleur=uneCouleur;
    }
    
}
