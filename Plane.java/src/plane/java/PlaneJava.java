/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plane.java;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class PlaneJava {

    /**
     * @param args the command line arguments
     */
    public void checkIn() {
        Scanner input = new Scanner(System.in);
        boolean seats[] = new boolean[10]; // array of seats
        int firstClass = 0; // next available first class seat
        int economy = 5; // next available economy seat
        while ((firstClass < 5) || (economy < 10)) {
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            System.out.print("choice: ");
            int section = input.nextInt();
            if (section == 1) {
                if (firstClass < 5) {
                    firstClass++;
                    System.out.printf("First Class. Seat #%d\n", firstClass);
                } else if (economy < 10) {
                    System.out.println(
                            "First Class is full, Economy Class?");
                    System.out.print("1. Yes, 2. No. Your choice: ");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        economy++;
                        System.out.printf("Economy Class. Seat #%d\n",
                                economy);
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }//end else if
                }//end if
            } else if (section == 2) {
                if (economy < 10) {
                    economy++;
                    System.out.printf("Economy Class. Seat #%d\n",
                            economy);
                } else if (firstClass < 5) {
                    System.out.println(
                            "Economy Class is full, firstClass Class?");
                    System.out.print("1. Yes, 2. No. Your choice: ");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        firstClass++;
                        System.out.printf("First Class. Seat #%d\n", firstClass);
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
                System.out.println();
            }
        }//end while
    }

    public static void main(String[] args) {
        // TODO code application logic her
        PlaneJava application = new PlaneJava();
        application.checkIn();
    }

}
