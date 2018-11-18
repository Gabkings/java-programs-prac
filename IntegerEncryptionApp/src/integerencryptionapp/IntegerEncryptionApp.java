/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerencryptionapp;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class IntegerEncryptionApp {

    /**
     * @param args the command line arguments
     */
            // TODO code application logic here
        public static int number,
                digit1,
                digit2,
                digit3,
                digit4,
                encryptedNumber;
    public static void main(String[] args) {
        decript();
        
        System.exit(0);
       
    }
    public static void encript(){
         // enter four digit number to be encrypted
        number = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter a four digit number: "));
        digit1 = (number / 1000 + 7) % 10;
        digit2 = (number % 1000 / 100 + 7) % 10;
        digit3 = (number % 100 / 10 + 7) % 10;
        digit4 = (number % 10 + 7) % 10;
        encryptedNumber = digit1 * 10 + digit2
                + digit3 * 1000 + digit4 * 100;
        JOptionPane.showMessageDialog(null,
                "Encrypted number is " + encryptedNumber,
                "Encryptor", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
        public static void decript(){
         // enter four digit number to be encrypted
        number = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter a four digit number: "));
        digit1 = (number / 1000 + 3) % 10;
        digit2 = (number % 1000 / 100 + 3) % 10;
        digit3 = (number % 100 / 10 + 3) % 10;
        digit4 = (number % 10 + 3) % 10;
        encryptedNumber = digit1 * 10 + digit2
                + digit3 * 1000 + digit4 * 100;
        JOptionPane.showMessageDialog(null,
                "Encrypted number is " + encryptedNumber,
                "Encryptor", JOptionPane.INFORMATION_MESSAGE);
        
    }
    

}
