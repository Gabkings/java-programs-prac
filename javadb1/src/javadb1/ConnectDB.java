
package javadb1;

import java.sql.*;

public class ConnectDB {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1","root","123456");  
            st = con.createStatement();
        }catch(Exception e){
            System.out.println("Error "+e);
        }
    }
    
    public void getData(){
        try{
            String query = "select * from person";
            rs = st.executeQuery(query);
            while(rs.next()){
                String name = rs.getString("name");
                String age = rs.getString("age");
                String address = rs.getString("address");
                System.out.println("Name: "+name+" age: "+age+" address: "+address);
            }
        }catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}
