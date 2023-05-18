package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickAction {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
			
    WebDriver driver = new ChromeDriver();
					
    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
				
    driver.manage().window().maximize();	
		
	driver.switchTo().frame("iframeResult")	;
	
	//1.driver.findElement(By.xpath("//input[@id='field1']")).clear();
	
	//1.driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("Welcome to selenium");	
	
	//or create webelement and stored the value in variable in field1 in below method we used
	//here we below method used or above method used bt we seperately performed action 
	//bt in below method we perform action and stored in variable
	
	
	WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
	field1.clear();
	field1.sendKeys("Welcome to selenium");
	
	WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	
	Actions act = new Actions(driver);
	act.doubleClick(button).perform();//dubled click on button copy text
	            //and same text whatever pass in text field first after
	          //doubled click it will pass on second filed the same text
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
