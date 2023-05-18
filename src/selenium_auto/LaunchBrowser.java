package selenium_auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");//browser launch
		//ChromeDriver driver = new ChromeDriver();
		
	    WebDriver driver =new ChromeDriver();//use for browser launch
	    
	   // driver.get("https://demo.automationtesting.in/Register.html");
	    
	    driver.get("https://www.nopcommerce.com/en/demo");
	    
		driver.manage().window().maximize();
	    
		//*****Using webdrivermanager****///pom.xml(we have to add as a file )
		
	/*	WebDriverManager.chromedriver().setup();//directly launched without using path 
		
		WebDriver driver = new ChromeDriver();		*/
		
		System.out.println(driver.getTitle());//output===>store demo-nopCommerce
		
		
		System.out.println(driver.getCurrentUrl());//output===>https://www.nopcommerce.com/en/demo
		
		System.out.println(driver.getPageSource());//output====>getting source code 
     
	}

}
