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
public interface Searching {
    public ArrayList<HashMap> searchByID(String accNo);
    public ArrayList<HashMap> searchByName(String f, String l);
}
