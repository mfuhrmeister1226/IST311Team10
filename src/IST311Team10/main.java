package IST311Team10;

import javax.swing.*;
/**
 *
 * @author maf5723
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Credential Manager");
        f.setSize(300,400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        LoginUI logUI = new LoginUI(); // adds login UI
        
        f.add(logUI);
        f.revalidate();
    }
    
}
