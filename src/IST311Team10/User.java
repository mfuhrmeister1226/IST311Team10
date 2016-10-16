/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST311Team10;

/**
 *
 * @author maf5723
 */
public class User {
    
    private String userName;
    private String pass;
    
    
    public User(String u, String p){
        userName=u;
        pass=p;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getPass(){
        return pass;
    }
    
    public void setUserName(String u){
        userName=u;
    }
    
    public void setPass(String p){
        pass=p;
    }
    
    public boolean equals(User u){
        if(u.getUserName().equals(userName)&&
           u.getPass().equals(pass)){
            
            return true;
            
        }
        
        return false;
    }
            
}
