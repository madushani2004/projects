
package controller;

import java.io.File;
import java.io.InputStream;
import model.Mupload;
import java.sql.*;

public class Cupload {
    public void uploadArt(String title,String artName ,String description ,String selectedValue ,double price ,String path ,InputStream is) throws SQLException, ClassNotFoundException{
        Mupload mc = new Mupload();
        mc.uploadArt(title, artName ,description ,selectedValue ,price , path ,is); 
          
    }
}
