package salarycalculator;

import javax.swing.JOptionPane;

public class SalaryCalculator {

    public static void main(String[] args) {
        String inputString, resultString;
        double hours, rate, count = 1, pay = 0;
        while (count <= 3) {
            inputString = JOptionPane.showInputDialog("Enter the hours worked");
            hours = Double.parseDouble(inputString);
            inputString = JOptionPane.showInputDialog("Enter the rate of payment");
            rate = Double.parseDouble(inputString);
            //calculate the charges 
            if (hours > 40) {
                pay = (40 * rate) + (hours - 40) * (rate * 1.5);
            } else {
                pay = hours * rate;
            }

            resultString = "Pay is $" + pay;
            JOptionPane.showMessageDialog(null, resultString, " Employee " + count, JOptionPane.INFORMATION_MESSAGE);
            count++;
        }//end while

    }

}
