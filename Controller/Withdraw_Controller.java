/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Withdraw;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Withdraw_View;
/**
 *
 * @author User
 */
public class Withdraw_Controller {
     private Withdraw_Controller myView;
    
    public Withdraw_Controller(){
        //myView = new Withdraw_View();
        myView.setVisible(true);
        myView.setOKButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = myView.getName();
                String lastname = myView.getLastname();
                String id = myView.getID();
                String amount = myView.getAmount();
                Withdraw deposit = new Withdraw();
                deposit.updateWithdraw(name, lastname, id, amount);
            }
        });
    
}

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setOKButtonAction(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getLastname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
