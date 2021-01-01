package onitama;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Antoine et Thomas
 */
/**
 * Chaque carte est liée à un JButton
 */
public class Carte extends JButton {
    int[][] tabDeplacement;
    String nom;
    BufferedImage img;
    Partie partie;

    /**
     * On définie une carte de déplacement avec un nom et avec ses déplacements *
     * possibles stockés dans un tab a 2 entrées
     */
    public Carte(int[][] unTabDeplacement, String unNom, Partie partie) throws IOException {
        int a = unTabDeplacement.length;
        tabDeplacement = new int[a][2];
        this.partie = partie;
        for (int i = 0; i < tabDeplacement.length; i++) {
            for (int j = 0; j < 2; j++) {
                tabDeplacement[i][j] = unTabDeplacement[i][j];
            }
        }
        nom = unNom;
        /**
         * Aprés avoir remonté l'erreur d'exception le plus haut possible dans le code,
         * on attrape cette exception et affiche un message d'erreur avec les lignes suivantes
         */
        String nomImage = "/images/" + nom + ".jpg";
        try {
            img = ImageIO.read(getClass().getResourceAsStream(nomImage));
        } catch (Exception e) {
            throw new IOException("Erreur sur l'image " + nomImage,e);
        }
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                partie.choisirCarte(Carte.this);
            }
        });
    }

    
    /**
     * De la meme façon que précédemment, on distingue la carte choisie par le 
     * joueur avec un cercle vert déssiné sur cette dernière
     */
    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
         if (this == partie.carteCourante) {
            g.setColor(Color.GREEN);
            g.drawOval(0,0, img.getWidth(), img.getHeight());
        } 
    }

}
