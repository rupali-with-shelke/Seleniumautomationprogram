package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTagName {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	//1.No of links checks
	
	  int linkTotal=driver.findElements(By.tagName("a")).size();
	
	System.out.println(linkTotal);
	//Output===>>363
	
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	int linkcheck= links.size();	
	System.out.println(links);
		
		for(int i=0;i<linkcheck;i++) {
			
			//String linkText=links.get(i).getText();
			String linkText=links.get(i).getAttribute("href");
			
			System.out.println(linkText);
			
		}
		
	}  

}