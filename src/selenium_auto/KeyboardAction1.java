package selenium_auto;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardAction1 {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://the-internet.herokuapp.com/key_presses");
	
	driver.manage().window().maximize();
	
	//perform single key option :
		
	Actions act = new Actions(driver);
	Thread.sleep(5000);
	act.sendKeys(Keys.BACK_SPACE).perform();
	Thread.sleep(3000);
	act.sendKeys(Keys.ESCAPE).perform();
	Thread.sleep(3000);
	act.sendKeys(Keys.SPACE).perform();
	Thread.sleep(5000);
	
	
	
	}

}
