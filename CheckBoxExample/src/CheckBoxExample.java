import java.awt.*;
import javax.swing.*;

public class CheckBoxExample extends JFrame
{
    JCheckBox box1,box2,box3;
    public CheckBoxExample()
    {
       super("demontratung check box");
    box1 = new JCheckBox("male");
    box2 = new JCheckBox("female");
    box3 =new JCheckBox("unknown");
    JFrame frame = new JFrame();
    frame.setLayout(new FlowLayout());
    frame.add(box1);
    frame.add(box2);
    frame.add(box3);
    frame.setSize(1000,1000);
    frame.setVisible(true);
    
    }
public static void main(String args[])
    
{
CheckBoxExample example7 = new CheckBoxExample();

}
}