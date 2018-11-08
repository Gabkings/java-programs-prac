/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldswing;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;
import static java.awt.PageAttributes.MediaType.D;
import static javafx.scene.input.KeyCode.O;


/**
 *
 * @author developer
 */
public class HelloWorldSwing extends Canvas {

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(20, 20, 150, 100);
        g.setColor(Color.BLUE);
        g.drawRect( 25 , 25 , 140 , 40 );
        g.setColor(Color.MAGENTA ) ;
    // S e t c o l o r
    g. drawString ( "Hello , World ! ",50 ,50 ) ; // D i s p l a y
    g.setColor(Color.yellow ) ;
    g.fillOval( 25 , 75 , 140 , 40 ) ; // F i l l o v a l
    g.setColor ( Color.red ) ;
    g.drawOval(25,75,140,40 ); // O u t l i n e o v a l
    g.setColor (Color .black ) ;
    g.drawString ( "Welcome t o Jav a " , 50 , 100 ) ;
        

    }

    
    public static void main(String[] args) {
        // TODO code application logic here
                HelloWorldSwing hv = new HelloWorldSwing();
        JFrame f = new JFrame();
        f.add(hv);
        f.setSize(150,150);
        f.setVisible(true);
    }
    
}
