package selUsingJava;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		//ChromeDriver cd= new ChromeDriver();
		//EdgeDriver cd= new EdgeDriver();
	     // SafariDriver cd= new SafariDriver();
		FirefoxDriver cd= new FirefoxDriver();
		cd.get("https://www.wikipedia.org");
		String title=cd.getTitle();
		System.out.println("Title of my webpage is "+ title);
		String WindowNme=cd.getWindowHandle();
		Set<String> WindowNmes=cd.getWindowHandles();
		System.out.println("Name  of my window "+ WindowNme);
		System.out.println("Name  of my windowssss "+ WindowNmes);
		
		
		//cd.close();

		

	}

}
