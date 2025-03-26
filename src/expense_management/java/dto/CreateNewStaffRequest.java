/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expense_management.java.dto;

/**
 *
 * @author user
 */
public class CreateNewStaffRequest {
    
    String staffName;
    String position;
    String username;
    String password;
    
    public CreateNewStaffRequest(){
        
    }
    
    public CreateNewStaffRequest(
            String staffName, 
            String position, 
            String username, 
            String password
    ){
        this.staffName = staffName;
        this.position = position;
        this.username = username;
        this.password = password;
    }
    
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }
    
    public String getStaffName(){
        return staffName;
    }
    
    public void setPositon(String position){
        this.position = position;
    }
    
    public String getPosition(){
        return position;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
}
