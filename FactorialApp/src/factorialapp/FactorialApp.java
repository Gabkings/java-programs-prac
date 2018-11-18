/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialapp;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class FactorialApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,factorial = 1;
        String fact;
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
        while(n > 0){
            factorial *= n;
            n--;
        }
        fact = "n! = "+factorial;
        JOptionPane.showMessageDialog(null, fact,"Factorial App",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
