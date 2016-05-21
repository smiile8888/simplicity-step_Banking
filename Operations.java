/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMiiLE
 */

import database.AccountCustomer;
import database.HistoryLog;

public class Operations extends javax.swing.JFrame{
    
    protected HistoryLog hisLog;
    protected AccountCustomer acc;
    
    public String firstname;
    public String lastname;
    public String accountID;
    public String amount;
    
    public final String DP = "Deposit";
    public final String TF = "Transfer";
    public final String WD = "Withdraw";
        
    public Operations() {
        hisLog = new HistoryLog();
        acc = new AccountCustomer();
    }
}
