package selenium_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartAmazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		search.sendKeys("iphone13");
		
		WebElement buttonsearch=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 buttonsearch.click();
		
		 WebElement ClickIphone13site=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 ClickIphone13site.click();
		 
		
		driver.get("https://www.amazon.in/Apple-iPhone-13-Mini-512GB/dp/B09G997HJP/ref=sr_1_1?crid=SQT0PGLXXZ2T&keywords=iphone13&qid=1681809685&sprefix=iphone13%2Caps%2C1079&sr=8-1");
		
		WebElement AddToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		AddToCart.click();
	}

}
