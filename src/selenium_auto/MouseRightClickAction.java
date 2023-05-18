package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	public static void main(String[] args) {
		
  System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
  WebDriver driver = new ChromeDriver();
			
  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
  driver.manage().window().maximize();	
		
  WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));	
  
  Actions act = new Actions(driver);//create instances of actions class
  
  act.contextClick(button).perform();//right click on button
  
  
  
  
  
		
	}

}
