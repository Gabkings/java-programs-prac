import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class FirstJlabelExtendsJFrame extends JFrame {
    {
       Jlabel label1,label2;
       FirstJlabelExtendsJFrame()
         {
             super("BBIT3 FIRST label");
             label1= new Jlabel("My label");
              label2= new Jlabel("Second label");
              Container con = getContentPane();
                    con.setLayout(new FlowLayout());
                    con.add(label1);
                    con.add(label2);
                    con.setSize(100,100);
                    con.setVisible(true);
                        }
                        public static void main(String args[]);
                        {
                         FirstJlabel bbit3= new FirstJlabelExtendsJFrame(); 
                         bbit3.setDefaultCloseOperation
                                 (JFrame.EXIT_ON_CLOSE)
                        }
    }
    
