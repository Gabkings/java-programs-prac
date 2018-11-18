/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingarraystomethods;

/**
 *
 * @author developer
 */
public class PassingArraysToMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int values[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.printf("%2s\n ", "Intial arrays before modification\n\n");
        for (int i : values) {
            System.out.printf("%5d", i);
        }
        System.out.printf("%2s\n ", "\nResults arrays after modification\n\n");
        modify(values);
        System.out.printf("%2s\n ", "\nResult of one array element after modification\n\n");
        changeOne(values[3]);

    }

    public static void modify(int array2[]) {
        for (int i = 0; i < array2.length; i++) {
            int arr = 2 * array2[i];
            System.out.printf("%5d", arr);
        }
    }

    public static void changeOne(int element) {
        element = element * 2;
        System.out.printf("%5d\n", element);
    }

}
