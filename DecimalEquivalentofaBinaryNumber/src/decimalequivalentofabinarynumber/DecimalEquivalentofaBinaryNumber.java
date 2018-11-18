package decimalequivalentofabinarynumber;

import javax.swing.JOptionPane;

public class DecimalEquivalentofaBinaryNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        int binary,// binary value
                bit,// bit positional value 
                decimal;// decimal value

        bit = 1;
        decimal = 0;
        binary = Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
        while (binary != 0) {
            decimal += binary % 10 * bit;
            binary /= 10;
            bit *= 2;
        }
        JOptionPane.showMessageDialog(null, "Decimal is: " + decimal,
                "Binary", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
