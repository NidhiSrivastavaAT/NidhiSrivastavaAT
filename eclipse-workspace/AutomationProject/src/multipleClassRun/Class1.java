package multipleClassRun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 extends launchnquit {

	@Test
	public void testcase1() throws InterruptedException {

		System.out.println("@test1");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();

		
	}

}
