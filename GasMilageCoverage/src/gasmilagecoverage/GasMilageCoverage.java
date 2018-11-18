/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasmilagecoverage;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class GasMilageCoverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int miles, gallons, totalMiles = 0, totalGallons = 0;
        float milesPerGallon, totalMilesPerGallon;
        String inputMiles, inputGallons, result = "";
        inputMiles = JOptionPane.showInputDialog("Enter the miles covered");
        miles = Integer.parseInt(inputMiles);
        // exit if the input is -1 otherwise, proceed with the program
        while (miles != -1) {
            // read second number from user as String
            inputGallons = JOptionPane.showInputDialog("Enter gallons:");
// convert gallons from type String to type int
            gallons = Integer.parseInt(inputGallons);

            totalMiles += miles;
            totalGallons += gallons;
            DecimalFormat twoDigits = new DecimalFormat("0.00");
            if (gallons != 0) {
                milesPerGallon = (float) miles / gallons;
                result = "MPG this tankful: "
                        + twoDigits.format(milesPerGallon) + "\n";
            }//end if statement
            totalMilesPerGallon = (float) totalMiles / totalGallons;
            result += "Total MPG: "
                    + twoDigits.format(totalMilesPerGallon) + "\n";
            JOptionPane.showMessageDialog(null, result, "Milage",
                    JOptionPane.INFORMATION_MESSAGE);
            // input new value for miles and convert from String to int
            inputMiles = JOptionPane.showInputDialog(
                    "Enter miles (-1 to quit):");
            miles = Integer.parseInt(inputMiles);
        }//end while loop
        System.exit( 0 );
    }//end of main

}//end of class
