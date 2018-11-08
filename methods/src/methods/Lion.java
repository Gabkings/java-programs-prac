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
public class Lion {

    int speed = 100, power = 230;

    public void Roar() {
        System.out.println("Roars");
    }
    public void setSpeed(int value){
        speed = value;
    }
    public void setPower(int pwd){
        power = pwd;
    }
    public int getSpeed(){
        return speed;
    }
    public int getPower(){
        return power;
    }
}
