/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd;

/**
 *
 * @author developer
 */
public class Odd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int product = 1;
        for(int i = 1;i <= 15; i += 2){
            product *= i;
        }//end of for loop
        System.out.println(product);
        
    }
    
}
