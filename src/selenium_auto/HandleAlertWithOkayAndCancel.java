package selenium_auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertWithOkayAndCancel {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
					
    driver.get("https://demo.automationtesting.in/Alerts.html");
	     	
    driver.manage().window().maximize();	
			
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();	
		
    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    
    //create alert object to store variable:using this we print the text
    
    Alert alt = driver.switchTo().alert();
    
    String altTxt = alt.getText();
   
     alt.accept();//click on okay button
     // alt.dismiss();
      
    System.out.println(altTxt);
    
   String labelText=driver.findElement(By.xpath("//p[@id='demo']")).getText();//using this method we write condition
                                                                       //if()....else condition used
   if(labelText.contains("Ok"))
   {
	   System.out.println("We clicked on OK button");
   }	   
   else
   {
	   System.out.println("We clicked on Cancel button");
	   
   }   
    
        
                  //working//
	}

}