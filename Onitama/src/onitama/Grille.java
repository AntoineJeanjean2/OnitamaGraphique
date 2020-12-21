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
public class Grille {
    Cellule[][] Cellules = new Cellule[5][5];
    Carte carteEchiquier;
    
    public Grille(){ //On crée les cellules dans la grille
    for (int i=0;i<5;i++){
        for (int j=0;j<5;j++){
            Cellules[i][j]=new Cellule();
        }
    }
}
    
    
   public void viderGrille() {  //On vide la grille de ses jetons
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Cellules[i][j].pieceCourante = null;
            }
        }
    }
    
    public void afficherGrilleSurConsole(){
            for (int i=0; i <6; i++) { 
            for (int j =0;j < 7; j++){
                if (Cellules[i][j].pieceCourante != null) {                   
                    System.out.print(Cellules[i][j].pieceCourante);
                }
                else if(Cellules[i][j].templeBleu==true){
                    System.out.print("\u001B[0m B ");
                }
                else if(Cellules[i][j].templeRouge==true){
                    System.out.print("\u001B[0m R ");
                }
                else{
                    System.out.print("\u001B[0m N ");
            }  
        }System.out.println();
    }
    }
    
    public boolean etreGagnantePourJoueur(Joueur unJoueur){
        if ("rouge".equals(this.Cellules[0][2].pieceCourante.couleur) && "roi".equals(this.Cellules[0][2].pieceCourante.type)){
            System.out.println("Le joueur Rouge a gagné");
            return true;
        }
        if ("bleu".equals(this.Cellules[4][2].pieceCourante.couleur) && "roi".equals(this.Cellules[4][2].pieceCourante.type)){
            System.out.println("Le joueur Bleu a gagné");
            return true;
        }    
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (!Cellules[i][j].pieceCourante.couleur.equals(unJoueur.couleur) && Cellules[i][j].pieceCourante.type.equals("roi") ){                   
                    return false;
                }
                else{
                    System.out.println("Le joueur "+unJoueur.couleur+" a gagné");
                    return true;
                }
            }
        }return false;   
        }
    }
