/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passlist;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class Passlist {

    public void analysis() {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int pass = 0;
        int failure = 0;
        int results;
        while (counter <= 10) {
            System.out.print("\nEnter results here: ");
            results = input.nextInt();
            if (results == 1) {
                pass = pass + 1;
            } else {
                failure = failure + 1;
            }
            counter = counter + 1;

        }
        // termination phase; prepare and display results
        System.out.printf("Passed: %d\nFailed: %d\n", pass, failure);
        if (pass > 8) {
            System.out.println("Bonus to instructor!");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Passlist pass = new Passlist();
        pass.analysis();
    }

}
