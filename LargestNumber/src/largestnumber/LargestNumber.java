/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnumber;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input,result;
        int largest, number,count = 1;
        input = JOptionPane.showInputDialog("Enter your number here");
        largest = Integer.parseInt(input);
        while(count <= 10){
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter your number here"));
            if(number > largest){
                largest = number;
            }
            count++;
            
        }
        JOptionPane.showMessageDialog(null,"Largest number is: "+ largest,"Largest no",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    }
    
}
