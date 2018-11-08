
import java.awt.*;
import javax.swing.*;
public class JRadioButtonTest extends JFrame
{
    JRadioButton button1,button2,button3;
    JRadioButtonTest ()
    {
        super("Demontrating JRadio");
        button1 = new JRadioButton("OOP1",false);
        button2 = new JRadioButton("OSI",true);
        button3= new JRadioButton("DATABASE",false);
       ButtonGroup  group= new ButtonGroup();
        
        group.add(button1);
        group.add(button2);
        group.add(button3);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
       frame.add(button1);
       frame.add(button2);
       frame.add(button3);
        frame.setVisible(true);
        frame.setSize(1000,1000);  
    }
    public static void main(String args[])
    {
        JRadioButtonTest example = new JRadioButtonTest();
        
    }
    
}
