package classof14sep;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreentshot {
	
@Test
	
public void TestCase1() throws IOException


	{
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	WebElement W1 =driver.findElement(By.id("twotabsearchtextbox"));
	W1.sendKeys("XYZ");
	WebElement W2=driver.findElement(By.id("nav-search-submit-button"));
	W2.click();
	
	////Program for taking SS starts here
	
	//Step 1
	TakesScreenshot ts= driver;
	//step 2
	File source=ts.getScreenshotAs(OutputType.FILE);
	//Step 3
	
	File destination=new File("/Users/nidhisrivastava/eclipse-workspace/AutomationProject/Screenshotlocation/Nidhi");
//file 4
	FileUtils.copyFile(source, destination);

	
	
	
	
	
	
	
	
	
	

    }

}
