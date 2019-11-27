
package InventoryStoreTest;

import UtilityPackage.Validation;
import junit.framework.TestCase;

import org.junit.Test;


public class NewEmptyJUnitTest1 
{
    long id = 1245000000;	
    Validation validation = new Validation();
   
   @Test
   public void testPrintMessage() 
   {	
    TestCase.assertTrue("Id exists in the database", validation.existID(id));
   }
}
