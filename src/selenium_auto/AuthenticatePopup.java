package selenium_auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatePopup {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
			
	 //driver.get("https://the-internet.herokuapp.com/basic_auth");
	// driver.manage().window().maximize();
     
	 //syntax:
	 //https://admin:admin@the-internet.herokuapp.com/basic_auth
	 //http://user:password@URL
	 
	 //relaunching the application by passing the username and passwords
	 
	 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	 
	 
	 
	 
	 ///WORKING//
	}

}
  