/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knight1;

import java.util.Random;

/**
 *
 * @author developer
 */
public class Knight1 {

    /**
     * @param args the command line arguments
     */
    Random randomNumbers = new Random();
    int board[][]; // gameboard

    // moves
    int horizontal[] = {2, 1, -1, -2, -2, -1, 1, 2};
    int vertical[] = {-1, -2, -2, -1, 1, 2, 2, 1};
    // runs a tour

    // runs a tour
    public void tour() {
        int currentRow; // the row position on the chessboard
        int currentColumn; // the column position on the chessboard
        int moveNumber = 0; // the current move number
        board = new int[8][8]; // gameboard
        int testRow; // row position of next possible move
        int testColumn; // column position of next possible move
        // randomize initial board position
        currentRow = randomNumbers.nextInt(8);
        currentColumn = randomNumbers.nextInt(8);

        board[currentRow][currentColumn] = ++moveNumber;
        boolean done = false;
        // continue until knight can no longer move
        while (!done) {
            boolean goodMove = false;
            // check all possible moves until we find one that's legal
            for (int moveType = 0; moveType < 8 && !goodMove;
                    moveType++) {
                testRow = currentRow + vertical[moveType];
                testColumn = currentColumn + horizontal[moveType];
                goodMove = validMove(testRow, testColumn);
                // test if new move is valid
                if (goodMove) {
                    currentRow = testRow;
                    currentColumn = testColumn;
                    board[currentRow][currentColumn] = ++moveNumber;

                }//end if

            }//end for
            // if no valid moves, knight can no longer move
            if (!goodMove) {
                done = true;
            } else if (moveNumber == 64) {
                done = true;
            }
        }//end while
        System.out.printf("The tour ended with %d moves.\n", moveNumber);
        if (moveNumber == 64) {
            System.out.println("This was a full tour!");
        } else {
            System.out.println("This was not a full tour.");
        }
        printTour();
    }//end method tour

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
        Knight1 object1 = new Knight1();
        object1.tour();
    }

}
