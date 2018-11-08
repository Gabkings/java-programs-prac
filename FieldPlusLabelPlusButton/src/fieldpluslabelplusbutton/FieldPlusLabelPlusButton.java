import java.awt.*;
import javax.swing.*;
public class FieldPlusLabelPlusButton extends JFrame
{
    JTextField field1, field2;
    JLabel first, second;
    JButton button;
    FieldPlusLabelPlusButton()
    {
        field1 = new JTextField(20);
        field2 = new JTextField(20);
        first=new JLabel("Enter first name");
        second=new JLabel("Enter secondname");
        first.setToolTipText("your name");
        button = new JButton("SUBMIT");
        JFrame frame = new JFrame();
        JFrame buttonFrame = new JFrame();
        frame.setLayout(new FlowLayout());
        
        frame.add(first);
        frame.add(field1);
        frame.add(second);
        frame.add(field2);
        frame.add(button);
       frame.setSize(1000,1000);
       frame.setVisible(true);
       
       buttonFrame.setVisible(true);
      
    }
    public static void main(String[] args) 
    {
        FieldPlusLabelPlusButton example = new FieldPlusLabelPlusButton();
        example.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        
    }
    
}
