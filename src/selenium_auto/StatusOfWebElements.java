package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElements {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
      
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://demo.nopcommerce.com/register");
      
      driver.manage().window().maximize();
      
      //isDisplayed() or isEnabled()
      
     WebElement searchStore=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));//this particular element stored in variable(return the webelement so retrun type should be wedelement)
      
     System.out.println("Display Status   :"  +searchStore.isDisplayed());//true is accepted output
    
     System.out.println("Enabled Status   :"  +searchStore.isEnabled());//true is accepted output
    
    //isSelected
    
    WebElement male= driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
    WebElement female= driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
    
    
    System.out.println(male.isSelected());//false

    System.out.println(female.isSelected());//false
    
    male.click();//select male radio button 
    
    //Once select again checking the status of  both radio button
    
    System.out.println(male.isSelected());//true

    System.out.println(female.isSelected());//false
    
    
    female.click();//select female radio button
    
    System.out.println(male.isSelected());//false

    System.out.println(female.isSelected());//true 
    
      
	}


	}


//Output of this pogram is:

/*Display status: true
 Enabled status:  true
 false
 false
 

 true
false 
 
 false
 true
 
 
 
                          */





