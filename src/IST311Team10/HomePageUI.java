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
 * @author Harrison
 */
public final class HomePageUI extends JFrame {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private User user;
    
    public HomePageUI(User u) {
        this.createPanel();
        this.setTitle("Home");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        user=u;
    }
    
    public void createPanel() {
        String password = "";
        
        JPanel panel = new JPanel();
        this.add(panel);
        JButton viewCredentials = new JButton("View Credentials");
        panel.add(viewCredentials);
        JButton passGen = new JButton("Generate a Password");
        panel.add(passGen);
        
        class ClickListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (e.getSource() == passGen){
                    PasswordGenUI randPass = new PasswordGenUI(user);
                    System.out.println(randPass);
                    dispose();
                }
            }
        
        }
        
        ActionListener listener = new ClickListener();
        passGen.addActionListener(listener);
    }
}
