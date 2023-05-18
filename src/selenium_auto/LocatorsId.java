package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsId {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
			
	   driver.get("https://demo.automationtesting.in/Index.html");
	   
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   
	   driver.findElement(By.id("btn2")).click();
	   
		String url=driver.getCurrentUrl();//type is string
		
		System.out.println(url);//return also string formate
	}

}
