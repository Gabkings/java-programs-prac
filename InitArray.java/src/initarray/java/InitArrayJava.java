/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initarray.java;

/**
 *
 * @author developer
 */
public class InitArrayJava {

    /**
     * @param args the command line arguments
     */
    public static void product(String args[]) {
      
    }

    public static void main(String[] args) {
       int array[];//declare array
        int size = 10;
        //get size 
        if (args.length == 1) {
            size = Integer.parseInt(args[0]);
        }
        array = new int[size]; // create array with specified size
        System.out.printf("%s%8s\n", "Index", "Value");
        // display array elements
        for (int count = 0; count < array.length; count++) {
            System.out.printf("%5d%8d\n", count, array[count]);
        }
    }

}
