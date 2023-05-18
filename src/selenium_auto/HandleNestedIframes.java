package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNestedIframes {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
			
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	
	WebElement outeriframes=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
                                                         //xpath of outer iframe
	driver.switchTo().frame(outeriframes);//here we are passing frame as a webelement//using this command we switch to the outer iframe
	
	Thread.sleep(2000);
	
	WebElement inneriframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));//xpath of inner iframe
	
	driver.switchTo().frame(inneriframe);//using this command we switch to the inneriframe
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Welcome");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
         