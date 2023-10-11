package selUsingJava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JASMrelativexpath {

	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///Users/nidhisrivastava/Downloads/learningHTML1%20(1).html");
		//driver.findElement(By.xpath"(/html/body/input)[1]");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Nidhi");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Favourite passtime :movie");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Mypass@123");

	}

}
