package craps.java;

import java.util.Random;

public class CrapsJava {

    // create random number generator for use in method rollDice
    private Random randomNumbers = new Random();

    // enumeration with constants that represent the game status
    private enum Status {
        CONTINUE, WON, LOST
    };

    int wins[]; // number of wins, by rolls
    int losses[]; // number of losses, by rolls
    int winSum = 0; // total number of wins
    int loseSum = 0; // total number of losses

// plays one game of craps
    public void play() {
        int sumOfDice = 0; // sum of the dice
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST
        int roll; // number of rolls for the current game
        wins = new int[22]; // frequency of wins
        losses = new int[22]; // frequency of losses
        for (int i = 0; i <= 1000; i++) {
            sumOfDice = rollDice(); // first roll of the dice
            roll = 1;
            switch (sumOfDice) {
                case 7:
                case 11:
                    gameStatus = Status.WON;
                    break;
                case 2://lose with 2 on first roll

                case 3://lose with 3 on first roll
                case 12://lose with 12 on first roll
                    gameStatus = Status.LOST;
                    break;
                default: // did not win or lose, so remember point
                    gameStatus = Status.CONTINUE; // game is not over
                    myPoint = sumOfDice; // store the point
                    break; // optional for default case at end of switch

            }//end switch
            //while game not complete
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice(); // roll dice again
                roll++;
                // determine game status
                if (sumOfDice == myPoint) // win by making point
                {
                    gameStatus = Status.WON;
                } else if (sumOfDice == 7) // lose by rolling 7
                {
                    gameStatus = Status.LOST;
                }
                // all roll results after 20th roll placed in last element
                if (roll > 21) {
                    roll = 21;
                }
// increment number of wins in that roll
                if (gameStatus == Status.WON) {
                    ++wins[roll];
                    ++winSum;
                } // end if
                else {
                    ++losses[roll];
                    ++loseSum;
                }//end else
            }//end for
            

        }
        printStats();
    }
    
    public void printStats(){
        int totalGames = winSum + loseSum;//total number of games
        int length = 0; // total length of the games
        // display number of wins and losses on all rolls
        for ( int i = 1; i <= 21; i++ ){
            if(i == 21){
                System.out.printf( "%d %s %d %s\n",
                        wins[ i ], "games won and", losses[ i ],
                        "games lost on rolls after the 20th roll" );
                
            }else{
                System.out.printf( "%d %s %d %s %d\n",
                        wins[ i ], "games won and", losses[ i ],
                        "games lost on rolls #", i );
                // for calculating length of game
                // number of wins/losses on that roll multiplied
                // by the roll number, then add them to length
                length += wins[ i ] * i + losses[ i ] * i;
            }
        }//end for loop
        // calculate chances of winning
        System.out.printf( "\n%s %d / %d = %.2f%%\n",
                "The chances of winning are", winSum, totalGames,
                ( 100.0 * winSum / totalGames ) );
        
        System.out.printf( "The average game length is %.2f rolls.\n",
                ( ( double ) length / totalGames ) );
    }
    
    // roll dice, calculate sum and display results
    public int rollDice(){
        //pick random dice values
        int die1 = 1 + randomNumbers.nextInt( 6 );
        int die2 = 1 + randomNumbers.nextInt( 6 );
        int sum = die1 + die2; // sum die values
        return sum; // return sum of dice
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        CrapsJava crap1 = new CrapsJava();
        crap1.play();
    }

}
