/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capsys.InventoryStore.Sql;
import com.capsys.InventoryStore.Utility.LoggingUtil;
import com.capsys.InventoryStore.pojo.AddNewProductDetails;
import com.capsys.InventoryStore.pojo.DeleteProductDetails;
import com.capsys.InventoryStore.pojo.ManageProductQuantity;
import com.capsys.InventoryStore.pojo.ModifyProductDetails;
import com.capsys.InventoryStore.pojo.ProductReporting;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pragya
 */
public class MainFrameSql 
{
    private DatabaseAccess databaseAccess=new DatabaseAccess();
    private Connection connectionMainFrame;
    private int numberOfRowsAffected;
    private ResultSet resultSetReport;
    private int numberOfRowsQuantityAffected;
    private int sum=0;
    
    static final String INSERT_PRODUCT_DETAILS_SQL="insert into product_details values(?,?,?,?)";
    static final String SELECT_ALL_PRODUCT_DETAILS_SQL="select product_name,cost from product_details where product_id=?";
    static final String INSERT_QUANTITY_SQL="insert into quantity(quantity_remove,purchse_date,p_id) values(?,?,(select distinct ? from product_details))";
    static final String SELECT_PRODUCT_ID_SQL="select product_id from product_details";
    static final String DELETE_PRODUCT_DETAILS_SQL="delete from product_details where product_id =?";
    static final String MODIFY_PRODUCT_DETAILS_SQL="replace into product_details set product_name=?,cost=?,product_id=?,purchase_date=?";
    static final String SELECT_QUANTITY_SQL="select quantity_remove from quantity where p_id=?";
    static final String SELECT_OVERALL_REPORT_SQL="select * from quantity where p_id=?";
    static final String SELECT_DATE_BASED_REPORT_SQL="select * from quantity where p_id=? AND purchse_date BETWEEN ? and ?";
    
    private LoggingUtil logger=new LoggingUtil();
    
    /**
     * USe to inset data into table product_details
     * @param addProductDetails
     * @param panelName
     * @return numberOfRowsAffected
     */
    public int insertAddNewProductDetails(AddNewProductDetails addProductDetails,JPanel panelName) 
    {
        try
        {
        connectionMainFrame=databaseAccess.getConnection();
        PreparedStatement insertProductDetailsStatement=connectionMainFrame.prepareStatement(INSERT_PRODUCT_DETAILS_SQL);
        PreparedStatement insertProductQuantityDetailsStatement=connectionMainFrame.prepareStatement(INSERT_QUANTITY_SQL);
        insertProductDetailsStatement.setLong(1,addProductDetails.getProductIdAddProduct());
        insertProductDetailsStatement.setString(2,addProductDetails.getProductNameAddProduct());
        insertProductDetailsStatement.setFloat(3,addProductDetails.getCostPerUnitAddProduct());
        insertProductDetailsStatement.setDate(4,addProductDetails.getCurrentDate());
        insertProductQuantityDetailsStatement.setLong(3,addProductDetails.getProductIdAddProduct());
        insertProductQuantityDetailsStatement.setInt(1,addProductDetails.getQuantityOfProductAddProduct());
        insertProductQuantityDetailsStatement.setDate(2,addProductDetails.getCurrentDate());
        numberOfRowsAffected=insertProductDetailsStatement.executeUpdate();
        numberOfRowsQuantityAffected=insertProductQuantityDetailsStatement.executeUpdate();
        databaseAccess.closeConnection();
        }
        catch(com.mysql.cj.jdbc.exceptions.CommunicationsException e)
        {
            JOptionPane.showMessageDialog(panelName, "Database is not connected");
            logger.getLogger().severe(e.getMessage());
        }
        catch(java.lang.NumberFormatException e)
        {
            JOptionPane.showMessageDialog(panelName, "Invalid Input");
            logger.getLogger().severe(e.getMessage());
        }
        catch(SQLException e)
        {
            
            logger.getLogger().severe(e.getMessage());
            JOptionPane.showMessageDialog(panelName, "SQL");
        }
        catch(Exception e)
        {
            logger.getLogger().severe(e.getMessage());
            JOptionPane.showMessageDialog(panelName, "Unknown error occured");
        }    
        
        return numberOfRowsAffected;
    }
    /**
     * Use to delete the details of the product
     * @param deleteProductDetails
     * @return numberOfRowsAffected
     */
    public int deleteProductDetails(DeleteProductDetails deleteProductDetails)
    {
        try
        {
            connectionMainFrame=databaseAccess.getConnection();
            PreparedStatement deleteProductDetailsStatement=connectionMainFrame.prepareStatement(DELETE_PRODUCT_DETAILS_SQL);
            deleteProductDetailsStatement.setLong(1,deleteProductDetails.getProductIdDeleteProduct());
            numberOfRowsAffected=deleteProductDetailsStatement.executeUpdate();
            databaseAccess.closeConnection();
        }
        catch(SQLException e)
        {
            logger.getLogger().severe(e.getMessage());
        }
        return numberOfRowsAffected;
    }
    /**
     * Use to modify the details of the product
     * @param modifyProductDetails
     * @return numberOFRowsAffected
     */
    public int modifyProductDetails(ModifyProductDetails modifyProductDetails)
    {
        try
        {
            
            connectionMainFrame=databaseAccess.getConnection();
            PreparedStatement modifyProductDetailsStatement=connectionMainFrame.prepareStatement(MODIFY_PRODUCT_DETAILS_SQL);
            modifyProductDetailsStatement.setString(1,modifyProductDetails.getProductNameModifyDetails());
            modifyProductDetailsStatement.setFloat(2,modifyProductDetails.getCostPerUnitModifyDetails());
            modifyProductDetailsStatement.setLong(3, modifyProductDetails.getProductIdModifyDetails());
            modifyProductDetailsStatement.setDate(4,new AddNewProductDetails().getCurrentDate());
            System.out.println(modifyProductDetailsStatement.toString());
            numberOfRowsAffected=modifyProductDetailsStatement.executeUpdate();
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            logger.getLogger().severe(e.getMessage());
        }
        return numberOfRowsAffected;
    }
    /**
     * Use to add quantity of the existing product
     * @param addProductDetails
     * @param manageProductQuantity
     * @return numberOfRowsAffected 
     */
    public int insertAddQuantityDetails(AddNewProductDetails addProductDetails,ManageProductQuantity manageProductQuantity) 
    {
        try
        {
            connectionMainFrame=databaseAccess.getConnection();
            PreparedStatement insertAddQuantityDetailsStatement=connectionMainFrame.prepareStatement(INSERT_QUANTITY_SQL);
            insertAddQuantityDetailsStatement.setLong(3,manageProductQuantity.getProductIdManageQuantity());
            insertAddQuantityDetailsStatement.setInt(1,manageProductQuantity.getQuantityManageProduct());
            insertAddQuantityDetailsStatement.setDate(2,addProductDetails.getCurrentDate());
            numberOfRowsAffected=insertAddQuantityDetailsStatement.executeUpdate();
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            logger.getLogger().severe(e.getMessage());
        }
        return numberOfRowsAffected;
    }
    /**
     * Use to remove Quantity of the existing product Id
     * @param productReporting
     * @param addProductDetails
     * @param manageProductQuantity
     * @return numberOfRowsAffected 
     */
    public int insertRemoveQuantityDetails(ProductReporting productReporting,AddNewProductDetails addProductDetails,ManageProductQuantity manageProductQuantity)
    {
        try
        {
            connectionMainFrame=databaseAccess.getConnection();
            if(manageProductQuantity.getQuantityManageProduct()<=this.selectProductId(productReporting))
            {
            PreparedStatement insertRemoveQuantityDetailsStatement=connectionMainFrame.prepareStatement(INSERT_QUANTITY_SQL);
            insertRemoveQuantityDetailsStatement.setLong(3,manageProductQuantity.getProductIdManageQuantity());
            insertRemoveQuantityDetailsStatement.setInt(1,-1*manageProductQuantity.getQuantityManageProduct());
            insertRemoveQuantityDetailsStatement.setDate(2,addProductDetails.getCurrentDate());
            numberOfRowsAffected=insertRemoveQuantityDetailsStatement.executeUpdate();
            }
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            logger.getLogger().severe(e.getMessage());
        }
        return numberOfRowsAffected;
    }
    /**
     * Use to select product id and calculate the available stock
     * @param productReporting
     * @return numberOfRowsAffected 
     */
    public int selectProductId(ProductReporting productReporting)
    {   
        
        int i=1;
        try
        {
        connectionMainFrame=databaseAccess.getConnection();
        PreparedStatement selectProductIdStatement=connectionMainFrame.prepareStatement(SELECT_QUANTITY_SQL);
        selectProductIdStatement.setLong(1, productReporting.getProductIdProductReporting());
        ResultSet resultSetProductId=selectProductIdStatement.executeQuery();
        while(resultSetProductId.next())
        {
        sum+=resultSetProductId.getInt(i);
        }i++;   
        System.out.println("sum:"+sum);
        
        productReporting.setAvailableStock(sum);
        databaseAccess.closeConnection();
        }
        
        catch(Exception e)
        {
            logger.getLogger().severe(e.getMessage());
        }
       
        return sum;
    } 
    /**
     * Use to generate overall report
     * @param reportTable
     * @param productReporting
     * @return numberOfRowsAffected 
     */
    public int selectOverallReport(JTable reportTable,ProductReporting productReporting) throws SQLException
    {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product ID","Quantity","Purchase Date"}, 0);
        try
        {
            connectionMainFrame=databaseAccess.getConnection();
            PreparedStatement selectOverallReportStatement=connectionMainFrame.prepareStatement(SELECT_OVERALL_REPORT_SQL);
            selectOverallReportStatement.setLong(1,productReporting.getProductIdProductReporting());
            //this.selectProductId(productReporting);
            resultSetReport=selectOverallReportStatement.executeQuery();
            System.out.println("resultset"+ resultSetReport);
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
            logger.getLogger().severe(e.getMessage());
        }
        finally
        {
            resultSetReport.close();
        }
        System.out.println("model.getRowCount():"+ model.getRowCount());
        return model.getRowCount();
    }
    /**
     * Use to generate monthly report of the existing product id
     * @param reportTable
     * @param addProductDetails
     * @param productReporting
     * @return numberOfRowsAffected 
     */
    public int selectMonthlyReport(JTable reportTable,AddNewProductDetails addProductDetails,ProductReporting productReporting)
    {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product ID","Quantity","Purchase Date"}, 0);
        try
        {
            connectionMainFrame=databaseAccess.getConnection();
            PreparedStatement selectMonthlyReportStatement=connectionMainFrame.prepareStatement(SELECT_DATE_BASED_REPORT_SQL);
            selectMonthlyReportStatement.setLong(1,productReporting.getProductIdProductReporting());
            java.sql.Date getMonthOfDate=java.sql.Date.valueOf(productReporting.getMonth());
            selectMonthlyReportStatement.setDate(2, getMonthOfDate);
            selectMonthlyReportStatement.setDate(3, addProductDetails.getCurrentDate());
            resultSetReport=selectMonthlyReportStatement.executeQuery();
            while(resultSetReport.next())
            {
                long productId=resultSetReport.getLong("p_id");
                int quantity=resultSetReport.getInt("quantity_remove");
                Date date=resultSetReport.getDate("purchse_date");
                model.addRow(new Object[]{productId,quantity,date});
            }
            reportTable.setModel(model);
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            logger.getLogger().severe(e.getMessage());
        }
        return model.getRowCount();
    }
    /**
     * Use to generate report data based
     * @param reportTable
     * @param productReporting
     * @return numberOfRowsAffected 
     */
    public int selectDateBasedReport(JTable reportTable,ProductReporting productReporting)
    {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product ID","Quantity","Purchase Date"}, 0);
        try
        {
            connectionMainFrame=databaseAccess.getConnection();
            PreparedStatement selectDateBasedReportStatement=connectionMainFrame.prepareStatement(SELECT_DATE_BASED_REPORT_SQL);
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
            logger.getLogger().severe(e.getMessage());
        }
        return model.getRowCount();
    }
    /**
     * Use to check the product id exist in the database or not
     * @param productId
     * @return flag 
     */
      public boolean selectExistedProductId(long productId)
      {
        boolean flag=false;
        try
        {
          connectionMainFrame=databaseAccess.getConnection();
          PreparedStatement selectExistedProductId=connectionMainFrame.prepareStatement(SELECT_PRODUCT_ID_SQL);
          resultSetReport=selectExistedProductId.executeQuery();
            while(resultSetReport.next())
            {  
                if(productId==resultSetReport.getLong("product_id"))
                {
                    flag=true;
                }
            }
            databaseAccess.closeConnection();
        }
        catch(Exception e)
        {
            logger.getLogger().severe(e.getMessage());
        }
        
        return flag;
      }
      /**
       * Use to select product details of the product
       * @param modifyProductDetails 
       */
      public void selectProductDetails(ModifyProductDetails modifyProductDetails) 
      {
          try
          {
          connectionMainFrame=databaseAccess.getConnection();
          PreparedStatement selectProductDetailsStatement=connectionMainFrame.prepareStatement(SELECT_ALL_PRODUCT_DETAILS_SQL);
          selectProductDetailsStatement.setLong(1,modifyProductDetails.getProductIdModifyDetails());
          resultSetReport=selectProductDetailsStatement.executeQuery();
          while(resultSetReport.next())
          {
              modifyProductDetails.setProductNameModifyDetails(resultSetReport.getString("product_name"));
              modifyProductDetails.setCostPerUnitModifyDetails(resultSetReport.getInt("cost"));
          }
          }
          catch(Exception e)
          {
              logger.getLogger().severe(e.getMessage());
          }
          
      }
}
