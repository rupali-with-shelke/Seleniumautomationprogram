package selenium_auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenURLSIn2Tabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://demo.nopcommerce.com/");
		
		//driver.switchTo().newWindow(Window.TAB);//one tab to another tap
		                                               //only this line is not working
		driver.get("https://www.opencart.com/");
			
	    driver.manage().window().maximize();
		
        
	}

}

             //working ............//