package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteGooglePlaceDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
	     
		  WebDriver driver = new ChromeDriver();
		    
		  driver.get("https://www.twoplugs.com/");
		  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		  
	      WebElement searchbox = driver.findElement(By.id("autocomplete"));
	      searchbox.clear();//1.we have to clear the box(its autocomplete bydefault it is value)
	      Thread.sleep(3000);
	      searchbox.sendKeys("Toronto");//passing the search string
	      Thread.sleep(3000);
	      
	      String text;//text==>read individual value by pressing down arrow key i m taking inividual into the text
	      //for that i m using text variable here
	      do {
	    	  
	    	  searchbox.sendKeys(Keys.ARROW_DOWN);
	    	  Thread.sleep(3000);
	    	 text =searchbox.getAttribute("value");//get value from textbox()
	    	 if(text.equals("Toronto, OH, USA")){//then compare the text
	    		 searchbox.sendKeys(Keys.ENTER) ;
	    		 break;
	    	 }
	    	 Thread.sleep(3000);
	    	  
	      }while(!text.isEmpty());
		

	}

}
