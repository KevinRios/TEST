package ar.com.KevinRios.java.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public final class Connector {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String vendor = "mysql";
    private static String server = "localhost";
    private static String port   = "3306";
    private static String db     = "colegio";
    private static String params = "";
    private static String user   = "root";
    private static String pass   = "";
    
    private static String url   = "jdbc:"+vendor+"://"+server+":"+port+"/"+db+params;
    private static Connection conn  = null;

    public Connector() {
    }

    public synchronized static Connection getConnection(){
        if(conn==null){
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
        return conn;
    }
    
    
}
