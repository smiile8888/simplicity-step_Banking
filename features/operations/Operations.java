package features.operations;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMiiLE
 */

import database.CustomerAccount;
import database.HistoryLog;

public class Operations extends javax.swing.JFrame{
    
    public HistoryLog hisLog;
    public CustomerAccount acc;
    
    public String firstname;
    public String lastname;
    public String accountID;
    public String amount;
    
    public final String DP = "Deposit";
    public final String TF = "Transfer";
    public final String WD = "Withdraw";
        
    public Operations() {
        acc = new CustomerAccount();
        hisLog = new HistoryLog();
    }
}
