/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayanalysis;

import java.util.Random;

/**
 *
 * @author developer
 */
public class ArrayAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int responces[] = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
            2, 3, 3, 2, 14,1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
            2, 3, 3, 2, 15};
        int freq[] = new int[6];
        for(int answer = 0;answer<responces.length;answer++){
            try{
                ++freq[responces[answer]];
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                 System.out.printf("responces[ % d] =  % d\n\n", answer, responces[answer]);
            }
        }
        for(int res = 1;res<freq.length;res++){
            System.out.printf("%6d%10d\n", res, freq[res]);
        }
        
        
    }
    
}
