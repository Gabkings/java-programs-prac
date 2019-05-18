/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author developer
 */
public class Sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float product1 = 0, product2 = 0, product3 = 0, product4 = 0, product5 = 0;
        String inputString;
        int productId = 1;
        while (productId != 0) {
            // determine the product chosen
            inputString = JOptionPane.showInputDialog(
                    "Enter product number (1-5) (0 to stop):");
            productId = Integer.parseInt(inputString);
            if (productId >= 1 && productId <= 5) {
                // determine the number sold of the item
                inputString = JOptionPane.showInputDialog(
                        "Enter quantity sold:");
                int quantity = Integer.parseInt(inputString);
                // increment the total for the item by the
                // price times the quantity sold
                switch (productId) {
                    case 1:
                        product1 += quantity * 2.89;
                        break;
                    case 2:
                        product2 += quantity * 4.50;
                        break;
                    case 3:
                        product3 += quantity * 9.89;
                        break;
                    case 4:
                        product4 += quantity * 4.49;
                        break;
                    case 5:
                        product5 += quantity * 6.87;
                        break;
                }
            } else if (productId != 0) {
                JOptionPane.showMessageDialog(null,
                        "Product number must be between 1 and 5 or 0 to stop",
                        "Input Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        // create decimal format to format floating point numbers
// with two digits to the right of the decimal point
        NumberFormat moneyFormat
                = NumberFormat.getCurrencyInstance(Locale.US);
        // create a summary message
        String output = "Product 1: " + moneyFormat.format(product1);
        output += "\nProduct 2: " + moneyFormat.format(product2);
        output += "\nProduct 3: " + moneyFormat.format(product3);
        output += "\nProduct 4: " + moneyFormat.format(product4);
        output += "\nProduct 5: " + moneyFormat.format(product5) + "\n";
        JTextArea outputArea = new JTextArea(6, 20);
        outputArea.setText(output);
// show results
        JOptionPane.showMessageDialog(null, outputArea,
                "Totals", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

}
