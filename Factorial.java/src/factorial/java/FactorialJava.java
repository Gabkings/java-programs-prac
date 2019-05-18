
package factorial.java;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FactorialJava {
    public static void main(String[] args) {
        JTextArea outputArea = new JTextArea(5, 10);
        String outputString = "X\tX!\n";
        for (int number = 1; number <= 5; number++) {
            int factorial = 1;
            for (int smaller = 1; smaller <= number; smaller++) {
                factorial *= smaller;
            }//end of inner for loop
            outputString += "\n" + number + "\t" + factorial;
        }//end of outer for loop
        outputArea.setText(outputString);
        JOptionPane.showMessageDialog(null, outputArea,
                "Factorial", JOptionPane.INFORMATION_MESSAGE);
        System.exit( 0 );
    }

}
