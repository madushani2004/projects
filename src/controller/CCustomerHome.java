
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.MCustomerHome;
import model.MyDBConnection;


public class CCustomerHome {

    private Connection connection;

    public CCustomerHome() {
        // Initialize database connection
        connection = MyDBConnection.createDBConnection();
    }
    public ResultSet searchArtwork(String searchCriteria) throws SQLException  {
        MCustomerHome mc = new MCustomerHome();
        return mc.searchArtwork(searchCriteria);
    }
    
    public ResultSet getAllArtwork() throws SQLException {
        ResultSet resultSet = null;

        try {
            String sql = "SELECT * FROM artWork";
            Statement statement = connection.createStatement();

            // Execute the query
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultSet;
    }
}
