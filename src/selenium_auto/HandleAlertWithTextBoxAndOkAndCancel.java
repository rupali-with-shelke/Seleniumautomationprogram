package selenium_auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertWithTextBoxAndOkAndCancel {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
    WebDriver driver = new ChromeDriver();
				
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	
	Alert alt = driver.switchTo().alert();
	
	alt.sendKeys("SpeedWay");
	//alt.accept();//when we click on ok some message shown alertwindow

	alt.dismiss();//when we click on dismiss no message shown in alertwindow
	}

}
