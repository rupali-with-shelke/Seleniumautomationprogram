package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCssSelector1 {

	public static void main(String[] args) {
		
		//4.LocatorsCssSelector:===>Using class name
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
				
		driver.get("https://classic.freecrm.com/index.html");
		
		driver.manage().window().maximize();
		
		//1.using css selector ===>By class name oR by compound class name
		
		driver.findElement(By.cssSelector(".form-control")).sendKeys("speedway2016");//1 .using css selector ===>By class name oR by compound class name
		
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("speedway");//using tagname
		
		driver.findElement(By.cssSelector(".btn.btn-small")).click();////1 .using css selector ===>By class name oR by compound class name
		
        
		/*driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("SpeedwayTech");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("speed2016");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();*/
		
		
		
		
		
		
		
	}
         
}
