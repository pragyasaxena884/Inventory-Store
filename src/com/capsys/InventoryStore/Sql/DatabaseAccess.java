package com.capsys.InventoryStore.Sql;
import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class DatabaseAccess 
{

    private Connection connection;
    private Properties propertiesFile;
    
    public Connection getConnection()
    {
        try{
        FileReader reader=new FileReader("inventoryStore.properties");
        propertiesFile=new Properties();
        propertiesFile.load(reader);
        
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        this.connection = DriverManager.getConnection(propertiesFile.getProperty("databaseUrl"), propertiesFile.getProperty("databaseUsername"), propertiesFile.getProperty("databasePassword")); 
        
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        return connection;
    }
    public void closeConnection() throws SQLException 
    {
        connection.close();
    }        
    
}

   
