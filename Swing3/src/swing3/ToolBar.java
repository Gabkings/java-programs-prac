package swing3;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */
public class ToolBar extends JPanel implements ActionListener {
    private JButton helloBtn;
    private JButton goodByBtn;
    private TextPanel text;
    public ToolBar(){
        helloBtn = new JButton("Hello");
        goodByBtn = new JButton("Good Bye");
        helloBtn.addActionListener(this);
        goodByBtn.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloBtn);
        add(goodByBtn);
    }
    
    public void setTextPanel(TextPanel text){
        this.text = text;
    }
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();
        if(clicked == helloBtn){
            text.appendText("Hello\n");
        }else if(clicked == goodByBtn){
            text.appendText("Good Bye\n");
        }
    }
}
