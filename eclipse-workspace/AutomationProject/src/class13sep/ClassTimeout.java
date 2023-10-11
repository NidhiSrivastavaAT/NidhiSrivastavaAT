package class13sep;

import org.testng.annotations.Test;

public class ClassTimeout {
	
	
	@Test(timeOut=3000)
	
	
	public void testCaseX()
	
	{
		
		for (int i=0;i<10000000;i++)
			
		{
			
			
			System.out.println("running for "+i+"th time");
		}
		
		
	}

}
