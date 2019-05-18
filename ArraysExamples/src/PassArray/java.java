/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassArray;

/**
 *
 * @author developer
 */
public class java {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(
                "Effects of passing reference to entire array:\n"
                + "The values of the original array are:");

        //array elements before modification
        for (int value : array) {
            System.out.printf("%2d", value);
        }
        System.out.println("\n");

        //array elements aafter modification
        modifyArrayElements( array);
         //array elements before modification
        for (int value : array) {
            System.out.printf("%2d", value);
        }
        
    }

    public static void modifyArrayElements(int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] *= 2;
        }
    }

    public static void modifyArrayElement(int element) {
        element *= 2;
        System.out.printf(
                "Value of element in modifyElement: %d\n", element);
    }
}
