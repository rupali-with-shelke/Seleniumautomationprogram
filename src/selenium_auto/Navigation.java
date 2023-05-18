package selenium_auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
			
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");//opening application using driver.get application(snapdeal page)
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.get("https://www.amazon.in");//(amazon.in)
		
		//driver.navigate().to("https://www.snapdeal.com");//driver.get(); same use of navigate.to
		//driver.navigate().to("https://www.amazon.in");//driver.get(); same use of navigate.to
		
		
		Thread.sleep(5000);
		driver.navigate().back();//snapdeal page
		Thread.sleep(5000);
		driver.navigate().forward();//amazon application
		Thread.sleep(5000);
		driver.navigate().refresh();//reload the page
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
