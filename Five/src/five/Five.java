package five;

import javax.swing.JOptionPane;

public class Five {

    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        String inputString;
// read the five digit number from user as a string
        inputString = JOptionPane.showInputDialog(
                "Enter five digit integer:");
        number = Integer.parseInt(inputString);
// determine the 5 digits
        int digit1, digit2, digit3, digit4, digit5;
        digit1 = number / 1000;
        digit2 = number % 1000 / 1000;
        digit3 = number % 1000 % 1000 / 100;
        digit4 = number % 1000 % 1000 % 100 / 10;
        digit5 = number % 1000 % 1000 % 100 % 10;
        // create the result string
// create the result string
        String resultString = digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5;
// display results
        JOptionPane.showMessageDialog(null, resultString,
                "Digits in " + number, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

}
