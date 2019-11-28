
package com.capsys.InventoryStore.Utility;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrameValidation 
{

    private long id;
    private boolean flag=false;
   
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
 
    public static boolean isEmptyString(String data)
    {
        if (data!=null && data.isEmpty()) 
            return true ;
        else
            return false;
    }
    
    /**
     * Use to validate Main frame entry data
     **/
    public static void promptSuccessMessage(JPanel panelName, String msg)
    {
        JOptionPane.showMessageDialog(panelName,msg);
    }
    
    
    public static void validateMainFrameEntry(JPanel panelName, List fieldValue)
    {
        JOptionPane.showMessageDialog(panelName,"Enter 10-digit product ID");
    }
    
     
}
