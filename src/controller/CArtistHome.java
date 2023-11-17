
package controller;

import model.MArtistHome;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CArtistHome {
    public void addArt(String fullname ,String mail ,String passwd ,String selectedValue){
        try {
            MArtistHome mc = new MArtistHome(); 
            mc.addArt(fullname ,mail , passwd ,selectedValue);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
}
