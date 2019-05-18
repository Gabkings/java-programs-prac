// Exercise 7.17 Solution: Roll36.java
// Program simulates rolling two six-sided dice 36,000 times.
package roll36;

import java.util.Random;

/**
 *
 * @author developer
 */
public class Roll36 {

    /**
     * @param args the command line arguments
     */
    public static void rollDice() {
        Random rand = new Random();
        int face1;//face of first dice
        int face2; //face of the second dice
        int totals[] = new int[13]; // frequencies of the sums
        //initialize the totals to zero
        for (int counter = 0; counter < totals.length; counter++) {
            totals[counter] = 0;
        }
        //roll the dice
        for (int roll = 0; roll < 36000; roll++) {
            face1 = 1 + rand.nextInt(6);
            face2 = 1 + rand.nextInt(6);
            totals[face1 + face2]++;
        }
        // print the table
        System.out.printf("%3s%12s%12s\n",
                "Sum", "Frequency", "Percentage");
        //ignore 0 and 1
        for(int k = 2; k < totals.length; k++){
            int percent = totals[k]/ 360;
            System.out.printf( "%3d%12d%12d\n", k, totals[ k ], percent );
            
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        rollDice();
    }

}
