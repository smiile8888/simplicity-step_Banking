/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Deposit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Deposit_View;

/**
 *
 * @author User
 */
public class Deposit_Controller {
    private Deposit_View myView;
    
    public Deposit_Controller(){
        myView = new Deposit_View();
        myView.setVisible(true);
        myView.setOKButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = myView.getName();
                String lastname = myView.getLastname();
                String id = myView.getID();
                String amount = myView.getAmount();
                Deposit deposit = new Deposit();
                deposit.updateDeposit(name, lastname, id, amount);
            }
        });
        
    }
    
    public static void main(String[] args){
        new Deposit_Controller();
    }
}
