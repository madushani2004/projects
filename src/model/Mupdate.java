package model;

import java.io.File;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;

public class Mupdate {

    public void updateArt(int imgId, String title, String artName, String description, String selectedValue, double price, String path, InputStream is) throws SQLException, ClassNotFoundException {

        try {

            String query = "UPDATE artWork SET title =?,type=?,price=?,description=?,status=?,imagePath=?,imageFile=?  WHERE imageId = ? and  artistName = ?;";

            PreparedStatement preparedStatement = MyDBConnection.createDBConnection().prepareStatement(query);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, selectedValue);
            preparedStatement.setDouble(3, price);
            preparedStatement.setString(4, description);
            preparedStatement.setString(5, "Unsold");
            preparedStatement.setString(6, path);
            preparedStatement.setBlob(7, is);
            preparedStatement.setInt(8, imgId);
            preparedStatement.setString(9, artName);

            int inserted = preparedStatement.executeUpdate();

            if (inserted > 0) {
                JOptionPane.showMessageDialog(null, "Data updated successfully", "Updated", JOptionPane.INFORMATION_MESSAGE);
            } //            ResultSet resultSet = preparedStatement.executeQuery();
            //            
            //            if (resultSet.next()) {
            //                // If the resultSet contains a row, credentials are valid
            //                JOptionPane.showMessageDialog(null, "Successfully Logged in!", "Login", JOptionPane.INFORMATION_MESSAGE);
            // } 
            else {
                // Invalid credentials
                JOptionPane.showMessageDialog(null, "Please check the image Id again", "Update Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
