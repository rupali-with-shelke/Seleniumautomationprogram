package selenium_auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertWithOkayAndText {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
				
    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
     	
    driver.manage().window().maximize();	
		
	driver.findElement(By.xpath("//input[@id='Register']")).click();
	
    // 1.After Click on Create My Account Alert Window Show :With OKAY and some Text:so we directly handle this type alertpopup using
	//Select.To() method:
	
	
	//driver.switchTo().alert().accept();//click on okay button
	
	
	//2.We can stored that object in variable and performed actions:to print text of alertpopup windows
	
	Alert alt =driver.switchTo().alert();
	
	String alertText =alt.getText();//get text
	
	System.out.println(alertText);
	
	if(alertText.contains("Your full name cannot be blank"))
	{
		System.out.println("TEST CASE IS PASS");
		
	}
	else
	{
		System.out.println("TEST CASE IS FAIL");
		
	}	
	
	
	
	
	
	
	
	
	}

}
