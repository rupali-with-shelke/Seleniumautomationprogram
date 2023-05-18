package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://demo.nopcommerce.com/");
			
    driver.manage().window().maximize();
    
   String tab= Keys.chord(Keys.CONTROL,Keys.RETURN);//using this method open browser in new tab//instead of storing hole think in variable 
                                                      //dirctly specify the hole think in sendkeys 
   driver.findElement(By.linkText("Register")).sendKeys(tab);	//instead of performing direct action we performed send keys
		
	}

}
