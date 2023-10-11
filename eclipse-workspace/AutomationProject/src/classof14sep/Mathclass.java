package classof14sep;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mathclass {
	
@Test
	
	public void TestCase1()
	{
		
		System.out.println(Math.max(5,90));
		Reporter.log("OUTPUT : ", Math.max(5,90), true );
		
		System.out.println(Math.min(5,90));
		Reporter.log("OUTPUT : ", Math.max(5,90), true );
		
		System.out.println(Math.abs(5.676));
		Reporter.log("OUTPUT : ", Math.max(5,90), true );
		
		System.out.println(Math.ceil(9884.46473));
		Reporter.log("OUTPUT : ", Math.max(5,90), true );
		
		System.out.println(Math.random());
		Reporter.log("OUTPUT : ", Math.max(5,90), true );
		
		System.out.println(Math.addExact(78, 123));
		
		
	}


}
