/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capsys.Inventory.pojo;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author Pragya
 */
public class ProductReporting 
{
    private long productIdProductReporting;
    private Date startDateProductReporting;
    private Date endDateProductReporting;
    /**
     * @return the startDateProductReporting
     */
    public Date getStartDateProductReporting() {
        return startDateProductReporting;
    }

    /**
     * @param startDateProductReporting the startDateProductReporting to set
     */
    public void setStartDateProductReporting(Date startDateProductReporting) {
        this.startDateProductReporting = startDateProductReporting;
    }

    /**
     * @return the endDateProductReporting
     */
    public Date getEndDateProductReporting() {
        return endDateProductReporting;
    }

    /**
     * @param endDateProductReporting the endDateProductReporting to set
     */
    public void setEndDateProductReporting(Date endDateProductReporting) {
        this.endDateProductReporting = endDateProductReporting;
    }
 

    /**
     * @return the productIdProductReporting
     */
    public long getProductIdProductReporting() 
    {
        return productIdProductReporting;
    }

    /**
     * @param productIdProductReporting the productIdProductReporting to set
     */
    public void setProductIdProductReporting(long productIdProductReporting) 
    {
        this.productIdProductReporting = productIdProductReporting;
    }
   
    
    public LocalDate getMonth() 
    {
        LocalDate currentDate = LocalDate.now();
        int month = currentDate.getMonthValue();
        LocalDate date = currentDate.withDayOfMonth(1);
        return date;
    }
    

}
