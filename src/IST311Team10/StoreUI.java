/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST311Team10;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author hilarygodin
 */
public class StoreUI extends JFrame{
    
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private File file;
    private FileWriter fw;
    private BufferedWriter bw;
    private JLabel labelName;
    private JTextField labelEntry;
    private User user;
    
    public StoreUI(User u) {
        this.createPanel();
        this.setTitle("Store");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        user=u;
    }
    
    public void createPanel() {
        String label = "";
        
        JPanel panel = new JPanel();
        this.add(panel);
        labelName = new JLabel("Password:");
        labelEntry = new JTextField(15);
        JButton store = new JButton("Store");
        panel.add(labelName);
        panel.add(labelEntry);
        panel.add(store);
        
        
        class ClickListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (e.getSource() == store){
                    
                try{
                    String fileName = "src/"+user.getUserName()+".txt";
                    file=new File(fileName);
                    
                    if(!file.exists())
                        
                            file.createNewFile();
                    
                    
                    fw = new FileWriter(file.getAbsoluteFile(),true);
                    bw = new BufferedWriter(fw);
                    
                    String s = labelName.getText();
                    bw.write(s);
                    bw.write("\n");
                    bw.close();
                    
                }
                catch(IOException a){
                    a.printStackTrace();
                }
                    
                }
            }
        
        }
        
        ActionListener listener = new ClickListener();
        store.addActionListener(listener);
    }

    

    
}