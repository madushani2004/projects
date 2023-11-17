
package controller;


import java.io.InputStream;
import java.sql.*;
import model.Mupdate;
import model.MyDBConnection;
public class Cupdate {
    public void updateArt(int imgId,String title,String artName,String description ,String selectedValue ,double price ,String path ,InputStream is) throws SQLException, ClassNotFoundException{
        Mupdate mc = new Mupdate();
        mc.updateArt(imgId ,title,artName,description ,selectedValue ,price , path ,is); 
          
    }
    public ResultSet searchArtwork(String searchCriteria, String artName) throws SQLException, ClassNotFoundException {
        Connection connection = MyDBConnection.createDBConnection();
        Statement statement = connection.createStatement();
     
      String query = "SELECT imageId, title, artistName, type, price, description, status FROM artWork WHERE artistName LIKE '%"+artName+"%' AND type LIKE '%"+searchCriteria+"%'";
   // String query = " SELECT imageId,title ,artistName ,type ,price ,description ,status ,imagePath  FROM artWork where artistName like '%"+artName+"%' and title LIKE '%" + searchCriteria + "%'";
        
        return statement.executeQuery(query);
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
