/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;

/**
 *
 * @author developer
 */
public class JavaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
        for(int i = 0; i<array.length;i++){
            System.out.printf( "%5d%8d\n", i, array[ i ] );
        }
    }
    
}
