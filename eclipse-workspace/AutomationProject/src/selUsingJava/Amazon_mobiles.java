package selUsingJava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_mobiles {

	
public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("Mobiles")).click();
		//driver.close();
}

}
