
package model;
import java.awt.Component;
import java.sql.*;
import javax.swing.*;
import view.VArtistHome;
import view.CustomerHome;
import view.Login;
import view.Upload;
import java.util.Objects;
import view.Vupdate;
import view.remove;

public class MLogin {
   
    public boolean loginCustomer(String mail,String passwd){
    try {
            String type = null;
            String artistName = null; // New variable to store artist name
            String query = "SELECT email, password, type, fullName FROM user WHERE email = ? AND password = ?";

            PreparedStatement preparedStatement = MyDBConnection.createDBConnection().prepareStatement(query);
            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, passwd);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                
                
                type = resultSet.getString("type");
                artistName = resultSet.getString("fullName");

                if ("Artist".equals(type)) {
                    // Open the ArtistHome form
                    VArtistHome artistHome = new VArtistHome();
                    artistHome.setArtistName(artistName);
                    

                    
                    Upload uploade1 = new Upload();
                    uploade1.setArtistName(artistName);
                    
                    Vupdate update1 = new Vupdate();
                    update1.setArtistName(artistName);
                    
                    remove remove1 = new remove();
                    remove1.setArtistName(artistName);
                    
//                  
                    artistHome.setVisible(true);
                    artistHome.pack();
                    artistHome.setLocationRelativeTo(null);

                    return true;
                    
                } else if ("Customer".equals(type)) {
                    // Open the CustomerHome page
                    CustomerHome customerHome = new CustomerHome();
                    customerHome.setCustomerName(artistName);
                    customerHome.setVisible(true);
                    customerHome.pack();
                    customerHome.setLocationRelativeTo(null);

                 return true;
                } else {
                    // Unknown user type
                    JOptionPane.showMessageDialog(null, "Invalid user type", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Invalid credentials
                JOptionPane.showMessageDialog(null, "Invalid email or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                
            }
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    return false;
    }

  


}
