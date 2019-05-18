/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class Graphs extends JApplet {

    int number1, number2, number3, number4, number5;
// initialize applet by obtaining values from user

    public void init() {
        String input;
        int number, counter = 1;
        while (counter <= 5) {
            input = JOptionPane.showInputDialog("Enter the number");
            number = Integer.parseInt(input);
            if (number == 1 && number <= 30) {
                switch (counter) {
                    case 1:
                        number1 = number;
                        break;
                    case 2:
                        number2 = number;
                        break;
                    case 3:
                        number3 = number;
                        break;
                    case 4:
                        number4 = number;
                        break;
                    case 5:
                        number5 = number;
                        break;
                }//end switch
                counter++;
            }//end if
            else {
                JOptionPane.showMessageDialog(null,
                        "Invalid Input\nNumber should be between 1 and 30",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }//end while
    } //end init
// draw histograms on applet's background

    public void paint(Graphics g) {
        // call inherited version of method paint
        super.paint(g);
        int xCoordinate, yCoordinate = 0, value = 0;
        for (int counter = 1; counter <= 5; counter++) {
            switch (counter) {
                case 1:
                    value = number1;
                    break;
                case 2:
                    value = number2;
                    break;
                case 3:
                    value = number3;
                    break;
                case 4:
                    value = number4;
                    break;
                case 5:
                    value = number5;
                    break;
            }
            xCoordinate = 5;
            yCoordinate = counter * 10 + 40;
            for(int j = 1; j <= value; j++){
                g.drawString( "*", xCoordinate += 5, yCoordinate );
            }
        }
    }// end method paint

    public static void main(String[] args) {
       
    }

}
