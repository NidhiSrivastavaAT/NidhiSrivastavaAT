package testNG_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTC1 {
	
	@Test
	public void testcase111() {

		System.out.println("$testcase11");

	}
	@Test
	public void testcase11() {

		System.out.println("@test1");

	}

	@BeforeMethod
	public void testcase2() {
		System.out.println("@BeforeMethod1");
	}
	@BeforeMethod
	public void testcase22() {
		System.out.println("@BeforeMethod2");
	}
	
	
	
	@BeforeClass
	public void testcase4() {
		System.out.println("@BeforeClass");
	}
	@AfterMethod
	public void testcase333() {
		System.out.println("@AfterMethod1");
	}@AfterMethod
	public void testcase33() {
		System.out.println("@AfterMethod2");
	}
	@AfterMethod
	public void testcase3333() {
		System.out.println("@AfterMethod3");
	}
	@AfterClass
	public void testcase55() {
		System.out.println("@AfterClass1");
	}

	@AfterClass
	public void testcase5() {
		System.out.println("@AfterClass2");
	}
	@AfterClass
	public void testcase555() {
		System.out.println("@AfterClass3");
	}

	@BeforeTest
	public void testcase6() {
		System.out.println("@BeforeTest");
	}

	

	@AfterTest
	public void testcase7() {
		System.out.println("@AfterTest");
	}
	@BeforeSuite
	public void testcase8() {
		System.out.println("@BeforeSuite");
	}

	

	@AfterSuite
	public void testcase9() {
		System.out.println("@AfterSuite");
		
	}
}
