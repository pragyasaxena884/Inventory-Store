package Controller;

import UtilityPackage.DBAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class DBSum 
{
    public int total=0;
    Connection c=new DBAccess().getCon();
    public int sum_quantity(long l)
    {
        try
        {
            PreparedStatement preparedStat=c.prepareStatement("Select quantity_remove from quantity where p_id=?");
            preparedStat.setLong(1,l);
            ResultSet rs=preparedStat.executeQuery();
            while(rs.next())
            {
                total=total+rs.getInt("quantity_remove");
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        return total;
    }  
    
    public LocalDate get_month()
    {
        LocalDate currentDate=LocalDate.now();
        int month=currentDate.getMonthValue();
        LocalDate date=currentDate.withDayOfMonth(1);
        return date;
    }
   
        
    
}
