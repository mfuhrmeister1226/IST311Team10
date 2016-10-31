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
        
        JPanel panel = new JPanel();
        this.add(panel);
        JButton button = new JButton("Generate Password");
        panel.add(button);
        JLabel label = new JLabel(password);
        panel.add(label);
        
        class ClickListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (e.getSource() == button){
                    RandomGenerator pass = new RandomGenerator();
                    String password = pass.generatePassword();
                    label.setText(password);
                }
            }
        
        }
        
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
    }
}
