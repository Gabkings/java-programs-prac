package interest.java;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InterestJava {

    public static void main(String[] args) {
        // create decimal format to format floating point numbers
        // with two digits to the right of the decimal point
        NumberFormat moneyFormat
                = NumberFormat.getCurrencyInstance(Locale.US);
        JTextArea outputTextArea = new JTextArea(13, 20);
        JScrollPane scroller = new JScrollPane(outputTextArea);
        //initial deposit.
        double principal = 1000.0;
        // print out statistics for each rate
        for (int interestRate = 5; interestRate < 10; interestRate++) {
            double rate = interestRate / 100.0;
            outputTextArea.append("\nInterest Rate: "
                    + interestRate + "%\n");
            outputTextArea.append("Year\tAmount on deposit\n");
            //for each year print a ten year forecast
            for (int year = 1; year <= 10; year++) {
                double amount = principal + (1.0 + rate);
                // raise the amount to the power of the year
                for (int power = 2; power <= year; power++) {
                    amount *= (1.0 + rate);
                    outputTextArea.append(year + "\t"
                            + moneyFormat.format(amount) + "\n");
                }
                outputTextArea.append(year + "\t"
                        + moneyFormat.format(amount) + "\n");
            }
        }
        // show result
        JOptionPane.showMessageDialog(null, scroller,
                "Compound Interest", JOptionPane.INFORMATION_MESSAGE);
// terminate the application
        System.exit(0);
    }

}
