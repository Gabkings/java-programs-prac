/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculates_e_raised_to_.x;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class Calculates_E_Raised_To_X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 1,// counter
                accuracy,// accuracy of estimate
                factorial = 1,// value of factorial
                x;// x value
        double e = 1.0,//estimate the value of e
                exponent = 1.0;//exponent value
        x = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter exponent: "));
        accuracy = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter desired accuracy of e: "));
        // calculate estimation
        while (number < accuracy) {
            exponent *= x;
            factorial *= number;
            e += exponent / factorial;
            number++;
        }
        JOptionPane.showMessageDialog(null, " e to the " + x + " is " + e,
                "Factorial Part c", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
