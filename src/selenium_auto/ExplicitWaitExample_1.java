package selenium_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample_1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
										
	driver.get("https://www.google.com/");
									
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	//explicit wait:
	
	WebDriverWait mywait=new WebDriverWait(driver,5);
		
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);//PERFORM MOUSR PRESS ACTIONS
	
	WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='WebDriver']")));
	element.click();
	
	
	
	
	
	
	
	}

}
