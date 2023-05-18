package selenium_auto;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://demo.automationtesting.in/Index.html");
	
	driver.manage().window().maximize();
		
     //1.full page screenshot:
	
	 /* TakesScreenshot ts=(TakesScreenshot)driver;
	  File src=ts.getScreenshotAs(OutputType.FILE);//capture the screen shot and save screenshot some where memory(location exactly dont know)
	  File target=new File(".\\screenshot\\homepage.png");//our own location it will be stored
	  
	  //FileUtils.copyFile(src,target);
	   Files.copy(src, target);*/
	 
	  //2.capture section of page/screenshot of section: 
	
	 /*WebElement section= driver.findElement(By.xpath("//img[@id=\'logo\']"));
	 File src=section.getScreenshotAs(OutputType.FILE);//capture the screen shot and save screenshot some where memory(location exactly dont know)
	 File target=new File(".\\screenshot\\logo.png");//our own location it will be stored
	 //FileUtils.copyFile(src,target);
	 Files.copy(src, target);*/
	   
	 //3.Screenshot element on a page:
	 
	 WebElement ele= driver.findElement(By.xpath("//img[@id='enterimg']"));
	 File src=ele.getScreenshotAs(OutputType.FILE);//capture the screen shot and save screenshot some where memory(location exactly dont know)
	 File target=new File(".\\screenshot\\Arrowlogo.png");//our own location it will be stored
	 //FileUtils.copyFile(src,target);
	 Files.copy(src, target);
	 driver.close();  
	}
          
}
                  