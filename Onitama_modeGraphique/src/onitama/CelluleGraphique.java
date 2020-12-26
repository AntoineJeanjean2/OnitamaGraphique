/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama;

import javax.swing.JButton;

/**
 *
 * @author antoi
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    
    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee = uneCellule;
    }
}
