package com.capsys.InventoryStore.Sql;
import java.sql.*;

public class DatabaseAccess 
{

    public Connection connection;
   
    public Connection getConnection()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pragya_schema", "pragya.saxena", "capsys@123"); 
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return connection;
    }
    public void closeConnection() throws SQLException 
    {
        connection.close();
    }        
    
}

   
