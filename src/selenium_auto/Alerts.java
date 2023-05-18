package selenium_auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver();
			
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	
	//1.how can  handles Alert window with OKAY button:
	
	/*driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	Thread.sleep(5000);
	driver.switchTo().alert().accept();*///if we have single okay button we can directly use accept which will close the alert widows
	
    //2.how can handles Alert window with OKAY and CANEL button:
	
	/*driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	Thread.sleep(5000);
	//driver.switchTo().alert().accept();//close alert by using ok button(accept means okay)
	driver.switchTo().alert().dismiss();//close alert by using cancel button(dismiss means cancel)*/
	
	//3.how to handle alert window with input box,capturing text
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	Thread.sleep(5000);
	Alert alertwindow=driver.switchTo().alert();
	System.out.println("The message displayed on alert  :"+alertwindow.getText());
	alertwindow.sendKeys("WELCOME TO ALERT");
	Thread.sleep(5000);
	
	}

}
