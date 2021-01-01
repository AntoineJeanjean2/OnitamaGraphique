package onitama;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
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
/**
 * Chaque cellule est liée à un JButton
 */
public class Cellule extends JButton {

    Piece piece;
    /**
     * si la cellule est un temple ou non
     */
    boolean templeBleu;
    boolean templeRouge;
    /**
     * si la cellule est une position de déplacement possible ou non
     */
    boolean posPossible = false;
    /**
     * définition de l'image assignée à la cellule
     */
    BufferedImage img;
    /**
     * permet d'acceder à la partie
     */
    Partie p;
    /**
     * définition de la position de la cellule avec ses coordonnées x et y
     */
    int x;
    int y;

    /**
     *
     * @param templeBleu
     * @param templeRouge
     * @param x
     * @param y
     * @param p
     * @throws IOException --> cela permet d'éviter les problèmes d'exception
     * liés à l'import des images
     */
    public Cellule(boolean templeBleu, boolean templeRouge, int x, int y, Partie p) throws IOException {
        this.templeBleu = templeBleu;
        this.templeRouge = templeRouge;
        this.p = p;
        this.x = x;
        this.y = y;
        /**
         * ces test associent les images des temples et des cases aux cellules
         * qui sont des temples et des cases
         */
        if (templeBleu) {
            img = ImageIO.read(getClass().getResourceAsStream("/images/templeBleu.png"));
        } else if (templeRouge) {
            img = ImageIO.read(getClass().getResourceAsStream("/images/templeRouge.png"));
        } else {
            img = ImageIO.read(getClass().getResourceAsStream("/images/case.png"));
        }
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * vérifie que la position de déplacement est possible avant
                 * d'initier le déplacement
                 */
                if (posPossible) {
                    p.deplacerPion(x, y);
                } else if (piece != null) {
                    p.choisirPiece(Cellule.this, piece);
                }
            }
        });
    }

    @Override
    /**
     * Dans cette fonction on dessine des signaux graphiques (des cercles de
     * couleurs) pour visualiser lorsqu'une pièce à été sélectionner et
     * lorsqu'une cellule est une position possible de déplacement
     */
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
        if (this.piece != null) {
            g.drawImage(piece.img, 0, 0, null);
        }
        if (this.piece != null && this.piece == p.pieceCourante) {
            g.setColor(Color.GREEN);
            g.drawOval(0, 0, img.getWidth(), img.getHeight());
        } else if (posPossible) {
            g.setColor(Color.MAGENTA);
            g.drawOval(0, 0, img.getWidth(), img.getHeight());
        }
    }

    /**
     * On redéfini les dimensions (dans les 2 fonctions car sinon ça marche pas)
     * afin de pouvoir utiliser getSize et getMinimumSize plus tard
     */
    @Override
    public Dimension getSize() {
        return new Dimension(140, 140);
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(140, 140);
    }

}
