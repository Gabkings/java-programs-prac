/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twolargenumbers;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class TwoLargeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int largest,number, nextLargest,counter;
        String input,results;
        
        input =JOptionPane.showInputDialog("Enter number here");
        largest = Integer.parseInt(input);
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        if(largest > number){
            nextLargest = largest;
            largest = number;
        }else{
            nextLargest = number;
        }
        counter = 2;
        while(counter <= 10){
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
            if(number > largest){
                nextLargest = largest;
                largest = number;
            }else
                if(number > nextLargest){
                    nextLargest = number;
                }
            counter++;
        }//end while loop
        results = "largest number: "+largest+" next largest: "+nextLargest;
        JOptionPane.showMessageDialog(null, results,"two largest numbers",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    }//end main method
    
}
