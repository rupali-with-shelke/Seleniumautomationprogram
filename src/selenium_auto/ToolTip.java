package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://jqueryui.com/tooltip/");
			
	    driver.manage().window().maximize();
	    
	   //1.How to capture tooltip of the web element: 
	    
	   driver.switchTo().frame(0);
	    
	   WebElement inputbox=driver.findElement(By.xpath("//input[@id='age']"));
	   
	   String tooltiptext=inputbox.getAttribute("title");
	   
	   System.out.println(tooltiptext);
	   
	  
	   
	   
	   
	   
	   
		
	}

}
