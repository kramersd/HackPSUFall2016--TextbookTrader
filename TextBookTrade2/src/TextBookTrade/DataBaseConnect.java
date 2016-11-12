package TextBookTrade;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Kramer <sbk5234@psu.edu>
 */
public class DataBaseConnect {
    
    //database URL, username, password
    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/TextBookTrader";
    private static final String USERNAME = "java";
    private static final String PASSWORD = "java";
    
    public static Connection con;
    
    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void closeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    

