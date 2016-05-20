/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author SMiiLE
 */
public class AccountCustomer extends ConnectDB{
    //private String accNo;
    
    public AccountCustomer(){
        super();
    }

    public String select(String accNo){
        String sql = "SELECT * FROM Account_customer WHERE AccountNumber = '" + accNo + "'";
        ArrayList<HashMap> ch = db.queryRows(sql);
        String msg = "";
        if(ch.isEmpty())
            msg += " Don't have this account ID ";
        else
            msg += " Have this account ID , this Account ID can be use ";
        
        return msg;
    }
    
    public void insert(String firstname, String surname, String title, String BD, String age, 
                       String address, String position, String company, String salary, String type){
        String sql = "INSERT INTO Account_customer "
                    + "(Firstname, Surname, Title, Birthdate, Age, Address, Position, Company, Salary, Type) "
                    + "VALUES('" + firstname + "','" + surname + "','" + title + "','" + BD + "','" + age + "','" 
                    + address + "','" + position + "','" + company + "','" + salary + "','" + type + "');";
        boolean insertSuccess = db.executeQuery(sql);
        
        System.out.println(insertSuccess);
    }
}
