
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaApplication79 extends JApplet implements ActionListener {

    JLabel aLabel, bLabel;
    JTextField aInput, bInput;

    @Override
    public void init() {
// create components
        aLabel = new JLabel("Enter a: ");
        aInput = new JTextField(5);
        bLabel = new JLabel("Enter b: ");
        bInput = new JTextField(5);
        bInput.addActionListener(this);
// add components to applet
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(aLabel);
        container.add(aInput);
        container.add(bLabel);
        container.add(bInput);
    }
// get the result

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(aInput.getText());
        int b = Integer.parseInt(bInput.getText());
        showStatus("Result: " + mystery(a, b));
    }

    public int mystery(int a, int b) {
// b is positive
        if (b < 0) {
            if (b == -1) {
                return 0 - a;
            } else {
                return 0 - a + mystery(a, b + 1);
            }
        } // b is negative
        else if (b > 0) {
            if (b == 1) {
                return a;
            } else {
                return a + mystery(a, b - 1);
            }
        } // b is zero
        else {
            return 0;
        }
    }
}
