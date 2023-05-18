package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
   WebDriver driver = new ChromeDriver();//invoke the browser
	
	driver.get("https://demo.guru99.com/test/newtours/");//Open the URL
	
	driver.findElement(By.name("userName")).sendKeys("mercury");//Enter username
	
	//WebElement username=driver.findElements(By.name("userName"));
    //username.sendKeys("mercury");
	
	driver.findElement(By.name("password")).sendKeys("mercury");//Enter password
	
	
	driver.findElement(By.name("submit")).click();//Click on submit button
	
	String exptitle="Find a Flight: Mercury Tours:";
	

	String acttitle=driver.getTitle();//Return the actual title of the page
	
	// validation
	if(exptitle.contains(acttitle))
	{
		
		System.out.println("Test is passed");
		
	}
	else
	{
		
		
	System.out.println("Test is failed");
	
	
	}
		
		
	}
                   //working//
}
