package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath1 {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	//driver.get("https://demo.automationtesting.in/Register.html");//used url for text() and contain()
	
	driver.get("https://www.facebook.com/login/");//for satrat-with and end-with method
	
	driver.manage().window().maximize();
	
	//1.text():tagname[text(),'value']
	
	/*String data=driver.findElement(By.xpath("//h2[text()='Register']")).getText();	
	
	System.out.println("print the text  :"+data);*/
	
	//2.contains:1.tagname[contains test(),'value']	
	//2.contains:2.tagname[contains(@attribute,'value')]
	
	//1.
	/*if(data.contains("Register")) {
		
		System.out.println("we are redirected on the register page");
		
	}*/
	
	/*String data1=driver.findElement(By.xpath("//input[contains(@ng-model,'Email')]")).getText();
	System.out.println("Print the text  :"+data1);*/
	
		
		
	//2.start-with:==>1.tagname[start-with(@attribute,'value')]
	                 //2.tagname[starts-with(text(),'value')]
	
	driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[2]")).click();
	
	//start- with:
	driver.findElement(By.xpath("//input[starts-with(@id,'u_0_b_')]")).sendKeys("ELON");
	
	//using Contains:contains:1.tagname[contains test(),'value']	
	//2.tagname[contains(@attribute,'value')]
	
	driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Musk");//2 method used of contains
	
	
	
	
	
 }
		
		
		
}	
		



