
package model;

import java.io.File;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;
public class Mupload {

    public void uploadArt(String title, String artName, String description, String selectedValue, double price, String path, InputStream is) throws SQLException, ClassNotFoundException {
             
    
    try {
            String query = "insert into artWork(title ,artistName ,type ,price ,description,status ,imagePath ,imageFile ) values(?,?,?,?,?,?,?,?);";
            
            PreparedStatement preparedStatement = MyDBConnection.createDBConnection().prepareStatement(query);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, artName);
            preparedStatement.setString(3, selectedValue);
            preparedStatement.setDouble(4, price);
            preparedStatement.setString(5, description);
            preparedStatement.setString(6, "Unsold");
            preparedStatement.setString(7, path);
            preparedStatement.setBlob(8, is);
            
            int inserted = preparedStatement.executeUpdate();
            
            if (inserted > 0)
            {
               JOptionPane.showMessageDialog(null, "Data saved successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
            }
            
    }
        catch (Exception ex)
         {
           System.err.println(ex.getMessage());
         }
    }

  

}
