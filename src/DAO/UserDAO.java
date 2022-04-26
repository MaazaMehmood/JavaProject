/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
/**
 *
 * @author SMPC
 */
public class UserDAO {
    public static void save(User user){
        String query = "";
        DBoperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin approval!");
    }
    
    public static User login(String email, String password){
        User user = null;
        try{
            ResultSet rs = DBoperations.getData("");
            while(rs.next()){
                user = new User();
                user.setStatus(rs.getString("status"));
            }
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error");
        }
        return user;
    }
    
}
