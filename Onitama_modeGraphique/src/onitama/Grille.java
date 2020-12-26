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
            for (int i=0; i <5; i++) { 
                for (int j=0;j < 5; j++){
                    if (Cellules[i][j].pieceCourante != null) {                   
                        if (Cellules[i][j].pieceCourante.type.equals("roi"))
                            System.out.print("\u001B[0m R ");
                        else{
                           System.out.print("\u001B[0m P "); 
                        }
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
        if (Cellules[0][2].pieceCourante !=null){                 
            if (this.Cellules[0][2].pieceCourante.couleur.equals("rouge") && this.Cellules[0][2].pieceCourante.type.equals("roi")){
                return true;
            }
        }
        if (Cellules[0][2].pieceCourante !=null){
            if (this.Cellules[4][2].pieceCourante.couleur.equals("bleu") && "roi".equals(this.Cellules[4][2].pieceCourante.type)){
                return true;
            } 
        }
        int a = 0;
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (Cellules[i][j].pieceCourante != null){
                    if (!Cellules[i][j].pieceCourante.couleur.equals(unJoueur.couleur) && Cellules[i][j].pieceCourante.type.equals("roi") ){                   
                        return false;
                    }
                    else{
                        a++;
                    }
            }
                else{
                a++;
                }
            }
        }
        if (a == 25){
            return true;
        }return false;       
        }
    }
