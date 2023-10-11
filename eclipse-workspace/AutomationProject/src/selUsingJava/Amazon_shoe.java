package selUsingJava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_shoe {
	
	
	
	
public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.linkText("https://www.amazon.in/sspa/click?ie=UTF8&spc=MToyNjUxNDI1MTEzMjkwNTk5OjE2OTI4MTA4ODk6c3BfYXRmOjMwMDAzOTM0Nzk1ODQzMjo6MDo6&url=%2FShoes-Stylish-Running-Lightweight-Walking%2Fdp%2FB0CDH8VLNS%2Fref%3Dsr_1_1_sspa%3Fcrid%3D2K5PESZYVIOLJ%26keywords%3Dshoe%26qid%3D1692810889%26sprefix%3Dshoe%252Caps%252C205%26sr%3D8-1-spons%26sp_csd%3Dd2lkZ2V0TmFtZT1zcF9hdGY%26psc%3D1")).click();
		driver.quit();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div/span/a/div/img")).click();
}

}
