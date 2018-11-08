import java.awt.*;
import javax.swing.*;
public class JComboBoxTest extends JFrame{
    JComboBox box;
    String countries[]= {"kenya", "USA","UGANDA","ZAMBIA","CHINA"};
    JComboBoxTest()
    {
        super();
        box = new JComboBox(countries);
        box.setMaximumRowCount(2);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add (box);
        frame.setSize(1000,1000);
        frame.setVisible(true);   
      
    }
    public static void main(String args[])
    {
JComboBoxTest example10= new JComboBoxTest();
    }
    
}
