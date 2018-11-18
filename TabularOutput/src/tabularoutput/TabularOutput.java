/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabularoutput;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class TabularOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = 1, m;
        System.out.println("Enter the max number of table");
        m = input.nextInt();
        System.out.println( "N\t10*N\t100*N\t1000*N\n" );//header
        while(n <= m){
            System.out.println(n +"\t"+(n*10)+"\t"+(n*100)+"\t"+(n*1000));
            n++;
        }
    }
    
}
