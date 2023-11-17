
package model;

import java.sql.*;
import javax.swing.*;
public class MArtistHome {
    public void addArt(String fullname ,String mail ,String passwd ,String selectedValue) throws ClassNotFoundException{
    try {
            //Statement st =MyDBConnection.createDBConnection().createStatement();
            CrudUtil.execute("insert into user(fullName ,email ,password ,type) values('" + fullname + "', '" + mail + "', '" + passwd + "', '" + selectedValue + "');");
            
            JOptionPane.showMessageDialog(null, "Successfully Registerd!","Registered",JOptionPane.INFORMATION_MESSAGE);
           
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         catch (Exception ex)
         {
           System.err.println(ex.getMessage());
         }
    }
}
