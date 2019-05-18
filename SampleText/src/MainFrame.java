
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */
public class MainFrame extends JFrame {
    private JButton btn1,btn2,btn3,btn4,add;
    private JTextField text1;
    public MainFrame(){
        super("Simple calculator");
        setLayout(new BorderLayout());
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        add = new JButton("Add");
        add(btn1,BorderLayout.CENTER);
        add(btn2,BorderLayout.CENTER);
        add(btn3,BorderLayout.CENTER);
        add(btn4,BorderLayout.CENTER);
        add(add,BorderLayout.SOUTH);
        add.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                
            }
        
        });
        setSize(600,500);
        setVisible(true);
    }
}
