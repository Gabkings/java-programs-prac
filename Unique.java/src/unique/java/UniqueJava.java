// Exercise 7.12 Solution: Unique.java
// Reads in 5 unique numbers.
package unique.java;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class UniqueJava {

    /**
     * @param args the command line arguments
     */
    public static void getNumbers() {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[5]; // list of unique numbers
        int count = 0; // number of uniques read
        while (count < numbers.length) {
            System.out.print("Enter number: ");
            int number = input.nextInt();
            // validate the input
            if (number >= 10 && number <= 100) {
                // flags whether this number already exists
                boolean containsNumber = false;
                for(int i = 0; i < count; i++){
                    //check if number is dublicate
                    if(number == numbers[i]){
                        containsNumber = true;
                    }
                }
                if(!containsNumber){
                    numbers[count] = number;
                    count++;
                }else{
                    System.out.print("Number already exists");
                }
                        
            } 
            else {
                System.out.println("number must be between 10 and 100");
            }
             //display the numbers
            for(int num = 0; num < count; num++){
                System.out.printf("%3d", numbers[num]);
            }
            System.out.println();
           
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        getNumbers();
    }

}
