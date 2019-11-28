/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capsys.Inventory.pojo;

/**
 *
 * @author Pragya
 */
public class ModifyProductDetails 
{
    private long productIdModifyDetails;
    private String productNameModifyDetails;
    private float costPerUnitModifyDetails;
    /**
     * @return the productIdModifyDetails
     */
    public long getProductIdModifyDetails() 
    {
        return productIdModifyDetails;
    }

    /**
     * @param productIdModifyDetails the productIdModifyDetails to set
     */
    public void setProductIdModifyDetails(long productIdModifyDetails) {
        this.productIdModifyDetails = productIdModifyDetails;
    }

    /**
     * @return the productNameModifyDetails
     */
    public String getProductNameModifyDetails() {
        return productNameModifyDetails;
    }

    /**
     * @param productNameModifyDetails the productNameModifyDetails to set
     */
    public void setProductNameModifyDetails(String productNameModifyDetails) {
        this.productNameModifyDetails = productNameModifyDetails;
    }

    /**
     * @return the costPerUnitModifyDetails
     */
    public float getCostPerUnitModifyDetails() {
        return costPerUnitModifyDetails;
    }

    /**
     * @param costPerUnitModifyDetails the costPerUnitModifyDetails to set
     */
    public void setCostPerUnitModifyDetails(float costPerUnitModifyDetails) {
        this.costPerUnitModifyDetails = costPerUnitModifyDetails;
    }
    
    
    
}
