
package UtilityPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validation 
{

    private long id;
    private boolean flag=false;
    public boolean existID(long n)
    {   
        this.id=n;
        DBAccess dbaccess=new DBAccess();
        
        Connection con=dbaccess.getCon();
        
        try
        {
            PreparedStatement preparedStat2=con.prepareCall("select product_id from product_details");
            ResultSet rs=preparedStat2.executeQuery();
            while(rs.next())
            {
                
                if(id==rs.getInt(1))
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
    
    public boolean checkLen(long n)
    {
        this.id=n;
        this.flag=false;
        if(id>=1000000000 && id<=9999999999L)
        {
            flag=true;
        }
        return flag;
    }
    
    
    
    
    
}
