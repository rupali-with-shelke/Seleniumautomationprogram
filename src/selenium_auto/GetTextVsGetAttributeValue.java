package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttributeValue {
	  
	public static void main(String[] args) {  
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");//admin area demo
		
		WebElement emailinputbox=driver.findElement(By.xpath("id=\"Email"));
		
		emailinputbox.clear();
		
		emailinputbox.sendKeys("admin234@gamil.com");
		
		
		//Capturing text from inputbox
		
		System.out.println("Result from get attribute() method  :"+ emailinputbox.getAttribute("value"));//output in console Result from get attribute() method :admin@yourstore.com 
		
		System.out.println("Result from get getText() method  :"+ emailinputbox.getText());
		
		
		//login button use:getAttribute() and getTest() method
		
		
	    WebElement button= driver.findElement(By.xpath("button-1 login-button"));
	    
	    System.out.println(button.getAttribute("type"));//Output===>submit
		
	    System.out.println(button.getAttribute("class"));//Output===>button-1 login-button
		
	    System.out.println(button.getText());// inner text////Output===> log-in
	    
	    String title=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();//stored the value in string tiltle
	     
	    System.out.println(title);//to capture the inner text of the elements//Output===>admin area demo
	    
	     
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
