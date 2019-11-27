/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capsys.Inventory.pojo;

import UtilityPackage.DBAccess;
import UtilityPackage.Validation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pragya
 */
public class ProductDetails {
    private long productId;
    private String productName;

    /**
     * @return the productId
     */
    public long getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(long productId) {
        this.productId = productId;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
      public List<ProductDetails> selectQuantity() 
      {    
        List<ProductDetails> productDetailsList= new ArrayList<ProductDetails>();
        ProductDetails productDetailsObj = new ProductDetails();
        Connection con=new DBAccess().getCon();
        Validation v=new Validation();
          
        try
        {
            if(new Validation().existID(Long.parseLong(p_id1.getText()))==true)
            {
            PreparedStatement preparedStat=con.prepareCall("select * from quantity where p_id=?");
            preparedStat.setLong(1,Long.parseLong(p_id1.getText()));
            ResultSet rs=preparedStat.executeQuery();
            
            while(rs.next())
            {
                productDetailsObj.setProductId(rs.getInt(0));
                productDetailsObj.setProductName(rs.getString(1));
                productDetailsList.add(productDetailsObj);
            }
            }
        }
            
        
        catch(Exception e)
        {
            System.out.println(e);
        }    
  
        return productDetailsList;
    } 
}
