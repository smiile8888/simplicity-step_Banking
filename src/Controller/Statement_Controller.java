/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TranferInfo;
import edu.sit.cs.db.CSDbDelegate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import view.Statement_View;

/**
 *
 * @author User
 */
public class Statement_Controller {
    Statement_View myView;
    
    public Statement_Controller(){
       myView = new Statement_View();
       myView.setCheckButton(new CheckListen());
    }
    
    public JTable resultQueryToJTable(ArrayList<HashMap> data, String[] colName){
        String[][] out = new String[data.size()][colName.length];
        
        for(int i = 0 ; i < data.size();i++){
            for(int j = 0 ; j < colName.length;j++){
            out[i][j] = (String)data.get(i).get(colName[j]);
            }
        }
        
        return new JTable(out, colName);
    }
    
    public void showText(){
        System.out.println(myView.getText());
    }
    
    
    public class CheckListen implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO add your handling code here:
        String id = myView.getText();
        String[] name = {"timest","action","Remaining"};
        ArrayList<HashMap>data = TranferInfo.getTranferInfo(id);
        /*
        JTable tt = resultQueryToJTable(data, name);
        JScrollPane sp = new JScrollPane(tt);
        JFrame f = new JFrame("Test");
        f.add(sp);
        f.setPreferredSize(sp.getPreferredSize());
        f.pack();
        f.setVisible(true);
        */
        JTable tt = resultQueryToJTable(data, name);
        JScrollPane jScrollPane1 = new JScrollPane(tt);
        JPanel jPanel1 = myView.getJPanel();
        jPanel1.add(jScrollPane1);
        jScrollPane1.setSize(myView.getWidth(),700);
        jScrollPane1.setLocation(0, 100);
        jScrollPane1.revalidate();
        myView.setVisible(true);
        
        //setVisible(true);
        
        
        System.out.println(data.get(0).get("action"));
        }
        
    }
    
    public static void main(String []args){
        new Statement_Controller();
    }
    
}
