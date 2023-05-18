package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseDragAndDropAction {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
						
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
					
	driver.manage().window().maximize();
	
	WebElement src_rome=driver.findElement(By.xpath("//div[@id='box6']"));
	
	WebElement targt_italy=driver.findElement(By.xpath("//div[@id='box106']"));
	
	Actions act =new Actions(driver);
	act.dragAndDrop(src_rome, targt_italy).perform();//pass source and target element
	                                        //drag and drop performed
	
	
	
	
	
	
	}

}
