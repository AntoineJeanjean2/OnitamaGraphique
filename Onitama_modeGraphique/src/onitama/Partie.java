/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.*;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antoine et Thomas
 */
public class Partie extends javax.swing.JFrame {

    Joueur[] listeJoueurs = new Joueur[2];
    /**
     * La définition d'un joueur courant, d'une pièce courante et d'une carte
     * courante permet de simplifier les fonctions suivantes
     */
    Joueur joueurCourant;
    Cellule celluleCourante = null;
    Carte carteCourante = null;
    Piece pieceCourante = null;
    /**
     * Les coordonnées d'origine et d'arrivée servent lors d'un déplacement
     */
    int[] coordOrigin = new int[2];
    int[] coordDest = new int[2];
    int numero = 0;
    Cellule cellules[][] = new Cellule[5][5];
    Pioche piochePartie;
    /**
     * La carte échiquier est le nom donné à la carte visible des 2 joueurs
     */
    Carte carteEchiquier;

    public Partie() throws IOException {
        this.piochePartie = new Pioche(this);

        initComponents();

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                cellules[x][y] = new Cellule(y == 0 && x == 2, y == 4 && x == 2, x, y, this);
                panneauGrille.add(cellules[x][y]);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneauGrille = new javax.swing.JPanel();
        carteJoueur1 = new javax.swing.JPanel();
        carteJoueur2 = new javax.swing.JPanel();
        carteEchiquierPanel = new javax.swing.JPanel();
        panneauInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelJ1 = new javax.swing.JTextField();
        labelJ2 = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelJCourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        labelCouleurJ1 = new javax.swing.JLabel();
        labelCouleurJ2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneauGrille.setBackground(new java.awt.Color(255, 255, 255));
        panneauGrille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 700, 700));

        carteJoueur1.setBackground(new java.awt.Color(255, 255, 255));
        carteJoueur1.setLayout(new java.awt.GridLayout(1, 1));
        getContentPane().add(carteJoueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 300, 173));

        carteJoueur2.setBackground(new java.awt.Color(255, 255, 255));
        carteJoueur2.setLayout(new java.awt.GridLayout(1, 1));
        getContentPane().add(carteJoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, 300, 173));

        carteEchiquierPanel.setBackground(new java.awt.Color(255, 255, 255));
        carteEchiquierPanel.setLayout(new java.awt.GridLayout(1, 1));
        getContentPane().add(carteEchiquierPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 300, 173));

        panneauInfo.setBackground(new java.awt.Color(51, 204, 255));
        panneauInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Couleur :");
        panneauInfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 20));

        jLabel2.setText("Nom Joueur 2 :");
        panneauInfo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        labelJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelJ1ActionPerformed(evt);
            }
        });
        panneauInfo.add(labelJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, -1));
        panneauInfo.add(labelJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 90, -1));

        btnStart.setText("Démarrer la partie");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        panneauInfo.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel3.setText("Joueur Courant :");
        panneauInfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        labelJCourant.setText("nomJoueurCourant");
        panneauInfo.add(labelJCourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        message.setViewportView(txtMessage);

        panneauInfo.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 60));
        panneauInfo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 530, 30));

        jLabel4.setText("Nom Joueur 1 :");
        panneauInfo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        labelCouleurJ1.setText("couleurJ1");
        panneauInfo.add(labelCouleurJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 20));

        labelCouleurJ2.setText("couleurJ2");
        panneauInfo.add(labelCouleurJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 20));

        jLabel7.setText("Couleur :");
        panneauInfo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 20));

        getContentPane().add(panneauInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 550, 250));

        setBounds(0, 0, 1414, 787);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        try {
            /**
             * initialise la partie lorsque le bouton start est actionné
             */
            initialiserPartie();
            refresh();
            /**
             * Le bouton start est désativé après utilisation
             */
            btnStart.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(Partie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void labelJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelJ1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Partie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Partie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Partie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Partie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Partie().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Partie.class.getName()).log(Level.SEVERE, null, ex);
                    System.exit(2);
                }
            }
        });
    }

    /**
     * attribue aléatoirement une couleur à chaque joueur
     */
    public void attribuerCouleursAuxJoueurs() {
        Random r = new Random();
        boolean couleur;
        couleur = r.nextBoolean();
        if (couleur) {
            listeJoueurs[0].couleur = "Rouge";
            listeJoueurs[1].couleur = "Bleu";
            labelJ1.setBackground(Color.red);
            labelJ2.setBackground(Color.blue);
        } else {
            listeJoueurs[0].couleur = "Bleu";
            listeJoueurs[1].couleur = "Rouge";
            labelJ2.setBackground(Color.red);
            labelJ1.setBackground(Color.blue);
        }
    }

    /**
     * Place les pièces dans leurs positions initiales sur la grille
     */
    public void placerPieces() {
        for (Joueur j : listeJoueurs) {
            j.listePieces.get(0).x = 2;
            j.listePieces.get(1).x = 0;
            j.listePieces.get(2).x = 1;
            j.listePieces.get(3).x = 3;
            j.listePieces.get(4).x = 4;
        }
        if (listeJoueurs[0].couleur.equals("Bleu")) {
            listeJoueurs[0].listePieces.forEach(c -> c.y = 0);
            listeJoueurs[1].listePieces.forEach(c -> c.y = 4);
        } else {
            listeJoueurs[1].listePieces.forEach(c -> c.y = 0);
            listeJoueurs[0].listePieces.forEach(c -> c.y = 4);
        }
        for (Joueur j : listeJoueurs) {
            j.listePieces.forEach(p -> cellules[p.x][p.y].piece = p);
        }
    }

    public void piocherCarte(Joueur unJoueur) {
        for (int i = 0; i < 2; i++) {
            unJoueur.listeCartes.add(piochePartie.cartePioche.remove(0));
        }
    }

    public void piocherCarteEchiquier() {
        carteEchiquier = piochePartie.cartePioche.remove(0);
        /**
         * La carte de l'échiquier ne doit pas etre cliquable, sinon les joueurs
         * pourraient en utiliser les déplacements
         */
        carteEchiquier.setEnabled(false);
    }

    /**
     * On vide la grille de ses jetons
     */
    public void viderGrille() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cellules[i][j].piece = null;
                cellules[i][j].posPossible = false;
            }
        }
    }

    /**
     * C'est la première fonction qui est appelée, elle met en place les
     * éléments nécessaires au fonctionnement du jeu
     */
    public void initialiserPartie() throws IOException {
        panneauGrille.setEnabled(false);
        viderGrille();

        /**
         * Les joueurs entrent leurs pseudos
         */
        String nomJoueur1 = labelJ1.getText();
        Joueur J1 = new Joueur(nomJoueur1);
        labelJ1.setEnabled(false);

        String nomJoueur2 = labelJ2.getText();
        Joueur J2 = new Joueur(nomJoueur2);
        labelJ2.setEnabled(false);

        listeJoueurs[0] = J1;
        listeJoueurs[1] = J2;
        /**
         * On appele la fonction attribuerCouleursAuxJoueurs pour affecter une
         * couleur à chaque joueur
         */
        attribuerCouleursAuxJoueurs();

        J1.definirPieces();
        J2.definirPieces();

        /**
         * affichage de la couleur de chaque joueur à coté de son pseudo
         */
        labelCouleurJ1.setText(J1.couleur);
        labelCouleurJ2.setText(J2.couleur);

        /**
         * On place les pièces sur la grille
         */
        placerPieces();

        /**
         * On mélange la pioche et on attribue les cartes aux joueurs et la
         * carte de la grille
         */
        this.piochePartie.melangerPioche();
        piocherCarteEchiquier();
        piocherCarte(J1);
        piocherCarte(J2);

        /**
         * On définit au hasard le premier joueur
         */
        Random r = new Random();
        boolean premierJoueur = r.nextBoolean();
        if (premierJoueur) {
            setJoueurCourant(listeJoueurs[0]);
        } else {
            setJoueurCourant(listeJoueurs[1]);
        }
        refresh();
    }

    /**
     * La fonction refresh permet de rafraichir l'affichage de la grille et des
     * cartes
     */
    public void refresh() {
        invalidate();

        carteJoueur1.removeAll();
        carteJoueur1.add(joueurCourant.listeCartes.get(0));
        carteJoueur2.removeAll();
        carteJoueur2.add(joueurCourant.listeCartes.get(1));
        carteEchiquierPanel.removeAll();
        carteEchiquierPanel.add(carteEchiquier);

        panneauGrille.repaint();
        carteJoueur1.repaint();
        carteJoueur2.repaint();
        carteEchiquier.repaint();

        validate();
    }

    /**
     * Ici est définie la fonction principale du jeu : le déplacement des pièces
     */
    public void deplacerPion(int x, int y) {
        boolean victoire = false;
        Cellule destination = cellules[x][y];
        /**
         * Si la case de destination est occupée, on mange le pion si s'en est
         * un et on accorde la victoire au joueur courant si c'est un roi
         */
        if (destination.piece != null) {
            victoire = victoire | destination.piece.type.equals("roi");
            prochainJoueur().listePieces.remove(destination.piece);
        }
        Piece pieceDeplacee = celluleCourante.piece;
        /**
         * Dans le cas où la pièce déplacée est un roi, on vérifie si le roi se
         * déplace sur un temple de couleur opposée. Si c'est le cas on accorde
         * la victoire
         */
        if (pieceDeplacee.type.equals("roi")) {
            switch (pieceDeplacee.couleur) {
                case "Rouge":
                    victoire = victoire | destination.templeBleu;
                    break;
                case "Bleu":
                    victoire = victoire | destination.templeRouge;
                    break;
            }
        }

        /**
         * Maintenant que les conditions du déplacement ont étés vérifiées, on
         * affiche la pièce sur la position finale et on supprime la pièce sur
         * la position initiale
         */
        boolean fin = piochePartie.cartePioche.isEmpty();
        destination.piece = pieceDeplacee;
        pieceDeplacee.x = x;
        pieceDeplacee.y = y;

        celluleCourante.piece = null;

        /**
         * Si le boolean victoire a été affecté avec true, alors le joueur
         * courant est déclaré vainqueur. On interdit donc l'accès à la grille
         * mais on remet un accès au bouton start afin de pouvoir relancer une
         * nouvelle partie
         */
        if (victoire) {
            txtMessage.setText("Le joueur " + joueurCourant.nom + " a gagné");
            panneauGrille.setEnabled(false);
            btnStart.setEnabled(true);
            /**
             * Dans le cas où la pioche est épuisée, on déclare une égalité
             */
        } else if (fin) {
            txtMessage.setText("Egalité");
            panneauGrille.setEnabled(false);
            btnStart.setEnabled(true);
            /**
             * Sinon on passe simplement au joueur suivant
             */
        } else {
            echangerCarte(joueurCourant, carteCourante);
            setJoueurCourant(prochainJoueur());
            txtMessage.setText("Joueur suivant");
        }
        /**
         * les éléments courants sont réinitialisés
         */
        pieceCourante = null;
        celluleCourante = null;
        carteCourante = null;
        nettoyerPositions();
        refresh();
    }

    /**
     * Défini le joueur courant
     */
    public void setJoueurCourant(Joueur j) {
        joueurCourant = j;
        String nom = j.nom;
        if (j.nom == null || j.nom.length() == 0) {
            nom = (j == listeJoueurs[0]) ? "Joueur 1" : "Joueur 2";
        }
        labelJCourant.setText(nom);
    }

    /**
     * La carte qui a été sélectionné par le joueur voit ses positions possibles
     * affichées sur la grille
     */
    public void choisirCarte(Carte carte) {
        carteCourante = carte;
        affichePositions();
        refresh();
    }

    /**
     * Permet de sélectionner une pièces
     */
    public void choisirPiece(Cellule cellule, Piece piece) {
        /**
         * On test que la pièce selectionnée soit bien de la couleur du joueur
         * courant
         */
        if (piece.couleur.equals(joueurCourant.couleur)) {
            celluleCourante = cellule;
            pieceCourante = piece;
            affichePositions();
            refresh();
        }
    }

    /**
     * Supprime l'affichage des positions possibles
     */
    public void nettoyerPositions() {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                cellules[x][y].posPossible = false;
            }
        }
    }

    /**
     * Vérifie que l'on se situe toujours dans la grille de jeu
     */
    public Cellule getCellule(int x, int y) {
        if (x < 0 || x >= 5 || y < 0 || y >= 5) {
            return null;
        }
        return cellules[x][y];
    }

    /**
     * Affiche les positions possibles en fonction de la pièce choisie et de la
     * carte choisie
     */
    public void affichePositions() {
        nettoyerPositions();
        /**
         * on vérifie qu'une carte et qu'une pièce ont étés sélectionnés
         */
        if (carteCourante != null && pieceCourante != null) {
            /**
             * On vérifie que les coordonnées correspondent à un déplacement
             * possible
             */
            for (int[] yx : carteCourante.tabDeplacement) {
                Cellule c = getCellule(pieceCourante.x + yx[1], pieceCourante.y + yx[0]);
                if (c != null && (c.piece == null || (!c.piece.couleur.equals(joueurCourant.couleur)))) {
                    c.posPossible = true;
                }
            }
        }
    }

    /**
     * Donne le joueur qui n'est pas courant
     */
    public Joueur prochainJoueur() {
        if (listeJoueurs[0] == joueurCourant) {
            return listeJoueurs[1];
        }
        return listeJoueurs[0];
    }

    /**
     * Permet d'échanger les cartes au fil du jeu
     *
     * @param joueurCourant
     * @param carteAJEter
     */
    public void echangerCarte(Joueur joueurCourant, Carte carteAJEter) {
        joueurCourant.listeCartes.remove(carteAJEter);
        joueurCourant.listeCartes.add(carteEchiquier);
        carteEchiquier.setEnabled(true);
        piocherCarteEchiquier();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel carteEchiquierPanel;
    private javax.swing.JPanel carteJoueur1;
    private javax.swing.JPanel carteJoueur2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCouleurJ1;
    private javax.swing.JLabel labelCouleurJ2;
    private javax.swing.JTextField labelJ1;
    private javax.swing.JTextField labelJ2;
    private javax.swing.JLabel labelJCourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JPanel panneauGrille;
    private javax.swing.JPanel panneauInfo;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
