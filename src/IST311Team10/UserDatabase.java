/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST311Team10;

import java.util.ArrayList;

/**
 *
 * @author maf5723
 */
public class UserDatabase {
    
    private ArrayList<User> userDB;
    
    public UserDatabase(){
        
        userDB = new ArrayList<User>();
        
    }
    
    public boolean authenticate(User u){
        
        User temp;
        
        for(int x = 0; x<userDB.size(); x++){
            
            temp = userDB.get(x);
            
            if(u.equals(temp))
                return true;
        }
        
        return false;
    }
    
    public void add(User u){
        userDB.add(u);
    }
}
