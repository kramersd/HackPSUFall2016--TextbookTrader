/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextBookTrade;

/**
 *
 * @author Shane Kramer <sbk5234@psu.edu>
 */

//import java.sql.Re
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListingsController {
    
    private static ArrayList<String> lastNameList = new ArrayList<>();
    private static ArrayList<String> firstNameList = new ArrayList<>();
    private static ArrayList<String> ISBNList = new ArrayList<>();
    private static ArrayList<String> titleList = new ArrayList<>();
    private static ArrayList<String> editionList = new ArrayList<>();
    private static ArrayList<String> ownerList = new ArrayList<>();
    private static ArrayList<Double> priceList = new ArrayList<>();
    
    private static Statement statement;
    private static String R_QUERY = "SEARCH * FROM JAVA.LISTINGS";
    private static Object[] colData= {"LastName", "FirsName", "ISBN", "TITLE", "EDITION", "OWNER", "PRICE"};
    //[1][2] AFirstName
    //[1][3] ISBN
    // etc
    
    public void setTable(String query){
        
    }
    /*
    public static Object[][] getRowData() {
        Connection con = DataBaseConnect.getConnection();
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(R_QUERY);
            while(rs.next()) {
                lastNameList.add(rs.getString("ALASTNAME"));
                firstNameList.add(rs.getString("AFIRSTNAME"));
                ISBNList.add(rs.getString("ISBN"));
                titleList.add(rs.getString("TITLE"));
                editionList.add(rs.getString("EDITION"));
                ownerList.add(rs.getString("OWNER"));
                priceList.add(rs.getDouble("PRICE"));
            }
            //return 
        } catch (SQLException ex) {
            Logger.getLogger(ListingsController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        Object[][] rowData = new Object[lastNameList.size()][7];
        for(int i = 0; i < rowData.length; i++) {
            rowData[i][0] = lastNameList.get(i);
            rowData[i][1] = firstNameList.get(i);
            rowData[i][2] = ISBNList.get(i);
            rowData[i][3] = titleList.get(i);
            rowData[i][4] = editionList.get(i);
            rowData[i][5] = ownerList.get(i);
            rowData[i][6] = priceList.get(i);
        }
        
        return rowData;
        
    }
    
    public static Object[] getColumnData() {
        return colData;
    }
  */
    
    
}
