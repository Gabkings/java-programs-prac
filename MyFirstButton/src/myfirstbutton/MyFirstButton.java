import java.awt.*;
import javax.swing.*;
public class MyFirstButton extends JFrame
{
    JButton button1,button2;
    MyFirstButton()
    {
        button1 = new JButton("CLICK ME");
        button2 = new JButton("CLICK AGAIN");
        JFrame buttonFrame = new JFrame();
        buttonFrame.setLayout(new FlowLayout());
        buttonFrame.add(button1);
        buttonFrame.add(button2);
        buttonFrame.setSize(1000,1000);
        buttonFrame.setVisible(true);
    }
    public static void main(String[] args) 
    {
        MyFirstButton example = new MyFirstButton();
        example.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        
    }
    
}
