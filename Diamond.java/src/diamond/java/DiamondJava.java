/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamond.java;

/**
 *
 * @author developer
 */
public class DiamondJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int row, stars, spaces;
        String diamondString = "";
        //top first half 
        for (row = 1; row <= 5; row++) {
            for (spaces = 5; spaces > row; spaces--) {
                diamondString += " ";

            }
            for (stars = 1; stars <= (2 * row) - 1; stars++) {
                diamondString += "*";

            }
            diamondString += "\n";
        }
// bottom half (last four rows)
        for (row = 4; row >= 1; row--) {
            for (spaces = 5; spaces > row; spaces--) {
                diamondString += " ";
            }
            for (stars = 1; stars <= (2 * row) - 1; stars++) {
                diamondString += "*";
            }
            diamondString += "\n";
        }
        // display result
        System.out.println(diamondString);
        System.exit(0);
    }

}
