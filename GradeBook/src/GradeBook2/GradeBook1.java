/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeBook2;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class GradeBook1 {

    private String courseName;

    public GradeBook1(String name) {
        courseName = name;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayDetails() {
        System.out.printf("\nWelcome to %s", getCourseName());
    }

    public void determineClassAverage() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        double average;
        int grade;
        //prompt the user to enter the first grade
        System.out.print("\nEnter grade here ");
        grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            counter = counter + 1;
            // prompt for input and read next grade from user
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        
        if(counter != 0){
            average = total/counter;
            System.out.println("The course average is: "+ average);
        }else{
            System.out.println( "No grades were entered" );
        }

    }
        public static void main(String[] args) {
        // create GradeBook object myGradeBook and
// pass course name to constructor
        GradeBook1 myGradeBook = new GradeBook1(
                "CS101 Introduction to Java Programming");
        myGradeBook.displayDetails(); // display welcome message
        myGradeBook.determineClassAverage(); // find average of 10 grades
    }
}
