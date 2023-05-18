package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		/*driver.findElement(By.name("email")).sendKeys("rupali19shelke@gmail.com");
		 driver.findElement(By.name("pass")).sendKeys("vianshu@rock");
		 driver.findElement(By.name("login")).click();*/
	   WebElement type1= driver.findElement(By.name("email"));
	   Thread.sleep(5000);
	   type1.click();
	   Thread.sleep(3000);
	   type1.sendKeys("rupalishelke19@gmail.com");
	   Thread.sleep(3000);
	   type1.clear();
	   Thread.sleep(3000);
	   type1.sendKeys("rupali19shelke@gmail.com");
	   
	   WebElement type2 = driver.findElement(By.name("pass"));
	   Thread.sleep(5000);
	   type2.click();
	   Thread.sleep(3000);
	   type2.sendKeys("viansh@1993");
	   Thread.sleep(3000);
	   type2.clear();
	   Thread.sleep(5000);
	   type2.sendKeys("vianshu@rock");
	   
	   String title = driver.getTitle();//print title
	   System.out.println(title);//print title
	   if(title.contains("Log in"))
	   {
		   System.out.println("we are on facebook login page");
	   }
	   
	   //System.out.println(driver.getTitle());//perform two action in one single steps
	}

}
