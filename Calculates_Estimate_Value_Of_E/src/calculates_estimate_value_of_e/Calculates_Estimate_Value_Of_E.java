/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculates_estimate_value_of_e;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class Calculates_Estimate_Value_Of_E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number, factorial, accuracy;
        double e;
        number = 1;
        factorial = 1;
        e = 1.0;
        accuracy = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter desired accuracy of e: "));
        while (number < accuracy) {
            factorial *= number;
            e += 1.0 / factorial;
            number++;
        }
        JOptionPane.showMessageDialog(null, "e is " + e,
                "Factorial Part b", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
