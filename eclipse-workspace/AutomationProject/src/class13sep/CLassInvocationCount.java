package class13sep;

import org.testng.annotations.Test;

public class CLassInvocationCount {
	
	
	
	
	@Test (invocationCount=10)
	public void TestCase()
	
	{
		System.out.println("Invoked 10 time");
		
	}
	
	

}
