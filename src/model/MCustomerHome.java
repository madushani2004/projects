package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MCustomerHome {

    public ResultSet searchArtwork(String searchCriteria) throws SQLException {
        Connection connection = MyDBConnection.createDBConnection();
        Statement statement = connection.createStatement();

        String query;
        if (searchCriteria.isEmpty()) {
            query = "SELECT imageId, title, artistName, type, price, imageFile FROM artWork";
        } else {
            query = "SELECT imageId, title, artistName, type, price,imageFile FROM artWork WHERE title LIKE '%" + searchCriteria + "%'";
        }

        return statement.executeQuery(query);
    }

}
