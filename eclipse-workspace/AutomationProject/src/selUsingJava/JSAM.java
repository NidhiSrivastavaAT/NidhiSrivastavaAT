package selUsingJava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/nidhisrivastava/Downloads/learningHTML1%20(1).html");
		driver.findElement(By.id("1")).sendKeys("ABC");
		driver.findElement(By.id("2")).sendKeys("Justahint");
		driver.findElement(By.id("3")).sendKeys("mypass");
		
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Myusername");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("myhint");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("mypass");
		driver.findElement(By.xpath("(/html/body/input)[4]")).sendKeys("lastname");
		driver.findElement(By.xpath("((/html/body/form/input)[1])")).sendKeys("myfirstname");
		//driver.findElement(By.xpath("((/html/body/form/input)[3])")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		
		

		
		

	}

}
