package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionMultipleKeys {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://text-compare.com/");
	
	driver.manage().window().maximize();
		
     WebElement input1=driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
     
     WebElement input2=driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
     
     input1.sendKeys("welcome to selenium");
     
     Actions act = new Actions(driver);
     
     //control+A
     act.keyDown(Keys.CONTROL);//
     act.sendKeys("a");//value selected
     act.keyUp(Keys.CONTROL);//keys.control
     act.perform();//action perform
     
     //control+c
     act.keyDown(Keys.CONTROL);//
     act.sendKeys("c");//value selected
     act.keyUp(Keys.CONTROL);//keys.control
     act.perform();//action perform
     
     //tap key===>shift to the second box:
     act.sendKeys(Keys.TAB);
     act.perform();
     
     //control+v
     act.keyDown(Keys.CONTROL);//
     act.sendKeys("v");//value selected
     act.keyUp(Keys.CONTROL);//keys.control
     act.perform();//action perform
     
     //compare text
     if(input1.getAttribute("value").equals(input2.getAttribute("value")))
    	 
    	 System.out.println("Text copied");
     else
          System.out.println("Text not copied");
       
	}

}       
