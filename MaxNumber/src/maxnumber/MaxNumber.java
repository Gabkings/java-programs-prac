/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxnumber;

/**
 *
 * @author developer
 */
public class MaxNumber {

    /**
     * @param args the command line arguments
     */
    public int getMaxNo(int x , int y, int z){
        return Math.max(x, Math.max(y, z));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        MaxNumber obj1 = new MaxNumber();
       int x = obj1.getMaxNo(10, 7, 12);
       System.out.println(x);
    }
    
}
