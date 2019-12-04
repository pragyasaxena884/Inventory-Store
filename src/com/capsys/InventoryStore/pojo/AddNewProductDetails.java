/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capsys.InventoryStore.pojo;



/**
 *
 * @author Pragya
 */

public class AddNewProductDetails 
{
    private  long productIdAddProduct;
    private  String productNameAddProduct;
    private  float costPerUnitAddProduct;
    private  int quantityOfProductAddProduct;
    private boolean flag;

    /**
     * @return the productIdAddProduct
     */
    public long getProductIdAddProduct() 
    {
        return productIdAddProduct;
    }

    /**
     * @param productIdAddProduct the productIdAddProduct to set
     */
    public void setProductIdAddProduct(long productIdAddProduct) 
    {
        this.productIdAddProduct = productIdAddProduct;
    }

    /**
     * @return the productNameAddProduct
     */
    public String getProductNameAddProduct() 
    {
        return this.productNameAddProduct;
    }

    /**
     * @param productNameAddProduct the productNameAddProduct to set
     */
    public void setProductNameAddProduct(String productNameAddProduct) 
    {
        this.productNameAddProduct = productNameAddProduct;
    }

    /**
     * @return the costPerUnitAddProduct
     */
    public float getCostPerUnitAddProduct() {
        return costPerUnitAddProduct;
    }

    /**
     * @param costPerUnitAddProduct the costPerUnitAddProduct to set
     */
    public void setCostPerUnitAddProduct(float costPerUnitAddProduct) {
        this.costPerUnitAddProduct = costPerUnitAddProduct;
    }

    /**
     * @return the quantityOfProductAddProduct
     */
    
    public int getQuantityOfProductAddProduct() 
    {
        return quantityOfProductAddProduct;
    }

    /**
     * @param quantityOfProductAddProduct the quantityOfProductAddProduct to set
     */
    
    public void setQuantityOfProductAddProduct(int quantityOfProductAddProduct) 
    {
        this.quantityOfProductAddProduct = quantityOfProductAddProduct;
    }
    
    /**
     * 
     * @return java.sql.Date
     */
    
    public java.sql.Date getCurrentDate() 
    {
        java.util.Date today=new java.util.Date();
        return new java.sql.Date(today.getTime());
    }

    /**
     * @return the flag
     */
    public boolean isFlag() 
    {
        System.out.println("flag get:"+flag);
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(boolean flag) 
    {
        this.flag = flag;
        System.out.println("flag set:"+flag);
    }
}
