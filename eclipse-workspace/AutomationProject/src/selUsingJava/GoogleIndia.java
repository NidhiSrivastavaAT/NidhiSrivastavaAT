package selUsingJava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleIndia {
	
	public static void main(String args[])
	
	{
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("ABCD");
		
	
		
		
		
	}

}
