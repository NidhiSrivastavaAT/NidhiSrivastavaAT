package hays;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homepage_UK {

	
	
	@Test
	
	public void openURL() throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hays.co.uk/");
        driver.manage().window().maximize();
	    Thread.sleep(1000); 
        driver.quit();
	
    }
    }