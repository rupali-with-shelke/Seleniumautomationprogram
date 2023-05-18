package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/dynamic_controls");
																					
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	
	
	Thread.sleep(5000);
	
	String msgTxt=driver.findElement(By.xpath("//p[@id='message']")).getText();
	
	System.out.println(msgTxt);
	
	driver.findElement(By.xpath("//button[text()='Enable']")).click();
	Thread.sleep(5000);
	String enableTxt=driver.findElement(By.xpath("//p[@id='message']")).getText();
	System.out.println(enableTxt);

	
	}

}
