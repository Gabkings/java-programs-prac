/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleprintformart;

/**
 *
 * @author developer
 */
public class SamplePrintFormart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        for(i = 1; i<=20;i++){
            if(i % 5 == 0){
                System.out.println();
            }else{
                System.out.print( i +"\t");
            }
        }
        
    }
    
}
