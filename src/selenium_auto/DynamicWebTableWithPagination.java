package selenium_auto;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableWithPagination {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
														
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://demo.opencart.com/admin/index.php");
	
	driver.manage().window().maximize();
	
	//login:
	
	driver.findElement(By.id("input-username")).sendKeys("demo");
	driver.findElement(By.id("input-password")).sendKeys("demo");
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	
	String pwh=driver.getWindowHandle();
	System.out.println(pwh);
	Set<String> page1= driver.getWindowHandles();
	for(String win :page1) 
	{
		
		if(!win.equals(pwh)) 
		{
			
			 driver.switchTo().window(win);
			
		}		
	}
	
	driver.findElement(By.xpath("//button[@class='btn-close']")).click();

	//sales===>orders:
	
	driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
	driver.findElement(By.xpath("//a[text()='Orders']")).click();
	
	//Table:
	//1.Find out total no of pages in table:
	
	String txt=driver.findElement(By.xpath("//div[text()='Showing 1 to 10 of 123 (13 Pages)']")).getText();
	System.out.println(txt);
	
	int total_pages=Integer.valueOf(txt.substring(txt.indexOf("(")+1, txt.indexOf("pages")-1));
	         //capture the value of (13 pages)
	
	System.out.println("Total number of pages   :"+total_pages);
	
	
	         //working//
	
	
	
	
	}

	private static String substring(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
