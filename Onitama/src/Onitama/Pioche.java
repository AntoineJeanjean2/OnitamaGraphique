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
    public Pioche()  {
    
        int[][] tabCarteBoar = {{1,0},{-1,0},{0,1}};
        Carte carteBoar = new Carte (tabCarteBoar, "carteBoar");
        cartePioche[0] = carteBoar;
    
        int[][] tabCarteCobra = {{1,1},{1,-1},{-1,0}};
        Carte carteCobra = new Carte (tabCarteCobra, "carteCobra");
        cartePioche[1] = carteCobra;
    
        int[][] tabCarteCrab = {{2,0},{-2,0},{0,1}};
        Carte carteCrab = new Carte (tabCarteCrab, "carteCrab");
        cartePioche[2] = carteCrab; 
    
        int[][] tabCarteCrane = {{1,-1},{-1,-1},{0,1}};
        Carte carteCrane = new Carte (tabCarteCrane, "carteCrane");
        cartePioche[3] = carteCrane;
    
        int[][] tabCarteDragon = {{-1,-1},{1,-1},{2,1},{-2,1}};
        Carte carteDragon = new Carte (tabCarteDragon, "carteDragon");
        cartePioche[4] = carteDragon;

        int[][] tabCarteEel = {{1,0},{-1,1},{-1,-1}};
        Carte carteEel = new Carte (tabCarteEel, "carteEel");
        cartePioche[5] = carteEel;

        int[][] tabCarteElephant = {{1,0},{1,1},{-1,0},{-1,1}};
        Carte carteElephant = new Carte (tabCarteElephant, "carteElephant");
        cartePioche[6] = carteElephant;

        int[][] tabCarteFrog = {{1,-1},{-1,1},{-2,0}};
        Carte carteFrog = new Carte (tabCarteFrog, "carteFrog");
        cartePioche[7] = carteFrog;

        int[][] tabCarteGoose = {{1,0},{1,-1},{-1,0},{-1,1}};
        Carte carteGoose = new Carte (tabCarteGoose, "carteGoose");
        cartePioche[8] = carteGoose;

        int[][] tabCarteHorse = {{0,1},{0,-1},{-1,0}};
        Carte carteHorse = new Carte (tabCarteHorse, "carteHorse");
        cartePioche[9] = carteHorse;

        int[][] tabCarteMantis = {{1,1},{-1,1},{0,-1}};
        Carte carteMantis = new Carte (tabCarteMantis, "carteMantis");
        cartePioche[10] = carteMantis;

        int[][] tabCarteMonkey = {{1,1},{1,-1},{-1,1},{-1,-1}};
        Carte carteMonkey = new Carte (tabCarteMonkey, "carteMonkey");
        cartePioche[11] = carteMonkey;

        int[][] tabCarteFox = {{1,0},{0,-1},{0,1}};
        Carte carteFox = new Carte (tabCarteFox, "carteFox");
        cartePioche[12] = carteFox;

        int[][] tabCarteRabbit = {{1,1},{2,0},{-1,-1}};
        Carte carteRabbit = new Carte (tabCarteRabbit, "carteRabbit");
        cartePioche[13] = carteRabbit;

        int[][] tabCarteRooster = {{1,1},{1,0},{-1,0},{-1,-1}};
        Carte carteRooster = new Carte (tabCarteRooster, "carteRooster");
        cartePioche[14] = carteRooster;

        int[][] tabCarteTiger = {{0,1},{0,2}};
        Carte carteTiger = new Carte (tabCarteTiger, "carteTiger");    
        cartePioche[15] = carteTiger;
    }
    public void melangerPioche(Carte [] cartePioche) {
        for (int i=0; i<20;i++){
            Random R1 = new Random();
            Random R2 = new Random();
            int A1 = R1.nextInt(15);
            int A2 = R2.nextInt(15);
            Carte temp;

            temp = cartePioche[A1];

            cartePioche[A1] = cartePioche[A2];
            cartePioche[A2] = temp;        
        }
    }
}
