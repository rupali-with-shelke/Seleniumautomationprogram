package selenium_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();
	
	//implicit wait:
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//implicitlyWait(DurationOfSecond(50));//after 4.8....onward used this method
	driver.get("https://the-internet.herokuapp.com/dynamic_controls");
								
	driver.manage().window().maximize();
	//for remove button functionality:
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	
	//we have to not give thread.sleep becz we here declared the implicit wait
	//after the browser launching
	
	String msgtxt1=	driver.findElement(By.xpath("//p[@id='message']")).getText();
		
	System.out.println(msgtxt1);	
	
	//for enable button functionality:
	
	driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
	//we have to not give thread.sleep becz we here declared the implicit wait
	//after the browser launching
	String msgtxt2=	driver.findElement(By.xpath("//p[@id='message']")).getText();
	
	System.out.println(msgtxt2);
		
		
		
	
		
	}

}
