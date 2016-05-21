/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author SMiiLE
 */
public class AccountCustomer implements Searching{
    //private String accNo;
    
    protected static CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G1", "CSC105_G1", "CSC105_G1");
    
    public AccountCustomer(){
        
    }

    public String select(String accNo){
        db.connect();
        String sql = "SELECT * FROM Account_customer WHERE AccountNumber = '" + accNo + "'";
        ArrayList<HashMap> ch = db.queryRows(sql);
        String msg = "";
        if(ch.isEmpty())
            msg += " Don't have this account ID ";
        else
            msg += " Have this account ID , this Account ID can be use ";
        
        db.disconnect();
        return msg;
    }
    
    public void insert(String firstname, String surname, String title, String BD, String age, 
                       String address, String position, String company, String salary, String type){
        db.connect();
        String sql = "INSERT INTO Account_customer "
                    + "(Firstname, Surname, Title, Birthdate, Age, Address, Position, Company, Salary, Type) "
                    + "VALUES('" + firstname + "','" + surname + "','" + title + "','" + BD + "','" + age + "','" 
                    + address + "','" + position + "','" + company + "','" + salary + "','" + type + "');";
        boolean insertSuccess = db.executeQuery(sql);
        System.out.println(insertSuccess);
        db.disconnect();
    }
    
    @Override
    public ArrayList<HashMap> searchByID(String accNo){
        db.connect();
        String sql = "SELECT `timest`,`action`,`Remaining` FROM `Tranfer` WHERE AccountID = " + accNo
                     + " union select  `timest`,`action`,`Remaining` from Withdraw WHERE AccountID = " + accNo
                     + " union SELECT  `timest`,`action`,`Remaining` FROM Deposit WHERE AccountID = " + accNo + " order by timest";
        ArrayList<HashMap> data = db.queryRows(sql);
        
        return data;
    }
    
    @Override
    public ArrayList<HashMap> searchByName(String f, String l){
        db.connect();
        String sql = "SELECT `timest`,`action`,`Remaining` FROM `Tranfer` WHERE Firstname = " + f + " AND Lastname = " + l
                     + " union select  `timest`,`action`,`Remaining` from Withdraw WHERE Firstname = " + f + " AND Lastname = " + l
                     + " union SELECT  `timest`,`action`,`Remaining` FROM Deposit WHERE Firstname = " + f + " AND Lastname = " + l + " order by timest";
        ArrayList<HashMap> data = db.queryRows(sql);
        
        return data;
    }
}
