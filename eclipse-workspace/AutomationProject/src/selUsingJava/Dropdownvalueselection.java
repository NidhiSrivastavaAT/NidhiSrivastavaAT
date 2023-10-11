package selUsingJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownvalueselection {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///Users/nidhisrivastava/Downloads/learningHTML1%20(1).html");
		WebElement dropdown =driver.findElement(By.id("Relegion"));
		Select religion=new Select(dropdown);
		System.out.println(religion.getClass());
		Thread.sleep(3000);
		religion.selectByIndex(3);
		Thread.sleep(3000);
		religion.selectByValue("2");
		Thread.sleep(3000);
		religion.selectByVisibleText("Relegion 3");
		Thread.sleep(3000);
		religion.selectByValue("4");
		Thread.sleep(3000);
		List<WebElement> setofoptionofdd=religion.getOptions();
		int sizeofdd=setofoptionofdd.size();
		System.out.println(sizeofdd);
		religion.getClass();
	
		
	}

}
