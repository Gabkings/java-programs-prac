/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author developer
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lion l1 = new Lion();
     

        l1.setPower(399);
        l1.setSpeed(400);
        System.out.println(l1.getPower());
        System.out.println(l1.getSpeed());
    }
    
}
