/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneRowNimeGame;

/**
 *
 * @author developer
 */
public class OneRowNimGame {
    private int nSticks = 7;
    private int player = 1;
    
    public void takeOne(){
        nSticks = nSticks - 1;
        player = 3 - player;
    }
    public void takeTwo(){
        nSticks = nSticks - 2;
        player = 3 - player;
    }
     public void takeThree(){
        nSticks = nSticks - 3;
        player = 3 - player;
    }
     
     public void report(){
        System.out.print("\n Remaing sticks are "+nSticks);
        System.out.print("\nYour turn player "+player);
    }
}
