import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class NetSalary extends JFrame{
    JTextField field1,field2,field3;
    JButton button;
    public NetSalary(){
         super("showing event handling");
        field1 = new JTextField(20);
        field2 =new JTextField(20);
        field3= new JTextField(20);
        button =new JButton("NETSALARY");
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
        NetSalary salary = new NetSalary();
      
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
         addValue =firstValue- ((firstValue-secondValue)*30/100);
         
         field3.setText(""+addValue);
      }
            
        }
       
    }
        
    }



