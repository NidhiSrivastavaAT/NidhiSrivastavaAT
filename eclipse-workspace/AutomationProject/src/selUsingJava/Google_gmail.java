package selUsingJava;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_gmail {
	
	
public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in");
		driver.findElement(By.linkText("Gmail")).click();
		driver.close();
}

}
