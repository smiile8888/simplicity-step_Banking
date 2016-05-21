package database;

import edu.sit.cs.db.CSDbDelegate;

public class ConnectDB {
    
    protected static CSDbDelegate db;
    
    public ConnectDB() {

    }
    
    public static void connect() {
        db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G1", "CSC105_G1", "CSC105_G1");
        System.out.println(db.connect());
    }
    
    public static void disconnect() {
        System.out.println(db.disconnect());
    }

}
