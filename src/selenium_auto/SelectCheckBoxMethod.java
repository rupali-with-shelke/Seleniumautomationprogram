package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckBoxMethod {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
			
	 driver.get("https://demo.automationtesting.in/Register.html");
	 
	 driver.manage().window().maximize();	
		
     //1.Using Single Method we perform action on check box:
	 
	 /*driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
	 driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
	 driver.findElement(By.xpath("//input[@id='checkbox3']")).click();*/
	 
	 //2.Using for loop  we perform action on check box:select specific check box
	 
	 List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	  /*for(WebElement ele :checkbox) {

		if(ele.getAttribute("value").equals("Cricket") || ele.getAttribute("value").equals("Movies"))
		{
			ele.click();
			
		}
		 
	 }*/
	 
	 //3.Using Simple for loop:we select all check boxes
	 
	 for(int i=0;i<checkbox.size();i++) {//size==>3
		 
		 checkbox.get(i).click(); 
	 }
	 
	 
	 
	}

}
