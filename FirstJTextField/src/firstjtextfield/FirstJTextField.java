import java.awt.*;
import javax.swing.*;
public class FirstJTextField extends JFrame
{
    JTextField field1, field2;
    FirstJTextField()
    {
        super("we love JTextField");
        field1 = new JTextField(20);
        field2 = new JTextField(20);
        field2.setText("enter text here");
        field2.setEditable(true);
        JFrame con = new JFrame();
        con.setLayout(new FlowLayout());
        con.add(field1);
        con.add(field2);
        con.setSize(1000,1000);
        con.setVisible(true);
    }
    public static void main(String args[])
    {
        FirstJTextField Bbit3 = new FirstJTextField();
        Bbit3.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);       
    }
    
}