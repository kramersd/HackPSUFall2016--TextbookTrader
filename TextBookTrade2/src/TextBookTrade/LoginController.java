package TextBookTrade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Kramer <sbk5234@psu.edu>
 */

import TextBookTrade.DataBaseConnect;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
public class LoginController {
    
    
    private static Statement statement;
    
    private static String RetrievalQuery = "SELECT * FROM JAVA.CREDENTIALS";
    
    public static Boolean authenticateUser(String userName, String password) {
        
        Connection con = DataBaseConnect.getConnection();
        RetrievalQuery = RetrievalQuery + " WHERE USERNAME= '" + userName + "'";
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(RetrievalQuery);
            while(rs.next()) {
                String userNameBase = rs.getString("USERNAME");
                String passwordBase = rs.getString("PASSWORD");
                if(userName.equals(userNameBase) && passwordBase.equals(passwordBase)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
