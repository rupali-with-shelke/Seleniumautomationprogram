package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandleActionVsActions {

   public static void main(String[] args) {
  	
   System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
   WebDriver driver = new ChromeDriver();
			
   driver.get("http://automationpractice.pl/index.php");                                    
		
   driver.manage().window().maximize();
   
  WebElement features= driver.findElement(By.xpath("//a[@title='Women']"));
   
  Actions act = new   Actions(driver) ; //want to perform mouse over action on feature element 
                                        //so we write instances of actions class
                                    //actions is a class which contain different type of method
   //act.moveToElement(features).perform();//this statement perform mouse over actions
   //notes:===>instead of perform() we write build command
  // act.moveToElement(features).build().perform();
   
  Action action=act.moveToElement(features).build(); //it is interface the variable action stored in action
  action.perform();                                             // the action return by the build
   
   
   
   
   
   
   
   
   
   
		

	}

}
