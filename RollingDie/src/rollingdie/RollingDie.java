/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollingdie;

import java.util.Random;

/**
 *
 * @author developer
 */
public class RollingDie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int face;
        int freq1 = 0;
        int freq2 = 0;
        int freq3 = 0;
        int freq4 = 0;
        int freq5 = 0;
        int freq6 = 0;
        for (int i = 1; i < 60000; i++) {
            face = 1+ random.nextInt(6);
            switch (face) {
                case 1:
                    ++freq1;
                    break;
                case 2:
                    ++freq2;
                    break;
                case 3:
                    ++freq3;
                    break;
                case 4:
                    ++freq4;
                    break;
                case 5:
                    ++freq5;
                    break;
                case 6:
                    ++freq6;
                    break;
            }
        }
        System.out.println("Face\tFrequency"); // output headers
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
                freq1, freq2, freq3, freq4,
                freq5, freq6);
    }

}
