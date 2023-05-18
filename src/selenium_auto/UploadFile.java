package selenium_auto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		
   System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.foundit.in/");
	
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//div[@id=\"heroSection-container\"]/div[3]/div[2]/div[2]")).click();
	
	//1.using sendkeys methods:
	//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("");//"c:\\selenium\\sample.pdf"
	
	//2.using robot class method:
	
	WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeAsyncScript("arguments[0].click()",button);//click action on the button
	
	
	//1.copy the path//2.control+v//3.enter:
	
	Robot rb = new Robot();//instance is created
	
	rb.delay(2000);//1 sec
	
	StringSelection ss= new StringSelection("");//copy the path:"c:\\selenium\\sample.pdf"
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
	//control+v
	rb.keyPress(KeyEvent.VK_CONTROL);//just pressing on control key on ur keybord
	rb.keyPress(KeyEvent.VK_V);//press on v
	rb.keyRelease(KeyEvent.VK_CONTROL);//release control
	rb.keyRelease(KeyEvent.VK_V);//release v
	
	//enter key
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	

	
	}
             //WORKING
}
