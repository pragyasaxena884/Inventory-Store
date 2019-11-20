
package UtilityPackage;
import java.sql.*;

public class DBAccess 
{

    private Connection con;
    
    public Connection getCon()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        this.con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/pragya_schema", "pragya.saxena", "capsys@123"); 
       
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return con;
    }
    
    
    
}

   
