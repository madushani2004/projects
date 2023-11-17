
package controller;
import model.MLogin;
import java.sql.*;

public class CLogin {
    public boolean loginCustomer(String mail, String passwd){
        MLogin mc = new MLogin();
        return mc.loginCustomer(mail, passwd); 
        
    }
}
