/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interest2.java;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author developer
 */
public class Interest2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int amount; // amount on deposit at end of each year

        int principal = 1000; // initial amount before interest
        double rate = 0.05;
// interest rate
// create NumberFormat for currency in US dollar format
        NumberFormat moneyFormat
                = NumberFormat.getCurrencyInstance(Locale.US);
        // create JTextArea to display output
        JTextArea outputTextArea = new JTextArea();
// set first line of text in outputTextArea
        outputTextArea.setText("Year\tAmount on deposit\n");
        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; year++) {
            // calculate new amount for specified year
            amount
                    = (int) (principal * 100 * Math.pow(1.0 + rate, year));
// append one line of text to outputTextArea
            outputTextArea.append(year + "\t" + moneyFormat.format(
                    (amount + Math.pow(1.0 + rate, year)) / 100) + "\n");

        }//end for
        // display results
        JOptionPane.showMessageDialog(null, outputTextArea,
                "Compound Interest", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
// terminate the application
    }

}
