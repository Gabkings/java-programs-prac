
package sidesofarighttriangle;

import javax.swing.JOptionPane;

public class SidesOfARightTriangle {


    public static void main(String[] args) {
        // TODO code application logic here
                String resultString;
        int side1, side2, side3,squareSide1,squareSide2,squareSide3;
        side1 = Integer.parseInt(JOptionPane.showInputDialog("Enter side one"));
        side2 = Integer.parseInt(JOptionPane.showInputDialog("Enter side 2"));
        side3 = Integer.parseInt(JOptionPane.showInputDialog("Enter side 3"));
        resultString = "Could not be side of triangle";
        squareSide1 = (int) Math.pow(side1, 2);
        squareSide2 = (int) Math.pow(side2, 2);
        squareSide3 = (int) Math.pow(side3, 2);
        if((squareSide1 + squareSide2) == squareSide3)
            resultString = "Could  be side of right triangle";
        if((squareSide1 + squareSide3) == squareSide2)
            resultString = "Could  be side of right triangle";
        if((squareSide2 + squareSide3) == squareSide1)
            resultString = "Could  be side of right triangle";
        JOptionPane.showMessageDialog(null,resultString,"Sides of right triangle",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
