package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropImages {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
							
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
						
	driver.manage().window().maximize();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	         //when we dont find id and name as a frame the used webelement of frame and pass
	          //the path of the frame of webelment
	
	WebElement src_img1=driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]"));
	
	WebElement src_img2=driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]"));
	
	WebElement targt_img=driver.findElement(By.xpath("//div[@id='trash']"));
	
	Actions act=new Actions(driver);
	
	//moved both the imgs(1,2)into targt element
	act.dragAndDrop(src_img1, targt_img).perform();
	act.dragAndDrop(src_img2, targt_img).perform();
	
	
	
	

	
	
	
	
	}

}
