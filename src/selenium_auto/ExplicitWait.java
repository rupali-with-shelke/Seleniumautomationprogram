package selenium_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
    ChromeDriver driver = new ChromeDriver();
    
  
  	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    //reason:
    
    
    driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
   
   //for remove button functionality:
  	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
  	
  	//we have to not give thread.sleep becz we here declared the implicit wait
  	//after the browser launching
  	//add functionality used :add button is taking suppose 60-70 seconds to load on dom:
  	
    //explicitly wait:
    
    WebDriverWait wait = new WebDriverWait(driver,50);//create webdriver instance
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add']")));
    driver.findElement(By.xpath("//button[text()='Add']")).click();
    
    System.out.println("Test case is pass   :");
  	
  		

	}

}
