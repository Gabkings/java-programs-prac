
package salespersonearnings;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class SalespersonEarnings {

    public static void main(String[] args) {
        double gross = 0.0, earnings;
        int product = 0, numberSold;
        String input;
        while (product < 4) {
            // read number from user as String
            input = JOptionPane.showInputDialog(
                    "Enter number sold of product #" + product + ":");
            // convert numbers from type String to type int
            numberSold = Integer.parseInt(input);
            // determine gross of each individual product and add to total
            if (product == 1) {
                gross += numberSold * 239.99;
            } else if (product == 2) {
                gross += numberSold * 129.75;
            } else if (product == 3) {
                gross += numberSold * 99.95;
            } else if (product == 4) {
                gross += numberSold * 350.89;
            }
            product++;

        }//end while
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        earnings = 0.09 * gross + 200;
        String result = "Earnings this week: "
                + twoDigits.format(earnings);
        JOptionPane.showMessageDialog(null, result, "Sales",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
