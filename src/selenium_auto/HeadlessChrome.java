package selenium_auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();//by adding this property the browser is headless
		
		//1.approach:
		//options.setHeadless(true);///by adding this property the browser is headless
		                     //this method do is our chrome browser is headless
		                   //that case u do not see any url
		
		                //OR//
		
		//2.approach:
		///by adding this property the browser is headless
       //this method do is our chrome browser is headless
       //that case u do not see any url
		options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);//pass the option then it will become headless
		
		driver.get("https://demo.nopcommerce.com/");//backend it will launched BROWSER and open the url 
		
		System.out.println("Title to the page:"+driver.getTitle());
		
		//System.out.println("URL of the page:" +driver.getCurrentUrl());	
	

}
}
