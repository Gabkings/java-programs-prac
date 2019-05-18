
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */
public class ConnectDB {
    
        private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//jdbc:mysql://localhost:3306/library_system","root","123456"
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system","root","123456");
            return con;
        }catch(Exception e){
            System.out.println("Error "+e);
            return null;
        }
    }
    
    
}
