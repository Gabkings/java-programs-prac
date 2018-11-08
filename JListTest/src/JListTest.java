import java.awt.*;
import javax.swing.*;
public class JListTest extends JFrame{
    JList list;
    String countries[]= {"kenya", "USA","UGANDA","ZAMBIA","CHINA","TANZANIA"};
    JListTest ()
    
    {
     super();
        list= new JList(countries);
        list.setVisibleRowCount(3);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add (list);
        frame.setSize(1000,1000);
        frame.setVisible(true);   
      
    }
    public static void main(String args[])
    {
JListTest  example10= new JListTest ();
    }
    
}
