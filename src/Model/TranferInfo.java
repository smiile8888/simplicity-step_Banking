/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class TranferInfo {
    
    public static ArrayList getTranferInfo(String id){
        CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me", "3306", "CSC105_G1", "CSC105_G1", "CSC105_G1");
        System.out.println(db.connect());
        String sql = "SELECT `timest`,`action`,`Remaining` FROM `Tranfer` WHERE AccountID = "+id
                +" union select  `timest`,`action`,`Remaining` from Withdraw WHERE AccountID = "+id
                +" union SELECT  `timest`,`action`,`Remaining` FROM Deposit WHERE AccountID = "+id+" order by timest";
        ArrayList<HashMap> data = db.queryRows(sql);
        System.out.println(db.disconnect());
        return data;
    }
}
