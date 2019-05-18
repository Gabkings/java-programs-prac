import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Addition extends JFrame{
    JTextField field1,field2,field3;
    JButton button;
    public Addition()
    {
        super("showing event handling");
        field1 = new JTextField(20);
        field2 =new JTextField(20);
        field3= new JTextField(20);
        button =new JButton("ADD");
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(field1);
        frame.add(field2);
        frame.add(field3);
        frame.add(button);
        frame.setVisible(true);
        frame.setSize(1000,1000);
       AdditionHandler handle = new AdditionHandler();
        button.addActionListener(handle);
    }
    
    public static void main(String[] args) {
        Addition add = new Addition();
      
        // TODO code application logic here
    }
    private class AdditionHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            float firstValue=0;
            float secondValue=0;
             float addValue=0;
      if(e.getSource()==button)
      {
          firstValue=Float.parseFloat(field1.getText());
         secondValue= Float.parseFloat(field2.getText());
         addValue = firstValue+secondValue;
         field3.setText(""+addValue);
      }
            
        }
                
    }
    
}
