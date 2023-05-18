package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownGoogleSearch {

	public static void main(String[] args) throws InterruptedException {

   System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
   WebDriver driver = new ChromeDriver();
		
   driver.get("https://www.google.com/");
		
   driver.manage().window().maximize();
   
   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
   
   Thread.sleep(3000);
   
   List<WebElement> searchResult = driver.findElements(By.xpath("//li[@class='sbct']"));
   
   //int NumberOfElement=searchResult.size();//using this method we declared the size of element
   
   //System.out.println(NumberOfElement);//print this size()
   
   
   for(WebElement ele :searchResult ) {//using this method we find all drop down list element
	   
	   String element =  ele.getText();
	   System.out.println(element);
   }
   
   for(WebElement ele :searchResult )//webelement-10:using this method we find selected list element
   {
	String element =  ele.getText();
	System.out.println(element);
	if(element.equals("selenium tutorial")){
		
		ele.click();
        break;
	}   
	   
	   
   }
	   	   
	}

}
