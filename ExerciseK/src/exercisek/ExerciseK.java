import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ExerciseK extends JFrame{




JCheckBox box1;
    JTextField field1,field2;
    public ExerciseK ()
    {
        super("Event Handlig");
        box1 = new JCheckBox("");
        field1 = new JTextField("",20);
        field2= new JTextField("",20);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(box1);
  
        frame.add(field1);
        frame.add(field2);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        ColorChangeHandler handle = new ColorChangeHandler();
        box1.addItemListener(handle);
         

    }
  
    public static void main(String[] args) 
        // TODO code application logic here
    {
    ExerciseK  color = new ExerciseK ();
}
    private class ColorChangeHandler implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
                int valBold = Font.PLAIN;
               int valItalic = Font.PLAIN;
                if(e.getSource()== box1)
                if(e.getStateChange() == ItemEvent.SELECTED)
                valBold = Font.PLAIN;
                else
                valBold = Font.PLAIN;
                if(e.getSource()==box2)
                if(e.getStateChange()==ItemEvent.SELECTED)
                valItalic = Font.ITALIC;
                else
                valItalic = Font.PLAIN;

                
                field1.setFont(new Font("serif",valBold+valItalic,12));
                
                        
    }
}
}