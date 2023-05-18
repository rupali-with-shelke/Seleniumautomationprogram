package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//driver.manage().window().maximize();
		
		//driver.switchTo().frame("singleframe");//By name
		
		driver.switchTo().frame(0);//by index//working
		
		//WebElement frame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		//driver.switchTo().frame(frame);//by webelement
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("SpeedWayTech");
		
		driver.switchTo().defaultContent();//go back to the main page
		driver.findElement(By.linkText("Practice Site")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
