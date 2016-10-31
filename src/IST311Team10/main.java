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
        f.setSize(300, 150);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        UserDatabase userDB = new UserDatabase();
        User u = new User("user", "pass");
        userDB.add(u);
        
        LoginUI logUI = new LoginUI(userDB); // adds login UI
        
        f.add(logUI);
        f.revalidate();
        
        
    }
    
}
