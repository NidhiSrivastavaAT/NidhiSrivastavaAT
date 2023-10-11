package selUsingJava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionSelection {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Shoe");
	
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.id("np_90/6741118031")).click();
		
		driver.findElement(By.className("a-icon a-icon-checkbox"));
		
		
		

	}

}
