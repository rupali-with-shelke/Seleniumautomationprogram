package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
								
	driver.get("https://demo.opencart.com/");
							
	driver.manage().window().maximize();
	
   WebElement desktopMenu= driver.findElement(By.xpath("/html/body/main/div[1]/nav/div[2]/ul/li[1]/a"));
    
   WebElement macMenu= driver.findElement(By.xpath("/html/body/main/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/a")); 
   
   Actions act = new Actions(driver);
   act.moveToElement(desktopMenu).moveToElement(macMenu).click().build().perform();
   
	}

}
