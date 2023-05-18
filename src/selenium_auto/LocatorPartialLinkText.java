package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPartialLinkText {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	driver.findElement(By.partialLinkText("Best Sellers")).click();

	}

}
