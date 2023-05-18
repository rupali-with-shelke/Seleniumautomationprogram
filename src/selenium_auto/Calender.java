package selenium_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome.driver\\112 version chrome\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		String year="2023";
		String mnth="July";
		String date="19";
		
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();//open the date picker
		
		while(true) {
			
			String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String arr[] = monthyear.split("  ");
			String mon=arr[0];
			String yr=arr[1];
			
		//if(mon.equalsIgnoreCase(months) && yr.equals(year)) {
				break;
				
				
			}
		
			//working
		}
		
		
		
		
		
		
		
        	}
        	
        	
        	
        	 
         
         
         
	


