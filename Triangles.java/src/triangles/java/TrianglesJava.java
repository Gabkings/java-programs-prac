/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangles.java;

/**
 *
 * @author developer
 */
public class TrianglesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int column, space, row;
        //first triangle
        for (row = 1; row <= 10; row++) {
            for (column = 1; column < row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }//end of first triangle
        System.out.println();
        for (row = 10; row > 1; row--) {
            for (column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }//end of second triangle
        System.out.println();
        for (row = 10; row > 1; row--) {
            for (space = 10; space > row; space--) {
                System.out.print(" ");
            }
            for (column = 1; column < row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }//end of third triangle
        System.out.println();
        // fourth triangle
        for (row = 10; row >= 1; row--) {
            for (space = 1; space < row; space++) {
                System.out.print(' ');
            }
            for (column = 10; column >= row; column--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
