/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capsys.InventoryStore.Sql;
import com.capsys.Inventory.pojo.AddNewProductDetails;
import com.capsys.Inventory.pojo.DeleteProductDetails;
import com.capsys.Inventory.pojo.ManageProductQuantity;
import com.capsys.Inventory.pojo.ModifyProductDetails;
import com.capsys.Inventory.pojo.ProductReporting;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pragya
 */
public class MainFrameSql 
{
    private AddNewProductDetails addProductDetails;
    private DeleteProductDetails deleteProductDetails;
    private ModifyProductDetails modifyProductDetails;
    private ManageProductQuantity manageProductQuantity;
    private DatabaseAccess databaseAccess;
    private Connection connection;
    private ProductReporting productReporting;
    private int numberOfRowsAffected;
    private ResultSet resultSetReport;
    private int numberOfRowsQuantityAffected;
    private int sum=0;
    private boolean flag=false;
    static final String INSERT_PRODUCT_DETAILS_SQL="insert into product_details values(?,?,?,?)";
    static final String INSERT_QUANTITY_SQL="insert into quantity values(?,?,?)";
    static final String SELECT_PRODUCT_ID_SQL="select product_id from product_details";
    static final String DELETE_PRODUCT_DETAILS_SQL="delete from product_details where product_id =?";
    static final String MODIFY_PRODUCT_DETAILS_SQL="update product_details set product_name=?,cost=? where product_id=?";
    static final String SELECT_QUANTITY_SQL="select quantity_remove from quantity";
    static final String SELECT_OVERALL_REPORT_SQL="select * from quantity where p_id=?";
    static final String SELECT_DATE_BASED_REPORT_SQL="select * from quantity where p_id=? AND purchse_date BETWEEN ? and ?";
   
    
    public int insertAddNewProductDetails() 
    {
        try
        {
        connection=databaseAccess.getConnection();
        PreparedStatement insertProductDetailsStatement=connection.prepareStatement(INSERT_PRODUCT_DETAILS_SQL);
        PreparedStatement insertProductQuantityDetailsStatement=connection.prepareStatement(INSERT_QUANTITY_SQL);
        insertProductDetailsStatement.setLong(1,addProductDetails.getProductIdAddProduct());
        insertProductDetailsStatement.setString(2,addProductDetails.getProductNameAddProduct());
        insertProductDetailsStatement.setFloat(3,addProductDetails.getCostPerUnitAddProduct());
        insertProductDetailsStatement.setDate(4,addProductDetails.getCurrentDate());
        insertProductQuantityDetailsStatement.setLong(2,addProductDetails.getProductIdAddProduct());
        insertProductQuantityDetailsStatement.setInt(1,addProductDetails.getQuantityOfProductAddProduct());
        insertProductQuantityDetailsStatement.setDate(3,addProductDetails.getCurrentDate());
        numberOfRowsAffected=insertProductDetailsStatement.executeUpdate();
        
        System.out.println("1:"+numberOfRowsAffected);
        numberOfRowsQuantityAffected=insertProductQuantityDetailsStatement.executeUpdate();
        
        databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        System.out.println("2:"+numberOfRowsAffected);
        return numberOfRowsAffected;
       
        
        
    }
    
    public int deleteProductDetails()
    {
        try
        {
            connection=databaseAccess.getConnection();
            PreparedStatement deleteProductDetailsStatement=connection.prepareStatement(DELETE_PRODUCT_DETAILS_SQL);
            deleteProductDetailsStatement.setLong(1,deleteProductDetails.getProductIdDeleteProduct());
            numberOfRowsAffected=deleteProductDetailsStatement.executeUpdate();
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return numberOfRowsAffected;
    }
    
    public int modifyProductDetails()
    {
        try
        {
            connection=databaseAccess.getConnection();
            PreparedStatement modifyProductDetailsStatement=connection.prepareStatement(MODIFY_PRODUCT_DETAILS_SQL);
            modifyProductDetailsStatement.setString(1,modifyProductDetails.getProductNameModifyDetails());
            modifyProductDetailsStatement.setFloat(2,modifyProductDetails.getCostPerUnitModifyDetails());
            modifyProductDetailsStatement.setLong(3,modifyProductDetails.getProductIdModifyDetails());
            numberOfRowsAffected=modifyProductDetailsStatement.executeUpdate();
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return numberOfRowsAffected;
    }
    
    public int insertAddQuantityDetails()
    {
        try
        {
            connection=databaseAccess.getConnection();
            PreparedStatement insertAddQuantityDetailsStatement=connection.prepareStatement(INSERT_QUANTITY_SQL);
            insertAddQuantityDetailsStatement.setLong(1,manageProductQuantity.getProductIdManageQuantity());
            insertAddQuantityDetailsStatement.setInt(2,manageProductQuantity.getQuantityManageProduct());
            insertAddQuantityDetailsStatement.setDate(3,addProductDetails.getCurrentDate());
            numberOfRowsAffected=insertAddQuantityDetailsStatement.executeUpdate();
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return numberOfRowsAffected;
    }
    
     public int insertRemoveQuantityDetails()
    {
        try
        {
            connection=databaseAccess.getConnection();
            if(manageProductQuantity.getQuantityManageProduct()<=new MainFrameSql().selectProductId())
            {
            PreparedStatement insertRemoveQuantityDetailsStatement=connection.prepareStatement(INSERT_QUANTITY_SQL);
            
            insertRemoveQuantityDetailsStatement.setLong(1,manageProductQuantity.getProductIdManageQuantity());
            insertRemoveQuantityDetailsStatement.setInt(2,-1*manageProductQuantity.getQuantityManageProduct());
            insertRemoveQuantityDetailsStatement.setDate(3,addProductDetails.getCurrentDate());
            numberOfRowsAffected=insertRemoveQuantityDetailsStatement.executeUpdate();
            }
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return numberOfRowsAffected;
    }
    
    public int selectProductId()
    {   
        int i=0;
        try
        {
        connection=databaseAccess.getConnection();
        PreparedStatement selectProductIdStatement=connection.prepareStatement(SELECT_QUANTITY_SQL);
        ResultSet resultSetProductId=selectProductIdStatement.executeQuery();
        while(resultSetProductId.next())
        {
            sum+=resultSetProductId.getInt(i);
        }i++;   
        databaseAccess.closeConnection();
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        return sum;
    } 
    
    public int selectOverallReport(JTable reportTable)
    {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product ID","Quantity","Purchase Date"}, 0);
        try
        {
            connection=databaseAccess.getConnection();
            PreparedStatement selectOverallReportStatement=connection.prepareStatement(SELECT_OVERALL_REPORT_SQL);
            selectOverallReportStatement.setLong(1,productReporting.getProductIdProductReporting());
            resultSetReport=selectOverallReportStatement.executeQuery();
            while(resultSetReport.next())
            {
                String p_id=resultSetReport.getString("p_id");
                int q=resultSetReport.getInt("quantity_remove");
                Date date=resultSetReport.getDate("purchse_date");
                model.addRow(new Object[]{p_id,q,date});
            }
            reportTable.setModel(model);
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return model.getRowCount();
    }
    
    public int selectMonthlyReport(JTable reportTable)
    {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product ID","Quantity","Purchase Date"}, 0);
        try
        {
            connection=databaseAccess.getConnection();
            PreparedStatement selectMonthlyReportStatement=connection.prepareStatement(SELECT_DATE_BASED_REPORT_SQL);
            selectMonthlyReportStatement.setLong(1,productReporting.getProductIdProductReporting());
            java.sql.Date getMonthOfDate=java.sql.Date.valueOf(productReporting.getMonth());
            selectMonthlyReportStatement.setDate(2, getMonthOfDate);
            selectMonthlyReportStatement.setDate(3, addProductDetails.getCurrentDate());
            resultSetReport=selectMonthlyReportStatement.executeQuery();
            while(resultSetReport.next())
            {
                String productId=resultSetReport.getString("p_id");
                int quantity=resultSetReport.getInt("quantity_remove");
                Date date=resultSetReport.getDate("purchse_date");
                model.addRow(new Object[]{productId,quantity,date});
            }
            reportTable.setModel(model);
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return model.getRowCount();
    }
    
      public int selectDateBasedReport(JTable reportTable)
    {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product ID","Quantity","Purchase Date"}, 0);
        try
        {
            connection=databaseAccess.getConnection();
            PreparedStatement selectDateBasedReportStatement=connection.prepareStatement(SELECT_DATE_BASED_REPORT_SQL);
            selectDateBasedReportStatement.setLong(1,productReporting.getProductIdProductReporting());
            selectDateBasedReportStatement.setDate(2, productReporting.getStartDateProductReporting());
            selectDateBasedReportStatement.setDate(3, productReporting.getEndDateProductReporting());
            resultSetReport=selectDateBasedReportStatement.executeQuery();
            while(resultSetReport.next())
            {
                String productId=resultSetReport.getString("p_id");
                int quantity=resultSetReport.getInt("quantity_remove");
                Date date=resultSetReport.getDate("purchse_date");
                model.addRow(new Object[]{productId,quantity,date});
            }
            reportTable.setModel(model);
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return model.getRowCount();
    }
    
      public boolean selectExistedProductId(long productId)
      {
        try
        {
          connection=databaseAccess.getConnection();
          PreparedStatement selectExistedProductId=connection.prepareStatement(SELECT_PRODUCT_ID_SQL);
          resultSetReport=selectExistedProductId.executeQuery();
            while(resultSetReport.next())
            {
                
                if(productId==resultSetReport.getInt(1))
                {
                    flag=true;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return flag;
      }
}
