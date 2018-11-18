/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedforloop;

/**
 *
 * @author developer
 */
public class AdvancedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        for(int number : array)
            total += number;
        System.out.printf(" the sum is %5d"
                + ":",total);
    }

}
