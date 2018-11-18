/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;
// Calculate the product of three integers.

import javax.swing.JOptionPane;


public class ProductApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x , y ,z, result;
        
        String yVar = JOptionPane.showInputDialog("Enter the y value") ;
        String xVar = JOptionPane.showInputDialog("Enter the x value") ;
        String zVar = JOptionPane.showInputDialog("Enter the z value");
        //converting in to integers 
        x = Integer.parseInt(xVar);
        y = Integer.parseInt(yVar);
        z = Integer.parseInt(zVar);
        result = x * y *z;
        JOptionPane.showMessageDialog(null,"The product is"+ result);
        System.exit( 0 );
        
    }
    
}
