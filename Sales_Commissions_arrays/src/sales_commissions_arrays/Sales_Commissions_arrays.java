// Exercise 7.10 Solution: Sales.java
// Program calculates the amount of pay for a salesperson and counts the
// number of salespeople that earned salaries in given ranges.
package sales_commissions_arrays;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class Sales_Commissions_arrays {

    /**
     * @param args the command line arguments
     */
    public static void countRanges() {
        Scanner scan = new Scanner(System.in);
        int total[] = new int[9]; // totals for the various salaries
        // initialize the values in the array to zero
        for (int count = 0; count < total.length; count++) {
            total[count] = 0;
            // read in values and assign them to the appropriate range
            System.out.print("Enter sales amount (negative to end): ");

            double dollars = scan.nextDouble();
            while (dollars >= 0) {

                double salary = dollars * 0.09 + 200;
                int range = (int) (salary / 100);
                if (range > 10) {
                    range = 10;
                }
                ++total[range - 2];
                System.out.print("Enter sales amount (negative to end): ");
                dollars = scan.nextDouble();
            }//end while
            // print chart
            System.out.println("Range\t\tNumber");
            for (int range = 0; range < total.length - 1; range++) {
                System.out.printf("$%d-$%d\t%d\n",
                        (200 + 100 * range), (299 + 100 * range), total[range]);
            }
            // special case for the last range
            System.out.printf("$1000 and over\t%d\n",
                    total[total.length - 1]);

        }
    }

    public static void main(String[] args) {
     countRanges();
    }

}
