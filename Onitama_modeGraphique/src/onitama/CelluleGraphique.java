/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author antoi
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    Carte carteAssociee;
    
        ImageIcon imgVide = new javax.swing.ImageIcon(getClass().getResource("/images/carreau vide.png"));
        ImageIcon imgPB = new javax.swing.ImageIcon(getClass().getResource("/images/carreau avec pion bleu.png"));
        ImageIcon imgPR = new javax.swing.ImageIcon(getClass().getResource("/images/carreau avec pion rouge.png"));
        ImageIcon imgRB = new javax.swing.ImageIcon(getClass().getResource("/images/carreau avec roi bleu.png"));
        ImageIcon imgRR = new javax.swing.ImageIcon(getClass().getResource("/images/carreau avec roi rouge.png"));
        
        ImageIcon imgTB = new javax.swing.ImageIcon(getClass().getResource("/images/temple bleu.png"));
        ImageIcon imgTBPB = new javax.swing.ImageIcon(getClass().getResource("/images/temple bleu avec pion bleu.png"));
        ImageIcon imgTBPR = new javax.swing.ImageIcon(getClass().getResource("/images/temple bleu avec pion rouge.png"));
        ImageIcon imgTBRB = new javax.swing.ImageIcon(getClass().getResource("/images/temple bleu avec roi bleu.png"));
        ImageIcon imgTBRR = new javax.swing.ImageIcon(getClass().getResource("/images/temple bleu avec roi rouge.png"));
        
        ImageIcon imgTR = new javax.swing.ImageIcon(getClass().getResource("/images/temple rouge.png"));
        ImageIcon imgTRPB = new javax.swing.ImageIcon(getClass().getResource("/images/temple rouge avec pion bleu.png"));
        ImageIcon imgTRPR = new javax.swing.ImageIcon(getClass().getResource("/images/temple rouge avec pion rouge.png"));
        ImageIcon imgTRRB = new javax.swing.ImageIcon(getClass().getResource("/images/temple rouge avec roi bleu.png"));
        ImageIcon imgTRRR = new javax.swing.ImageIcon(getClass().getResource("/images/temple rouge avec roi rouge.png"));
        
        ImageIcon imgBoar = new javax.swing.ImageIcon(getClass().getResource("/images/boar.jpg"));
        ImageIcon imgCobra = new javax.swing.ImageIcon(getClass().getResource("/images/cobra.jpg"));
        ImageIcon imgCrab = new javax.swing.ImageIcon(getClass().getResource("/images/crab.jpg"));
        ImageIcon imgCrane = new javax.swing.ImageIcon(getClass().getResource("/images/crane.jpg"));
        ImageIcon imgDragon = new javax.swing.ImageIcon(getClass().getResource("/images/dragon.jpg"));
        ImageIcon imgEel = new javax.swing.ImageIcon(getClass().getResource("/images/eel.jpg"));
        ImageIcon imgElephant = new javax.swing.ImageIcon(getClass().getResource("/images/elephant.jpg"));
        ImageIcon imgFrog = new javax.swing.ImageIcon(getClass().getResource("/images/frog.jpg"));
        ImageIcon imgGoose = new javax.swing.ImageIcon(getClass().getResource("/images/goose.jpg"));
        ImageIcon imgHorse = new javax.swing.ImageIcon(getClass().getResource("/images/horse.jpg"));
        ImageIcon imgMantis = new javax.swing.ImageIcon(getClass().getResource("/images/mantis.jpg"));
        ImageIcon imgMonkey = new javax.swing.ImageIcon(getClass().getResource("/images/monkey.jpg"));
        ImageIcon imgOx = new javax.swing.ImageIcon(getClass().getResource("/images/ox.jpg"));
        ImageIcon imgRabbit = new javax.swing.ImageIcon(getClass().getResource("/images/rabbit.jpg"));
        ImageIcon imgRooster = new javax.swing.ImageIcon(getClass().getResource("/images/rooster.jpg"));
        ImageIcon imgTiger = new javax.swing.ImageIcon(getClass().getResource("/images/tiger.jpg"));
    
    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee = uneCellule;        
    }
    
    public CelluleGraphique(Carte uneCarte){
        carteAssociee = uneCarte;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        
        if (celluleAssociee != null){
            if (celluleAssociee.pieceCourante == null && celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == false){
                setIcon(imgVide);
        }
            if (celluleAssociee.pieceCourante == null && celluleAssociee.templeBleu == true && celluleAssociee.templeRouge == false){
                setIcon(imgTB);
        }
            if (celluleAssociee.pieceCourante == null && celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == true){
                setIcon(imgTR);
        }
            if (celluleAssociee.pieceCourante != null){
                //Pions Bleus
                if (celluleAssociee.pieceCourante.type.equals("pion") && celluleAssociee.pieceCourante.couleur.equals("Bleu")&& celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == false){
                    setIcon(imgPB);
                }
                if (celluleAssociee.pieceCourante.type.equals("pion") && celluleAssociee.pieceCourante.couleur.equals("Bleu")&& celluleAssociee.templeBleu == true && celluleAssociee.templeRouge == false){
                    setIcon(imgTBPB);
                }
                if (celluleAssociee.pieceCourante.type.equals("pion") && celluleAssociee.pieceCourante.couleur.equals("Bleu")&& celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == true){
                    setIcon(imgTRPB);
                }
                if (celluleAssociee.pieceCourante.type.equals("roi") && celluleAssociee.pieceCourante.couleur.equals("Bleu")&& celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == false){
                    setIcon(imgRB);
                }
                if (celluleAssociee.pieceCourante.type.equals("roi") && celluleAssociee.pieceCourante.couleur.equals("Bleu")&& celluleAssociee.templeBleu == true && celluleAssociee.templeRouge == false){
                    setIcon(imgTBRB);
                }
                if (celluleAssociee.pieceCourante.type.equals("roi") && celluleAssociee.pieceCourante.couleur.equals("Bleu")&& celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == true){
                    setIcon(imgTRRB);
                }


                //Pions Rouges
                if (celluleAssociee.pieceCourante.type.equals("pion") && celluleAssociee.pieceCourante.couleur.equals("Rouge")&& celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == false){
                    setIcon(imgPR);
                }
                if (celluleAssociee.pieceCourante.type.equals("pion") && celluleAssociee.pieceCourante.couleur.equals("Rouge")&& celluleAssociee.templeBleu == true && celluleAssociee.templeRouge == false){
                    setIcon(imgTBPR);
                }
                if (celluleAssociee.pieceCourante.type.equals("pion") && celluleAssociee.pieceCourante.couleur.equals("Rouge")&& celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == true){
                    setIcon(imgTRPR);
                }
                if (celluleAssociee.pieceCourante.type.equals("roi") && celluleAssociee.pieceCourante.couleur.equals("Rouge")&& celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == false){
                    setIcon(imgRR);
                }
                if (celluleAssociee.pieceCourante.type.equals("roi") && celluleAssociee.pieceCourante.couleur.equals("Rouge")&& celluleAssociee.templeBleu == true && celluleAssociee.templeRouge == false){
                    setIcon(imgTBRR);
                }
                if (celluleAssociee.pieceCourante.type.equals("roi") && celluleAssociee.pieceCourante.couleur.equals("Rouge")&& celluleAssociee.templeBleu == false && celluleAssociee.templeRouge == true){
                    setIcon(imgTRRR);
                }
            }
        }    
        
        if (carteAssociee != null){
            if (carteAssociee.nom.equals("carteBoar")){
                setIcon(imgBoar);
            }
            if (carteAssociee.nom.equals("carteCobra")){
                setIcon(imgCobra);
            }
            if (carteAssociee.nom.equals("carteCrab")){
                setIcon(imgCrab);
            }
            if (carteAssociee.nom.equals("carteCrane")){
                setIcon(imgCrane);
            }
            if (carteAssociee.nom.equals("carteDragon")){
                setIcon(imgDragon);
            }            
            if (carteAssociee.nom.equals("carteEel")){
                setIcon(imgEel);
            }
            if (carteAssociee.nom.equals("carteElephant")){
                setIcon(imgElephant);
            }
            if (carteAssociee.nom.equals("carteFrog")){
                setIcon(imgFrog);
            }
            if (carteAssociee.nom.equals("carteGoose")){
                setIcon(imgGoose);
            }
            if (carteAssociee.nom.equals("carteHorse")){
                setIcon(imgHorse);
            }
            if (carteAssociee.nom.equals("carteMantis")){
                setIcon(imgMantis);
            }
            if (carteAssociee.nom.equals("carteMonkey")){
                setIcon(imgMonkey);
            }
            if (carteAssociee.nom.equals("carteOx")){
                setIcon(imgOx);
            }
            if (carteAssociee.nom.equals("carteRabbit")){
                setIcon(imgRabbit);
            }
            if (carteAssociee.nom.equals("carteRooster")){
                setIcon(imgRooster);
            }
            if (carteAssociee.nom.equals("carteTiger")){
                setIcon(imgTiger);
            }
        }
}
}