package selenium_auto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompanyLookup {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
				
	WebDriver driver = new ChromeDriver();
										
    driver.get("https://classic.freecrm.com/index.html");
									
	driver.manage().window().maximize();	
			
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2016");
		     
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2016");
			
	driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
			
			
	driver.switchTo().frame("mainpanel");
				
	WebElement contacts=driver.findElement(By.xpath("//a[@title='Contacts']"));	
				
	//we want to perform want to perform mouse hover action on contact	
	//Actiom class for that:	
				
	Actions act =new Actions(driver);//we are creating object of action class
	//1.act.moveToElement(contacts).perform();
			
	//2.
	act.moveToElement(contacts).build().perform();	
			
	driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	
	//compamy:
	
	
	
	
	String pwh=driver.getWindowHandle();
	driver.findElement(By.xpath("(//input[@value='Lookup'])[1]")).click();
	
	
	Set<String> windows=driver.getWindowHandles();
	
	for(String win:windows)
	{
	  if(!win.equals(pwh))//in if loop we also write the code/after complication of for loop
	  {
		  
		  driver.switchTo().window(win);
		 // driver.findElement(By.xpath("//input[@name='search']")).sendKeys("CAPGEMINI");
		 // driver.findElement(By.xpath("//input[@type='submit']")).click();
		  //driver.close();
	  }  
	   
	
	  
	}
	  driver.findElement(By.xpath("//input[@name='search']")).sendKeys("CAPGEMINI");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.xpath("(//td[@valign='top'])[6]")).click();
	  driver.findElement(By.linkText("Capgemini")).click();
	 // driver.close();
	  driver.switchTo().window(pwh);
	}
}
