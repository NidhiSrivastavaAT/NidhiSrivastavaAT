package class13sep;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment10f13sep {
	
	
	
	@BeforeMethod
	public void login()
	{
		
		System.out.println("login");
	}
	
	
	@Test
	public void testCaseA()
	{
		
		System.out.println("A");
	}
	@Test
	public void testCaseB()
	{
		
		System.out.println("B");
	}
	@Test
	public void testCaseC()
	{
		
		System.out.println("C");
	}
	@Test
	public void testCaseD()
	{
		
		System.out.println("D");
	}
	
    @AfterMethod
    public void Quit()
    {
    	
    	System.out.println("Quit");
    	
    }
    
}
