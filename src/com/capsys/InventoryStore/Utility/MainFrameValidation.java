package com.capsys.InventoryStore.Utility;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrameValidation 
{

    private long productId;
    private boolean flag=false;
    private LoggingUtil logger=new LoggingUtil();
       
   /**
    * 
    * @param productId
    * @param panelName
    * @return 
    */
    /*public boolean isEmptyProductId(long productId,JPanel panelName)
    {   
        try
        {
            if(Long.toString(productId).isEmpty())
            {
            flag=true;
            } 
        }
        catch(java.lang.NumberFormatException e)
        {
            this.promptSuccessMessage(panelName, "Product Id is empty");
            logger.getLogger().severe(e.getMessage());
        }
        return flag;
    }
    
    /**
     * 
     * @param productName
     * @param panelName
     * @return 
     */
    /*public boolean isEmptyProductName(String productName,JPanel panelName)
    {
        try
        {
            if(productName.isEmpty())
            {
            flag=true;
            } 
        }
        catch(java.lang.NumberFormatException e)
        {
            this.promptSuccessMessage(panelName, "Product Name is empty");
            logger.getLogger().severe(e.getMessage());
        }
        return flag;
        
    }
    /**
     * 
     * @param quantity
     * @param panelName
     * @return 
     */
    /*public boolean isEmptyProductQuantity(int quantity,JPanel panelName)
    {
        try
        {
            if(Integer.toString(quantity).isEmpty())
            {
            flag=true;
            } 
        }
        catch(java.lang.NumberFormatException e)
        {
            this.promptSuccessMessage(panelName, "Quantity field is empty");
            logger.getLogger().severe(e.getMessage());
        }
        return flag;
        
    }
    /**
     * 
     * @param cost
     * @param panelName
     * @return 
     */
    /*public boolean isEmptyProductCost(float cost,JPanel panelName)
    {
        try
        {
            if(Float.toString(cost).isEmpty())
            {
            flag=true;
            } 
        }
        catch(java.lang.NumberFormatException e)
        {
            this.promptSuccessMessage(panelName, "Cost field is empty");
            logger.getLogger().severe(e.getMessage());
        }
        return flag;
        
    }*/
    
    /**
     * Use to validate the ProductId
     * @param productId
     * @return flag
     */
    
    public boolean validateProductId(String productId)
    {    
        try
        {
            if(Pattern.matches("^[1-9]\\d{9}$", productId ))
            {
                flag=true;
            }
        }
        
        catch(Exception e)
        {
            logger.getLogger().severe(e.getMessage());
        }
        return flag;
    }
    /**
     * Use to validate productName
     * @param productName
     * @return flag
     */
    
    public boolean validateUsername(String productName)
    {
        try
        {
            if(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]{3}+$", productName))
            {
            this.flag=true;
            }     
        }
        catch(Exception e)
        {
            logger.getLogger().severe(e.getMessage());
        }
        return this.flag;
    }
    
    /**
     * Use to display the message on panel
     * @param panelName
     * @param msg 
     * @param textField 
     */
    public void promptSuccessMessage(JPanel panelName, String msg,JTextField[] textField)
    {
        JOptionPane.showMessageDialog(panelName,msg);
        int a=JOptionPane.OK_OPTION;
        if(a==0)
        {
            for (JTextField jTextField : textField) 
            {
                jTextField.setText("");
            }
        }
    }
    /**
     * 
     * @param panelName
     * @param msg
     * @param textField 
     */
    public void promptConfirmMessage(JPanel panelName, String msg,JTextField[] textField)
    {
        JOptionPane.showConfirmDialog(panelName, msg);
        if(JOptionPane.YES_OPTION==0)
        {
           textField[1].setText("");
        }
        else if(JOptionPane.NO_OPTION==1)
        {
            for (JTextField jTextField : textField) 
            {
                jTextField.setText("");
            }
        }
    }
    /**
     * Use to show confirm Add product box to the user
     * @param panelName
     * @param msg
     * @param textField 
     */
    public void promptConfirmMessageAddProduct(JPanel panelName, String msg,JTextField[] textField)
    {
        JOptionPane.showConfirmDialog(panelName, msg);
        if(JOptionPane.YES_OPTION==0)
        {
           for (JTextField jTextField : textField) 
            {
                jTextField.setText("");
            }
        }
        else if(JOptionPane.NO_OPTION==1)
        {
            
        }
    }
    /**
     * Use to prompt confirm delete box to the user
     * @param panelName
     * @param msg
     * @param textField
     * @return flag
     */
    public boolean promptConfirmMessageDeleteProduct(JPanel panelName, String msg,JTextField[] textField)
    {
        boolean flag=false;
        JOptionPane.showConfirmDialog(panelName, msg);
        if(JOptionPane.YES_OPTION==0)
        {
            flag=true;    
            textField[0].setText("");
        }
        if(JOptionPane.NO_OPTION==1)
        {
            flag=false;
        }
        return flag;
    } 
    /**
     * Use to prompt confirm update dialog box to the user
     * @param panelName
     * @param msg
     * @param textField
     * @return flag
     */ 
    public boolean promptConfirmMessageModifyProduct(JPanel panelName, String msg,JTextField[] textField)
    {
        boolean flag=false;
        JOptionPane.showConfirmDialog(panelName, msg);
        if(JOptionPane.YES_OPTION==0)
        {
            flag=true;    
            for (JTextField jTextField : textField) 
            {
                jTextField.setText("");
            }
        }
        if(JOptionPane.NO_OPTION==1)
        {
            flag=false;
        }
        return flag;
    } 
 }
