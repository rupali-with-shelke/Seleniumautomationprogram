package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
	
  System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
  WebDriver driver = new ChromeDriver();
			
  driver.get("https://demo.automationtesting.in/Register.html");
  
  driver.manage().window().maximize();
  
  WebElement StaticDropdown=driver.findElement(By.xpath("//select[@id='Skills']"));
  
  Select sel = new Select(StaticDropdown);
  
  //sel.selectByIndex(10);
  //sel.selectByValue("C++");
  sel.selectByVisibleText("C++");
  

	}

}
