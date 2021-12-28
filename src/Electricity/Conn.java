package Electricity;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
        	String url="jdbc:mysql://localhost:3306/e-billing-db";
    		String user="root";
    		String pwd="";
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection(url,user,pwd);    
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  