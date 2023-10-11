package multipleClassRun;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class launchnquit {

	EdgeDriver driver;

	@BeforeMethod
	public void launch() throws InterruptedException {
		driver = new EdgeDriver();

	}

	@AfterMethod
	public void quit() throws IOException {

		//// Program for taking SS starts here

		// Step 1
		TakesScreenshot ts = driver;
		// step 2
		File source = ts.getScreenshotAs(OutputType.FILE);
		// Step 3

		File destination = new File(
				"/Users/nidhisrivastava/eclipse-workspace/AutomationProject/Screenshotlocation/Nidhi"+Math.random()+".jpg");
		// file 4
		FileUtils.copyFile(source, destination);

		driver.quit();

	}

}
