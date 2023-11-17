
package model;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Mremove {
    public void deleteArt(int imgId, String artName) throws SQLException, ClassNotFoundException {

        try {
            String query = "DELETE FROM artwork WHERE imageId = ? AND artistName = ?;";
            PreparedStatement preparedStatement = MyDBConnection.createDBConnection().prepareStatement(query);
            
            // Set the parameters for the prepared statement
            preparedStatement.setInt(1, imgId);
            preparedStatement.setString(2, artName);

            int deletedRows = preparedStatement.executeUpdate();

            if (deletedRows > 0) {
                JOptionPane.showMessageDialog(null, "Data deleted successfully", "Deleted", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Please check the image ID again", "Deletion Failed", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
