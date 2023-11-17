
package model;
import java.sql.*;

public class MyDBConnection {
     
    private static Connection con;
    
    public static Connection createDBConnection() {
        String dbloc ="jdbc:mysql://localhost:3306/ArtGallery";
        String username = "root";
        try{
            con=DriverManager.getConnection(dbloc,username,"");
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return con;
    }
}
