package class13sep;

import org.testng.annotations.Test;

public class CLassEnabled {
	
	
	@Test(enabled=false )
	public void TestCaseOne()
	{
		

		System.out.println("disabled");
		
		
	}

}
