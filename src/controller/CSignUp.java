
package controller;
import model.MSignUP;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSignUp {
    public boolean signUpCustomer(String fullname ,String mail ,String passwd ,String selectedValue){
        try {
            MSignUP mc = new MSignUP(); 
            return mc.signUpCustomer(fullname ,mail , passwd ,selectedValue);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;  
    }
}
