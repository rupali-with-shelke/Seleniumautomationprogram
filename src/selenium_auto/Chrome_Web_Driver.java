package selenium_auto;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Web_Driver {

	public static void main(String[] args) {
		
  System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();

	//Difference Between ChromeDriver driver and  WebDriver driver ?
	
	//====>
	
	
	
	}

}
