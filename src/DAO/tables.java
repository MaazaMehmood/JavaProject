/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author SMPC
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable = "";
            
            DBoperations.setDataOrDelete(userTable, "User Table created Successfully");
                    
                   
        }
        catch(Exception e){}
    }
    
}
