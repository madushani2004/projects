package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MTransaction {

    public String getEmail(String cusName) {
        try {
            Connection connection = MyDBConnection.createDBConnection();
            Statement statement = connection.createStatement();
            String query = "select email from user where fullName = \'" + cusName + "\';";
            ResultSet result = statement.executeQuery(query);
            result.next();
            return result.getString("email");
        } catch (SQLException e) {
            e.printStackTrace();
            return "No valid email found!";
        }
    }

    public void saveTransaction(int imageID, double priceInDouble, String customerName) {
        try {
            CrudUtil.execute("insert into transaction(CustomerName ,price ,imgID ) values('" + customerName + "', '" + priceInDouble + "', '" + imageID + "');");
        } catch (SQLException ex) {
            Logger.getLogger(MTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }

        //JOptionPane.showMessageDialog(null, "Successfully Saved", "Transa", JOptionPane.INFORMATION_MESSAGE);
    }

}
