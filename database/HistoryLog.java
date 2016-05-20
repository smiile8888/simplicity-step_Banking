/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import database.ConnectDB;
import static database.ConnectDB.db;
import edu.sit.cs.db.CSDbDelegate;

/**
 *
 * @author SMiiLE
 */
public class HistoryLog{
    
    protected static CSDbDelegate db;
    
    private String firstname;
    private String lastname;
    private String accNo;
    private String amount;
    
    public HistoryLog(){
    }
    
    public void setData(String f, String l, String acc, String am){
        firstname = f;
        lastname = l;
        accNo = acc;
        amount = am;
    }
    
    public void insert(String operation){
        db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G1", "CSC105_G1", "CSC105_G1");
        String sql = "INSERT INTO " + operation
                    + "(Firstname, Lastname, AccountID, Amount) "
                    + "VALUES('" + firstname + "','" + lastname + "','" 
                    + accNo + "','" + amount + "');";
        boolean insertSuccess = db.executeQuery(sql);
        System.out.println(insertSuccess);
        db.disconnect();
    }
}
