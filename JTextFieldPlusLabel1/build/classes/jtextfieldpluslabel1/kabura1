package jtextfieldpluslabel1;
import java.awt.*;
import javax.swing.*;
public class JTextFieldPlusLabel1 extends JFrame
{
    JTextField field1, field2;
    JLabel first, second;
    JTextFieldPlusLabel1()
    {
        field1 = new JTextField(20);
        field2 = new JTextField(20);
        first=new JLabel("Enter first name");
        second=new JLabel("Enter secondname");
        first.setToolTipText("your name");
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(field1);
        frame.add(first);
        frame.add(second);
        frame.add(field2);
       frame.setSize(1000,1000);
       frame.setVisible(true);
    }
    public static void main(String args[])
    {
        JTextFieldPlusLabel1 example = new JTextFieldPlusLabel1();
        example.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);       
    }
    
}