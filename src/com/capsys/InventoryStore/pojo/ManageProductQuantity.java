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
public class ManageProductQuantity 
{
    private long productIdManageQuantity;
    private int quantityManageProduct;
    /**
     * @return the productIdManageQuantity
     */
    public long getProductIdManageQuantity() 
    {
        return productIdManageQuantity;
    }

    /**
     * @param productIdManageQuantity the productIdManageQuantity to set
     */
    public void setProductIdManageQuantity(long productIdManageQuantity) 
    {
        this.productIdManageQuantity = productIdManageQuantity;
    }

    /**
     * @return the quantityManageProduct
     */
    public int getQuantityManageProduct() 
    {
        return quantityManageProduct;
    }

    /**
     * @param quantityManageProduct the quantityManageProduct to set
     */
    public void setQuantityManageProduct(int quantityManageProduct) 
    {
        this.quantityManageProduct = quantityManageProduct;
    }
    
    
}
