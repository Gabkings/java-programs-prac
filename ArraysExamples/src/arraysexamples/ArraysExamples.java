/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysexamples;

/**
 *
 * @author developer
 */
public class ArraysExamples {
    public static void main(String[] args) {
        // TODO code application logic here
        int arraySize = 10;
        int[] values = new int[arraySize];
        // calculate value for each array element
        for (int counter = 0; counter < values.length; counter++) {
            values[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s%8s\n", "Index", "Values");
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%5d%8d\n", i, values[i]);
        }
    }

}
