package swing3;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



/**
 *
 * @author developer
 */
public class App {
    
    public static void main(String args []){
        SwingUtilities.invokeLater(new Runnable(){
           
            public void run() {
                new MainFrame();
                
            }
        });
    }
}
