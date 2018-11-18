/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credetCalc;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class CreditLimitCalculator {

    public static void main(String args[]) {
        String inputString,
                resultsString,
                creditStatusString;
        int account, oldBalance, charges, credits, creditLimit, newBalance;
        inputString = JOptionPane.showInputDialog(
                "Enter Account Number:");
        account = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Enter Balance: ");
        oldBalance = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Enter Charges: ");
        charges = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Enter Credits: ");
        credits = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Enter Credit Limit: ");
        creditLimit = Integer.parseInt(inputString);
        newBalance = oldBalance + charges - credits;
        resultsString = "New balance is " + newBalance;
        if (newBalance > creditLimit) {
            creditStatusString = "CREDIT LIMIT EXCEEDED";
        } else {
            creditStatusString = "Credit Report";
        }
        JOptionPane.showMessageDialog(null, resultsString,
                creditStatusString, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//end main

}//end class
