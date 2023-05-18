package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectCountryUsingDynamicMethod {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//span[@role='combobox']")).click();
        
        
   List<WebElement> SelectCountry=driver.findElements(By.xpath("//li[@role='treeitem']"));
        
        // int NumberOfElement=SelectCountry.size();//using this method we find size of all element
   
        // System.out.println(NumberOfElement); //print this size 
        
   for(WebElement ele :SelectCountry ) {//using this method we find all country list name
	   
	   String element =  ele.getText();
	   System.out.println(element);
   }
   
      
   for(WebElement ele :SelectCountry )//webelement-11:using this method we find selected country name
   {
	String element =  ele.getText();
	System.out.println(element);
	if(element.contains("India")) {
		
		ele.click();
        break;
	}   
	   
	   
   } 
   
   
   
   
   
   
   
   
   
   
   
	}

}
