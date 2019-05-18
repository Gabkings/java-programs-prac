/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatetotal.java;

/**
 *
 * @author developer
 */
public class CalculateTotalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double total = 0.0;
        for(String arguments : args){
            total += Double.parseDouble(arguments);
        }
        System.out.printf( "total is: %.2f\n", total );
    }
    
}
