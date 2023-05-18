package selenium_auto;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample_2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
											
	driver.get("https://www.google.com/");
										
	driver.manage().window().maximize();
			
	//implicit wait:
		
	
			
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);//PERFORM MOUSR PRESS ACTIONS
	
	
	By elelocator=(By.xpath("//a[text()='WebDriver']"));//locator stored used by class insatnces
		
	waitForElementPresent( driver,elelocator,10).click();//calling this method//we can stored some other variable or directly perform actions
	}
	
	//Generic Method Used:for multiple webelement
	
	public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout) 
	{
		//WebDriverWait wait=new WebDriverWait(driver,TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.presenceofElementLocated(locator));
		return driver.findElement(locator);
		
	}
	
	
	
	
	     //working//Hyderabad:=====>institute:
	
	
	
	
	
	

}
