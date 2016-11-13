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
    
    private static String R_QUERY = "SELECT * FROM LISTINGS";
    public static ResultSetTableModel rstm; 
    
    public static void setQuery(String s){
        R_QUERY = s;
        try {
          setTable().setQuery(R_QUERY);
          
        } catch (SQLException ex) {
            Logger.getLogger(ListingsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(ListingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSetTableModel setTable(){
        if(rstm == null)
            try {
                rstm = new ResultSetTableModel("jdbc:derby://localhost:1527/TextBookTrader", "java", "java", R_QUERY);
        } catch (SQLException ex) {
            Logger.getLogger(ListingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rstm;
    }    
    
}
