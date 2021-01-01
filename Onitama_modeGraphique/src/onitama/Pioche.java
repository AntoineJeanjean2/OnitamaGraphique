package onitama;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Antoine et Thomas
 */
public class Pioche {

    /**
     * On définit les déplacements possibles comme des vecteurs Le déplacement
     * est donc définit par un couple (déplacement sur lignes, déplacement sur
     * colonnes)
     */
    List<Carte> cartePioche = new ArrayList<>();

    /**
     * On cré à la main chaque carte qu'on inclu dans la liste cartePioche
     */
    public Pioche(Partie partie) throws IOException {

//      int[][] tabCarteBoar = {{-1,0},{0,-1},{0,1}};
//      Carte carteBoar = new Carte (tabCarteBoar, "carteBoar",partie);
//      cartePioche.add( carteBoar);
//      Cette carte est mise en commentaire car le fichier image est vide ce qui pose problème
        int[][] tabCarteCobra = {{-1, 1}, {1, 1}, {0, -1}};
        Carte carteCobra = new Carte(tabCarteCobra, "cobra", partie);
        cartePioche.add(carteCobra);

        int[][] tabCarteCrab = {{0, 2}, {0, -2}, {-1, 0}};
        Carte carteCrab = new Carte(tabCarteCrab, "crab", partie);
        cartePioche.add(carteCrab);

        int[][] tabCarteCrane = {{1, 1}, {1, -1}, {-1, 0}};
        Carte carteCrane = new Carte(tabCarteCrane, "crane", partie);
        cartePioche.add(carteCrane);

        int[][] tabCarteDragon = {{1, -1}, {1, 1}, {-1, 2}, {-1, -2}};
        Carte carteDragon = new Carte(tabCarteDragon, "dragon", partie);
        cartePioche.add(carteDragon);

        int[][] tabCarteEel = {{0, 1}, {-1, -1}, {1, -1}};
        Carte carteEel = new Carte(tabCarteEel, "eel", partie);
        cartePioche.add(carteEel);

        int[][] tabCarteElephant = {{0, 1}, {-1, 1}, {0, -1}, {-1, -1}};
        Carte carteElephant = new Carte(tabCarteElephant, "elephant", partie);
        cartePioche.add(carteElephant);

        int[][] tabCarteFrog = {{1, 1}, {-1, -1}, {0, -2}};
        Carte carteFrog = new Carte(tabCarteFrog, "frog", partie);
        cartePioche.add(carteFrog);

        int[][] tabCarteGoose = {{0, 1}, {1, 1}, {0, -1}, {-1, -1}};
        Carte carteGoose = new Carte(tabCarteGoose, "goose", partie);
        cartePioche.add(carteGoose);

        int[][] tabCarteHorse = {{-1, 0}, {1, 0}, {0, -1}};
        Carte carteHorse = new Carte(tabCarteHorse, "horse", partie);
        cartePioche.add(carteHorse);

        int[][] tabCarteMantis = {{-1, 1}, {-1, -1}, {1, 0}};
        Carte carteMantis = new Carte(tabCarteMantis, "mantis", partie);
        cartePioche.add(carteMantis);

        int[][] tabCarteMonkey = {{-1, 1}, {-1, -1}, {1, 1}, {1, -1}};
        Carte carteMonkey = new Carte(tabCarteMonkey, "monkey", partie);
        cartePioche.add(carteMonkey);

        int[][] tabCarteFox = {{-1, 0}, {1, 0}, {0, 1}};
        Carte carteFox = new Carte(tabCarteFox, "fox", partie);
        cartePioche.add(carteFox);

        int[][] tabCarteRabbit = {{-1, 1}, {0, 2}, {1, -1}};
        Carte carteRabbit = new Carte(tabCarteRabbit, "rabbit", partie);
        cartePioche.add(carteRabbit);

        int[][] tabCarteRooster = {{-1, 1}, {0, 1}, {0, -1}, {1, -1}};
        Carte carteRooster = new Carte(tabCarteRooster, "rooster", partie);
        cartePioche.add(carteRooster);

        int[][] tabCarteTiger = {{1, 0}, {-2, 0}};
        Carte carteTiger = new Carte(tabCarteTiger, "tiger", partie);
        cartePioche.add(carteTiger);
    }

    /**
     * Nous avons trouvé une formule très simple permettant de mélanger notre
     * pioche efficacement
     */
    public void melangerPioche() {
        Collections.shuffle(cartePioche);
    }
}
