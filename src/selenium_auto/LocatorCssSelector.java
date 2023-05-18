package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCssSelector {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver();
			
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	//1.Using tag name:
	/*driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("Elon");//using tagname
	driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("Musk");*///using tagname
	
	//2.Using attribute value:
	/*driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Elon");
	driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Musk");*/
	
	//3.Using id name we use css selectors===>#value
	
	driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Elon");//using attribute value
	driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Musk");//using attribute value
	driver.findElement(By.cssSelector("#submitbtn")).click();//Using id name we use css selectors===>#value
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
            
