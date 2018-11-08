/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */
public class Birds {
    private int speed = 40;
    
    public void setSpeed (int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void Behavior(){
        System.out.println("FLY ....");
    }
    
}
