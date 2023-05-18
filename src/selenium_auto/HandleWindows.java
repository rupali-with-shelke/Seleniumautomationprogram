package selenium_auto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
				
	driver.get("https://demo.automationtesting.in/Windows.html");
	
	driver.manage().window().maximize();
	
	String pwh=driver.getWindowHandle();//alphanumeric id
	//723D7AA0C556E7C3643A4B1D5A5A07F0->parent window
	
	System.out.println(pwh);
	
	driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
	   
	  Set<String> windows=driver.getWindowHandles();
	  //723D7AA0C556E7C3643A4B1D5A5A07F0->parent window
	  //B723E8C989D0C8B89E2F725572CEFDE4->child window
	  //1
	 /* for(String win :windows )
	  {
		  System.out.println(win);//printing windows id
		  
	  }*/
	  
	  
	  //2.
	  for(String win :windows)
	  {
		  if(!win.equals(pwh)) {
			  
			  driver.switchTo().window(win);//child window
			                                //child window id:8E7D476FD85B0FB9A2AA8E0EADF06167
		  }
		  	  
	  }
	  
	  
	driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	
	
	}

}
