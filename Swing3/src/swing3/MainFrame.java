package swing3;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

    private TextPanel text1;
    private JButton btn;
    private ToolBar toolbar;
    //create a constructor
    public MainFrame() {
        super("Application 1");
        setLayout(new BorderLayout());
        text1 = new TextPanel();
        toolbar = new ToolBar();
        btn = new JButton("Click Me");
        toolbar.setTextPanel(text1);
        add(toolbar, BorderLayout.NORTH);
        add(text1, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
