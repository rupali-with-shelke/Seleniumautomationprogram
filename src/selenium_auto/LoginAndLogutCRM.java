package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogutCRM {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://classic.freecrm.com/index.html");
		
    driver.manage().window().maximize();
    
    //Enter Username and Password:
    
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2016");
        
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2016");
    
    //Click on Login Button:
    driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
    
   //click on Logout:
    
   Thread.sleep(3000);
   driver.switchTo().frame("mainpanel");
   driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
     
	}	
}









           //(//a[@class='topnavlink'])[3]

