/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.util.Scanner;

public class GradeBook {

    private String courseName;

    public GradeBook(String name) {
        courseName = name;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourseDetails() {
        System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName());
    }

    public void determineCourseAverage() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int gradeCounter = 1;

        while (gradeCounter < 11) {
            System.out.println("Enter grade here: ");
            grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;

        }

        average = total / 10;
        System.out.printf("The total and average  is %d\t %d ", total, average);

    }

    public static void main(String[] args) {
        // create GradeBook object myGradeBook and
// pass course name to constructor
        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming");
        myGradeBook.displayCourseDetails(); // display welcome message
        myGradeBook.determineCourseAverage(); // find average of 10 grades
    }

}
