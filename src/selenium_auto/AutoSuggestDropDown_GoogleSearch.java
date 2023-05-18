package selenium_auto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

				
      System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
	     
	  WebDriver driver = new ChromeDriver();
	    
	  driver.get("https://www.google.com/");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("q")).sendKeys("java tutorial");
	  
	  Thread.sleep(3000);
	  
	 List<WebElement> list= driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));//using the path we got 10 option bt here not get because of path
	  
	 
	 System.out.println("Size of Auto Suggestion   :"+list.size());//12 option is displayed
	 
	 for(WebElement listitem:list) {
		 
		 if(listitem.getText().contains("beginners")) //exactly value will be selected
		 {
			 
			 listitem.click();
			 break;
			 
		 }
		 		 
	   }
	}

}

