package palindromes;

import java.awt.*;
import javax.swing.JOptionPane;

public class Palindromes {

    public static void main(String[] args) {
        String result;
        int digit1, digit2, digit3, digit4, digit5;
        int digits = 0, number = 0;
        while (digits != 5) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
            //check if the number entered is five digits number
            if (number < 100000) {
                if (number > 9999) {
                    digits = 5;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Number must be 5 digits", "Error",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Number must be 5 digits", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
            digit1 = number / 1000;
            digit2 = number % 1000 / 1000;
            digit3 = number % 1000 % 1000 / 100;
            digit4 = number % 1000 % 1000 % 100 / 10;
            digit5 = number % 1000 % 1000 % 100 % 10;
            if (digit1 == digit5) {
                if (digit2 == digit4) {
                    result = number + " is a paradrome";
                } else {
                    result = number + " is not a paradrome";
                }
            } else {
                result = number + " is not a paradrome";
            }
            JOptionPane.showMessageDialog(null, result,
                    "Palindrome Detector", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        

    }

}
