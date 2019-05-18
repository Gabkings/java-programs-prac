
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */
public class TextPanel extends JPanel {
    private JTextArea text;
    
    public TextPanel(){
        text = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(text), BorderLayout.CENTER);
    }
    
    public void appendText(String txt){
        text.append(txt);
    }
    
}
