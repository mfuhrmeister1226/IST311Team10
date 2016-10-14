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
        f.setSize(300,500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        JPanel p = new JPanel();
        
        f.add(p);
        
        JLabel l1 = new JLabel("Username:");
        p.add(l1);

        JTextField userName = new JTextField(15);
        p.add(userName);

        JLabel l2 = new JLabel("Password:");
        p.add(l2);

        JTextField password = new JTextField(15);
        p.add(password);

        JButton b = new JButton("Login");
        p.add(b);
        
        p.repaint();
        
    }
    
}
