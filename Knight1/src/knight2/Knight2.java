/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knight2;

import java.util.Random;
import knight1.Knight1;

/**
 *
 * @author developer
 */
public class Knight2 {

    Random randomNumbers = new Random();

    int access[][] = {
        {2, 3, 4, 4, 4, 4, 3, 2},
        {3, 4, 6, 6, 6, 6, 4, 6},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {3, 4, 6, 6, 6, 6, 4, 6},
        {2, 3, 4, 4, 4, 4, 3, 2}
    };

    int board[][]; // gameboard
    int accessNumber; // the current access number

    // moves
    int horizontal[] = {2, 1, -1, -2, -2, -1, 1, 2};
    int vertical[] = {-1, -2, -2, -1, 1, 2, 2, 1};

    //initialize applet
    public void tour() {
        int currentRow; // the row position on the chessboard
        int currentColumn; // the column position on the chessboard
        int moveNumber = 0; // the current move number
        int testRow; // row position of next possible move
        int testColumn; // column position of next possible move
        int minRow = -1; // row position of move with minimum access
        int minColumn = -1; // column position of move with minimum access
        board = new int[8][8];
        // randomize initial board position
        currentRow = randomNumbers.nextInt(8);
        currentColumn = randomNumbers.nextInt(8);
        board[currentRow][currentColumn] = ++moveNumber;
        boolean done = false;

        // continue touring until finished traversing
        while (!done) {
            accessNumber = 99;
            // try all possible moves
            for (int moveType = 0; moveType < board.length; moveType++) {
                // new position of hypothetical moves
                testRow = currentRow + vertical[moveType];
                testColumn = currentColumn + horizontal[moveType];

                if (validMove(testRow, testColumn)) {
                    // obtain access number
                    if (access[testRow][testColumn] < accessNumber) {
                        // if this is the lowest access number thus far,
                        // then set this move to be our next move
                        accessNumber = access[testRow][testColumn];
                        minRow = testRow;
                        minColumn = testColumn;
                    }//end if
                    // position access number tried
                    --access[testRow][testColumn];
                }//end if
            }//end for
            // traversing done
            if (accessNumber == 99) {
                done = true;
            } else {
                //make a move
                currentRow = minRow;
                currentColumn = minColumn;
                board[currentRow][currentColumn] = ++moveNumber;
            }//end else
        }//end while

        System.out.printf("The tour ended with %d moves.\n", moveNumber);
        if (moveNumber == 64) {
            System.out.println(" This was a full tour!");
        } else {
            System.out.println(" This was not a full tour.");
        }
        printTour();
    }

    //check for valid move
    public boolean validMove(int row, int column) {
        // returns false if the move is off the chessboard, or if
        // the knight has already visited that position
        // NOTE: This test stops as soon as it becomes false
        return (row >= 0 && row < 8 && column >= 0 && column < 8 && board[row][column] == 0);
    }
    
    
    // display Knight's tour path
    public void printTour() {
        // display numbers for column
        for (int k = 0; k < 8; k++) {
            System.out.printf("\t%d", k);
        }
        System.out.print("\n\n");

        for (int row = 0; row < board.length; row++) {
            System.out.print(row);
            for (int column = 0; column < board[row].length; column++) {
                System.out.printf("\t%d", board[row][column]);
            }
            System.out.println();
        }// end for
    }// end method printTour

        public static void main(String[] args) {
        // TODO code application logic here
        Knight2 object1 = new Knight2();
        object1.tour();
    }
    
    
}
 