/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

import java.util.Random;

/**
 *
 * @author developer
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int face ;
        for(int i= 1 ;i<=20; i++){
            face =1 + random.nextInt(6);
            System.out.printf("%d ", face);
            if(i%5 == 0){
                System.out.println();
            }
            
        }
    }
    
}
