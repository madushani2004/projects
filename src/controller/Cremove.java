
package controller;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Mremove;
import model.MyDBConnection;

public class Cremove {
    public ResultSet searchArtwork(String searchCriteria,String artName) throws SQLException, ClassNotFoundException {
        Connection connection = MyDBConnection.createDBConnection();
        Statement statement = connection.createStatement();

        String query = "SELECT imageId, title, artistName, type, price, description, status, imagePath FROM artWork WHERE artistName LIKE '%"+artName+"%' AND type LIKE '%"+searchCriteria+"%'";
        return statement.executeQuery(query);
    }

    public void removeArt(int imgId ,String artName) throws SQLException, ClassNotFoundException{
        Mremove mc = new Mremove();
        mc.deleteArt(imgId,artName);
    
    }
    
    public boolean imageIdExists(int imgId) throws SQLException, ClassNotFoundException {
        Connection connection = MyDBConnection.createDBConnection();
        String query = "SELECT COUNT(*) FROM artWork WHERE imageId = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, imgId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(1) > 0;
                }
            }
        }
        return false;
    }


}
