/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import edu.sit.cs.db.CSDbDelegate;

/**
 *
 * @author User
 */
public class Deposit {
    public void updateDeposit(String name, String lastname, String id, String amount){
        CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G1", "CSC105_G1", "CSC105_G1");
        System.out.println(db.connect());
        System.out.println(db.connect()); //เช็คว่าต่อกับDBสำเร็จมั้ย

//insert 
String sql = "INSERT INTO Deposit "
                    + "(Firstname, Lastname, AccountID, Amount) "
                    + "VALUES('"+name+"','"+lastname+"',"
                    + "'"+id+"', '"+amount+"');";
        boolean insertSuccess = db.executeQuery(sql);
        System.out.println(insertSuccess);
    }
}
