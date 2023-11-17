
package model;
import java.sql.*;
import javax.swing.*;
import view.VArtistHome;
import view.CustomerHome;
import view.VSignUp;

public class MSignUP {

    public boolean signUpCustomer(String fullname, String mail, String passwd, String selectedValue) throws ClassNotFoundException {
        try {
            // Statement st =MyDBConnection.createDBConnection().createStatement();
            CrudUtil.execute("insert into user(fullName ,email ,password ,type) values('" + fullname + "', '" + mail + "', '" + passwd + "', '" + selectedValue + "');");

            JOptionPane.showMessageDialog(null, "Successfully Registered!", "Registered", JOptionPane.INFORMATION_MESSAGE);

            
            // Open the appropriate form based on the user type
            if ("Artist".equals(selectedValue)) {
                // Open the ArtistHome form
                VArtistHome artistHome = new VArtistHome();
                artistHome.setArtistName(fullname);
                artistHome.setVisible(true);
                return true;
                
            } else if ("Customer".equals(selectedValue)) {
                // Open the CustomerHome form
                CustomerHome customerHome = new CustomerHome();
                customerHome.setCustomerName(fullname);
                customerHome.setVisible(true);
                return true;
            } else {
                // Unknown user type
                JOptionPane.showMessageDialog(null, "Invalid user type", "Signup Failed", JOptionPane.ERROR_MESSAGE);
            }
            VSignUp signUpForm = new VSignUp();
            signUpForm.dispose();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }
}
                 