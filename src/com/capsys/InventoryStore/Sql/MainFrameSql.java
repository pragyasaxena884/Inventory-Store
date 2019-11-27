/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capsys.InventoryStore.Sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Pragya
 */
public class MainFrameSql {
    static final String insertProductDetailsSql="insert into product_details values(?,?,?,?)";
    static String insertQuantitySql="insert into quantity values(?,?,?)";
    
    public int insertProductDetails(Connection dbCon,String productId) throws SQLException{
        PreparedStatement preparedStat=dbCon.prepareCall(insertProductDetailsSql);
        return 0;
            
    }
    public int insertQuantityDetails(Connection dbCon,String productId) throws SQLException{
        PreparedStatement preparedStat=dbCon.prepareCall(insertQuantitySql);
            return 0;
    }
    
}
