/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capsys.InventoryStore.Utility;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Pragya
 */
public class LoggingUtil 
{  
    /**
     * Use to store the exception in separate file
     */
    public Logger getLogger()
    {
        Logger logger = Logger.getLogger(LoggingUtil.class.getName());
        logger.setLevel(Level.ALL);
        Handler handler=null;
        try 
        {          
            handler = new FileHandler("./ErrorLog/ApplicationError.log");
        } 
        catch(Exception e)
        {
            
        }
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);       
        return logger;
    }   
}
