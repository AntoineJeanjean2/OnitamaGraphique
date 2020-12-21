package onitama;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antoi
 */
public class Pioche {
    Carte[] cartePioche = new Carte[16];
    
    int[][] tabCarteBoar = {{1,0},{-1,0},{0,1}};
    Carte carteBoar = new Carte (tabCarteBoar, "carteBoar");
    
    int[][] tabCarteCobra = {{1,1},{1,-1},{-1,0}};
    Carte carteCobra = new Carte (tabCarteCobra, "carteCobra");
    
    int[][] tabCarteCrab = {{2,0},{-2,0},{0,1}};
    Carte carteCrab = new Carte (tabCarteCrab, "carteCrab");
    
    int[][] tabCarteCrane = {{1,-1},{-1,-1},{0,1}};
    Carte carteCrane = new Carte (tabCarteCrane, "carteCrane");
    
    int[][] tabCarteDragon = {{-1,-1},{1,-1},{2,1},{-2,1}};
    Carte carteDragon = new Carte (tabCarteDragon, "carteDragon");
    
    int[][] tabCarteEel = {{1,0},{-1,1},{-1,-1}};
    Carte carteEel = new Carte (tabCarteEel, "carteEel");
    
    int[][] tabCarteElephant = {{1,0},{1,1},{-1,0},{-1,1}};
    Carte carteElephant = new Carte (tabCarteElephant, "carteElephant");
    
    int[][] tabCarteFrog = {{1,-1},{-1,1},{-2,0}};
    Carte carteFrog = new Carte (tabCarteFrog, "carteFrog");
    
    int[][] tabCarteGoose = {{1,0},{1,-1},{-1,0},{-1,1}};
    Carte carteGoose = new Carte (tabCarteGoose, "carteGoose");
    
    int[][] tabCarteHorse = {{0,1},{0,-1},{-1,0}};
    Carte carteHorse = new Carte (tabCarteHorse, "carteHorse");
    
    int[][] tabCarteMantis = {{1,1},{-1,1},{0,-1}};
    Carte carteMantis = new Carte (tabCarteMantis, "carteMantis");
    
    int[][] tabCarteMonkey = {{1,1},{1,-1},{-1,1},{-1,-1}};
    Carte carteMonkey = new Carte (tabCarteMonkey, "carteMonkey");
    
    int[][] tabCarteFox = {{1,0},{0,-1},{0,1}};
    Carte carteFox = new Carte (tabCarteFox, "carteFox");
    
    int[][] tabCarteRabbit = {{1,1},{2,0},{-1,-1}};
    Carte carteRabbit = new Carte (tabCarteRabbit, "carteRabbit");
    
    int[][] tabCarteRooster = {{1,1},{1,0},{-1,0},{-1,-1}};
    Carte carteRooster = new Carte (tabCarteRooster, "carteRooster");
    
    int[][] tabCarteTiger = {{0,1},{0,2}};
    Carte carteTiger = new Carte (tabCarteTiger, "carteTiger");    
   
    
}
