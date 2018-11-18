/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidesofatriangle;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class SidesOfATriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resultString;
        int side1, side2, side3;
        side1 = Integer.parseInt(JOptionPane.showInputDialog("Enter side one"));
        side2 = Integer.parseInt(JOptionPane.showInputDialog("Enter side 2"));
        side3 = Integer.parseInt(JOptionPane.showInputDialog("Enter side 3"));
        resultString = "Could not be side of triangle";
        if ((side1 + side2) > side3) {
            if ((side1 + side3) > side2) {
                if ((side2 + side3) > side1) {
                    resultString = "Could be side of triangle";
                }
            }
        }
        JOptionPane.showMessageDialog(null, resultString, "Sides of triangle", JOptionPane.INFORMATION_MESSAGE);
    }

}
