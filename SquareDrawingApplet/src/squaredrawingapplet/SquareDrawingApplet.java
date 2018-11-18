package squaredrawingapplet;

import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JOptionPane;

public class SquareDrawingApplet extends JApplet {
    int stars;
    @Override
    public void init() {
        String input;//entered by the user
        input = JOptionPane.showInputDialog("Enter the length of square");
        
        stars = Integer.parseInt(input);
        if (stars < 1) {
            stars = 1;
            JOptionPane.showMessageDialog(null,
                    "Invalid Input\nUsing default value 1",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (stars > 20) {
            stars = 20;
            JOptionPane.showMessageDialog(null,
                    "Invalid Input\nUsing default value 20",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//end of init method

    @Override
    public void paint(Graphics g) {
        super.paint(g);//call the inherited class method of paint
        int xCoordinate = 5, yCoordinate = 70, row = 1, column = 1;
        while (row <= stars) {
            // and for as many columns as rows
            while (column <= stars) {
                if (row == 1) {
                    g.drawString("*", xCoordinate, yCoordinate);
                } else if (row == stars) {
                    g.drawString("*", xCoordinate, yCoordinate);
                } else if (column == 1) {
                    g.drawString("*", xCoordinate, yCoordinate);
                } else if (column == stars) {
                    g.drawString("*", xCoordinate, yCoordinate);
                } else {
                    g.drawString(" ", xCoordinate, yCoordinate);
                }
                xCoordinate += 5;
                column++;
            }
            column = 1;
            row++;
            yCoordinate += 5;
            xCoordinate = 5;
        }
    }
    public static void main(String args[]){
        
    }

}
