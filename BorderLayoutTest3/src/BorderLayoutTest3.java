import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class BorderLayoutTest3  extends JFrame
{
    JPanel panel1,panel2,panel3,panel4,panel5;
JButton button1,button2,button3,button4,button5;
    panel1 = new JPanel();
    panel2 = new JPanel();
    panel3 = new JPanel();
    panel4 = new JPanel();
    panel5 = new JPanel();
    
    button1 = new JButton("panel1");
    button2 = new JButton("panel2");
     button3= new JButton("panel3");
    button4 = new JButton("panel4");
    button5 = new JButton("panel5");
    panel1.add(button1);
    panel2.add(button2);
    panel3.add(button3);
    panel4.add(button4);
    panel5.add(button5);
    JFrame frame = new JFrame();
    frame.setLayout(new BorderLayout());
    frame.add(panel1,BorderLayout.NORTH);
    frame.add(panel2,BorderLayout.SOUTH);
    frame.add(panel3,BorderLayout.EAST);
    frame.add(panel4,BorderLayout.WEST);
    frame.add(panel5,BorderLayout.CENTER);
    frame.setSize(1000,500);
    frame.setVisible(true);
     



    
    public static void main(String args[])
    {
      BorderLayoutTest3  example = new BorderLayoutTest3 ();
    }
    
}
