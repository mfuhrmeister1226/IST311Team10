/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST311Team10;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author maf5723
 */

public class LoginUI extends JPanel implements ActionListener{
    
    private UserDatabase userDB;
    private JLabel user;
    private JLabel pass;
    private JTextField userEntry;
    private JTextField passEntry;
    private JButton login;
    
    private String username;
    private String password;
    private User logUser;
    
   public LoginUI(UserDatabase uDB){
       
       super();
       
       userDB = uDB;
       user = new JLabel("Username:");
       pass = new JLabel("Password:");
       userEntry = new JTextField(15);
       passEntry = new JTextField(15);
       login = new JButton("Login");
       
       add(user);
       add(userEntry);
       add(pass);
       add(passEntry);
       add(login);
       
       login.addActionListener(this);
       this.revalidate(); //repaints so the elements show up
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource()==login){ //checks to see when login is clicked
            
            username = userEntry.getText(); // gets username from text box
            password = passEntry.getText(); // gets password from text box
            
            logUser = new User(username, password);
            //This is where we will check to see if login matches user database
            
            if(userDB.authenticate(logUser)){
                login.setText("Success");
                
                HomePageUI home = new HomePageUI();
                System.out.print(home);
                
            }
            
            else{
                login.setText("Fail");
            }
            
        }
        
    }
    
    
    
}
