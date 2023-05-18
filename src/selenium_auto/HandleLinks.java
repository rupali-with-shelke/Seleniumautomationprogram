package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {
		
  System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
  
  WebDriver driver = new ChromeDriver();
			
  driver.get("https://www.amazon.in/");
  
  driver.manage().window().maximize();
		
	 driver.findElement(By.linkText("Today's Deals")).click();	
	//driver.findElement(By.partialLinkText("Deals")).click();
	
    //1.How to capture all the links from webpage?
  
   List<WebElement> links= driver.findElements(By.tagName("a"));//common locators(get all the link from webpage)
   System.out.println("Number Of Links Present :"+links.size());
   
    //2.All the link in my console windows:
  
    //1.Normal for loop:to read all the links from this links variable
   
    /* for(int i=0;i<links.size();i++) {
    	 
    	System.out.println( links.get(i).getText());//get the value of the links
    	System.out.println(links.get(i).getAttribute("href"));
     }*/
     
   //2.second way using each for loop:
    
   for(WebElement link:links) {
	   
	   System.out.println(link.getText());
	   System.out.println(link.getAttribute("href"));
   }
   
   
   
  
  
	}

}
