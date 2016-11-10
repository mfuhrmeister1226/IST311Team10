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
public final class PasswordGenUI extends JFrame {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    
    public PasswordGenUI() {
        this.createPanel();
        this.setTitle("Password Generator");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void createPanel() {
        String password = "";
        
        // String[] numLength = {"4", "6", "8"};
        
        JPanel panel = new JPanel();
        this.add(panel);
        JButton genPass = new JButton("Generate Password");
        panel.add(genPass);
        JLabel generatedPassword = new JLabel(password);
        panel.add(generatedPassword);               
        // JComboBox passLength = new JComboBox(numLength);
        // panel.add(passLength);
        JButton storePass = new JButton("Store Password");
        panel.add(storePass);
        
        class ClickListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == genPass) {
                    RandomGenerator pass = new RandomGenerator();
                    String password = pass.generatePassword();
                    generatedPassword.setText(password);
                }
                if(e.getSource() == storePass){
                    StoreUI storage = new StoreUI();
                    storage.createPanel();
                }
            }
        
        }
        
        ActionListener listener = new ClickListener();
        genPass.addActionListener(listener);
        storePass.addActionListener(listener);
    }
}
