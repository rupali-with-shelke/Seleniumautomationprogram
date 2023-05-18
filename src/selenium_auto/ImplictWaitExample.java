package selenium_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWaitExample {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
									
	driver.get("https://www.google.com/");
								
	driver.manage().window().maximize();
	
	//implicit wait:
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);//PERFORM MOUSR PRESS ACTIONS
	
	driver.findElement(By.xpath("//a[text()='WebDriver']")).click();
	
	
	
	
	
	}

}
