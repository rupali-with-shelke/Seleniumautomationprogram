package selenium_auto;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartAmazonSwitchToWindow {

	public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver","");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.manage().deleteAllCookies();
     
     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung s22");
     driver.findElement(By.xpath("nav-search-submit-button")).click();
     driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
     
     
     
     Set<String> stored =driver.getWindowHandles();
     ArrayList ar = new  ArrayList(stored);
     System.out.println(ar.get(0));
     System.out.println(ar.get(1));
   //  driver.switchTo().window((String).ar.get[1]);
     driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	}
       
}
