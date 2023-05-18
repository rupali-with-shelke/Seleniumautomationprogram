
package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragAndDropS02 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
									
	driver.get("https://jqueryui.com/droppable/");
								
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);//pass index becz here 1 frame thats why
	
	WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement targt=driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act=new Actions(driver);
	//act.clickAndHold(src).release(targt).build().perform();
	//act.dragAndDrop(src, targt).build().perform();
	act.dragAndDrop(src, targt).perform();
	}

}
