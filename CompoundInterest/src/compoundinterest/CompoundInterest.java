/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundinterest;

/**
 *
 * @author developer
 */
public class CompoundInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Amount ;
        double principal = 10000;
        double rate = 0.05;
        System.out.printf( "%s %20s \n", "Year", "Amount on deposit" );
        for(int i = 1;i<= 10;i++){
            Amount = principal * Math.pow(1.0 + rate, i);
            System.out.printf( "%2d%,20.2f\n", i, Amount );
            
        }
    }
    
}
