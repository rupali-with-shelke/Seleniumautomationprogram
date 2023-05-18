package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLinkText {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
			
	//driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	
    //driver.findElement(By.linkText("Gmail")).click();
	driver.findElement(By.linkText("Practice Site")).click();
	}

}
