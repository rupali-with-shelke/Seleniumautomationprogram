package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("Selenium");
	
	Thread.sleep(3000);
	
	List <WebElement> GoogleSearchResult=driver.findElements(By.className("sbct"));
	
	
	int eleSize =GoogleSearchResult.size();
	System.out.println(eleSize);
	for(int i =0;i<eleSize;i++) {
		
		String value =GoogleSearchResult.get(i).getText();
	}
	
		}

}
                  
