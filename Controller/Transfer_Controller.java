/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Transfer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Transfer_View;
/**
 *
 * @author User
 */
public class Transfer_Controller {
    
    private Transfer_View myView;
    
    public Transfer_Controller(){
        myView = new Transfer_View();
        //myView.setVisible(true);
        myView.setOKButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = myView.getName();
                String lastname = myView.getLastname();
                String id = myView.getID();
                String amount = myView.getAmount();
                Transfer transfer = new Transfer();
                transfer.updateTransfer(name, lastname, id, amount);
            }
        });
        
    }
    
    public static void main(String[] args){
        new Transfer_Controller();
    }
}