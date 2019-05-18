/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package small;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class Small {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int smallest = 0,//smallest no
                integers,//integers to compare
                number = 0;//number entered by user
        int count = 1;
        String input;
        input = JOptionPane.showInputDialog("Enter number of integers:");
        integers = Integer.parseInt(input);
        while (count <= integers) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
            if (count == 1) {
                smallest = number;
            } else if (number < smallest) {
                smallest = number;

            }
            count++;
        }
        JOptionPane.showMessageDialog(null, "Smallest Integer is: "
                + smallest, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
