package selenium_auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopupNotification {

	public static void main(String[] args) {
		
	ChromeOptions option = new ChromeOptions();
	
	option.addArguments("--disable-notifications");
		
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver(option);//option variable pass at the time of chromedriver creation(only this application(chomroption/option.addargument) is aplicable for this )
			
	driver.get("https://brandequity.economictimes.indiatimes.com/");
	
	driver.manage().window().maximize();

	}

}
                