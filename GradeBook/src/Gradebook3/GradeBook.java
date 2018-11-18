/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gradebook3;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class GradeBook {

    private String courseName; // name of course this GradeBook represents
// int instance variables are initialized to 0 by default
    private int total; // sum of grades
    private int gradeCounter; // number of grades entered
    private int aCount; // count of A grades
    private int bCount; // count of B grades
    private int cCount; // count of C grades
    private int dCount; // count of D grades
    private int fCount; // count of F grades

    public GradeBook(String name) {
        courseName = name;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
// getCourseName gets the name of the course
        System.out.printf("Welcome to the grade book for\n%s!\n\n",
                getCourseName());
    }

    public void inputGrades() {
        Scanner input = new Scanner(System.in);
        int grade = 0; // grade entered by user
        System.out.printf("%s\n","Enter -1 to quit");
        while (grade != -1) {
            grade = input.nextInt();
            total = total + grade;
            ++gradeCounter;
            // call method to increment appropriate counter
            incrementLetterGradeCounter(grade);
        }

    }

    public void incrementLetterGradeCounter(int grade) {
        switch (grade / 10) {
            case 9:
            case 10:
                ++aCount;
                break;
            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                break;
            default:
                ++fCount;
                break;

        }
    }

    public void displayGradeReport() {
        System.out.println("Grades Report");
        if (gradeCounter != 0) {
            // calculate average of all grades entered

            double average = (double) total / gradeCounter;
            System.out.printf("Total of the %d grades entered is %d\n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Number of students who received each grade:",
                    "A: ", aCount,
                    // display number of A grades

                    "B: ", bCount,
                    // display number of B grades

                    "C: ", cCount,
                    // display number of C grades

                    "D: ", dCount,
                    // display number of D grades
                    "F: ", fCount); // display number of F grades

        } else {
            System.out.println("No grades were entered");
        }
    }

    public static void main(String args[]) {
        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming");
        myGradeBook.displayMessage(); // display welcome message
        myGradeBook.inputGrades(); // read grades from user
        myGradeBook.displayGradeReport(); // display report based on grades
    }

}
