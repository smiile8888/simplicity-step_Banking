/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author SMiiLE
 */
public interface Searching {
    public String[] searchByID(String accNo);
    public String[] searchByName(String f, String l);
}
