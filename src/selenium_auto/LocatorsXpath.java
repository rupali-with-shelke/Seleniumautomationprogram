package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
			
	 driver.get("https://demo.automationtesting.in/Register.html");
	 
	 driver.manage().window().maximize();
	
	 //xpath:
	 
	//1.Absolute xpath:
	 
	// driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("elon");
	//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("musk");	
	//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("pune");	
			
	//2.relative xpath:	
	 
	 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Elon");
	 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Musk");
	 driver.findElement(By.cssSelector("[ng-model=\"Adress\"]")).sendKeys("Hyderabad");
     
	 
	 
	 
	}

}
