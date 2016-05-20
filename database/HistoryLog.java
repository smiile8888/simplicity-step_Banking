/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author SMiiLE
 */
public class HistoryLog extends ConnectDB{
    
    private String firstname;
    private String lastname;
    private String accNo;
    private String amount;
    
    public HistoryLog(){
        super();
    }
    
    public void setData(String f, String l, String acc, String am){
        firstname = f;
        lastname = l;
        accNo = acc;
        amount = am;
    }
    
    public void insert(String operation){
        String sql = "INSERT INTO " + operation
                    + "(Firstname, Lastname, AccountID, Amount) "
                    + "VALUES('" + firstname + "','" + lastname + "','" 
                    + accNo + "','" + amount + "');";
        boolean insertSuccess = db.executeQuery(sql);
        System.out.println(insertSuccess);
    }
}
