/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlegraphics;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class TurtleGraphics {

    /**
     * @param args the command line arguments
     */
    final int MAXCOMMANDS = 100; // maximum size of command array
    final int SIZE = 20; // size of the drawing area
    int floor[][]; // array representing the floor
    int commandArray[][]; // list of commands
    int count; // the current number of commands
    int xPos; // the x position of the turtle
    int yPos; // the y position of the turtle
    // enters the commands for the turtle graphics

    public void enterCommands() {
        Scanner input = new Scanner(System.in);
        count = 0;
        commandArray = new int[MAXCOMMANDS][2];
        floor = new int[SIZE][SIZE];
        System.out.print("Enter command (9 to end input): ");
        int inputCommand = input.nextInt();
        while (inputCommand != 9 && count < MAXCOMMANDS) {
            commandArray[count][0] = inputCommand;
            if (inputCommand == 5) {
                System.out.println("Enter forward spaces");
                commandArray[count][1] = input.nextInt();
            }//end if
            count++;
            System.out.print("Enter command (9 to end input): ");
            inputCommand = input.nextInt();
        }//end while loop
        executeCommands();
    }//end method enter commands
    // executes the commands in the command array

    public void executeCommands() {
        int commandNumber = 0; // the current position in
        int direction = 0; // the direction the turtle is
        int distance = 0; // the distance the turtle will
        int command; // the current command
        boolean penDown = false; // whether the pen is up
        xPos = 0;
        yPos = 0;
        command = commandArray[commandNumber][0];
        // continue executing commands until either reach the end
        // or reach the max commands
        while (commandNumber < count) {
            //System.out.println("Executing...");
            // determine what command was entered
            // and perform desired action
            switch (command) {
                case 1://pen down
                    penDown = false;
                    break;
                case 2://pen down
                    penDown = true;
                    break;
                case 3:// turn right
                    direction = turnRight(direction);
                    break;
                case 4://turn left
                    direction = turnLeft(direction);
                    break;
                case 5://movet 
                    distance = commandArray[commandNumber][1];
                    movePen(penDown, floor, direction, distance);
                    break;
                case 6: //display the drawing
                    System.out.println("\nThe drawing is:\n");
                    printArray(floor);
                    break;

            }//end switsh
            command = commandArray[++commandNumber][0];
        }//end while
    }// end executeCommands method
// method to turn turtle to the right

    public int turnRight(int d) {
        return ++d > 3 ? 0 : d;
    }// end method turnRight

    public int turnLeft(int d) {
        return --d > 0 ? 3 : d;
    }// end method turnLeft

    
    // method to move the pen
    public void movePen(boolean down, int a[][], int dir, int dist) {
        int j; // looping variable
        // determine which way to move pen
        switch (dir) {
            case 0://move right
                for (j = 1; j <= dist && yPos + j < SIZE; ++j) {
                    if (down) {
                        a[xPos][yPos + j] = 1;
                    }

                }
                yPos += j - 1;
                break;
            case 1://move down
                for (j = 1; j <= dist && xPos < SIZE; ++j) {
                    if (down) {
                        a[xPos + j][yPos] = 1;
                    }
                }
                xPos += j - 1;
                break;
            case 2://move left
                for (j = 1; j <= dist && yPos < SIZE; j++) {
                    if (down) {
                        a[xPos][yPos - j] = 1;
                    }
                }
                yPos -= j - 1;
                break;
            case 3://move up
                for (j = 1; j <= dist && xPos < SIZE; j++) {
                    if (down) {
                        a[xPos - j][yPos] = 1;
                    }
                }
                xPos -= j - 1;
                break;
        }// end switch

    }// end method movePen
    // method to turn turtle to the left

    // method to print array drawing
    public void printArray(int a[][]) {
        // display array
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                System.out.print((a[i][j] == 1 ? "*" : " "));
            }
            System.out.println();
        }// end for

    }// end method print array

    public static void main(String[] args) {
        // TODO code application logic here
        TurtleGraphics object1 = new TurtleGraphics();
        object1.enterCommands();
    }

}
