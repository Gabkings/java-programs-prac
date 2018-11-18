/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;

import java.util.Random;

/**
 *
 * @author developer
 */
public class Craps {

    /**
     * @param args the command line arguments
     */
    // create random number generator for use in method rollDice
    private static final Random randomNumbers = new Random();
//enumeration results that holds game status

    private enum Status {
        CONTINUE, WON, LOST
    };
// constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    // roll dice, calculate sum and display results

    public static int rollDice() {
// pick random die values

        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll
        int sum = die1 + die2; // sum of die values
// display results of this roll
        System.out.printf("Player rolled %d + %d = %d\n",
                die1, die2, sum);
        return sum; // return sum of dice
    } // end method rollDice

    public static void main(String[] args) {
        // TODO code application logic here
        int myPoint = 0;//no win or loss on the first throw
        Status gameStatus; // can contain CONTINUE, WON or LOST
        int sumDice = rollDice();
        switch (sumDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumDice; // remember the point
                System.out.printf("Point is %d\n", myPoint);
                break; // optional at end of switch
        }//end switch
        while (gameStatus == Status.CONTINUE) {
            sumDice = rollDice();
            if (sumDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumDice == SEVEN) {
                gameStatus = Status.LOST;
            }
        }//end while
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }
    }

}
