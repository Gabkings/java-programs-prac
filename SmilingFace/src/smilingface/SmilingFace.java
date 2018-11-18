/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smilingface;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmilingFace extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        //draw eyes 
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        // draw the mouth
        g.fillOval(50, 110, 120, 60);
// "touch up" the mouth into a smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        SmilingFace panel = new SmilingFace();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }

}
