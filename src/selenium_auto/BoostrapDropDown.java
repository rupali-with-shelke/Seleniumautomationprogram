package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formstone.it/components/dropdown/demo/");
		
		driver.manage().window().maximize();
		
		
		//stateType:
		driver.findElement(By.xpath("//button[@id='demo_label-dropdown-selected']")).click();//click on dropdown
		
		List<WebElement> statetype   =driver.findElements(By.xpath("//select[@name='demo_label']//option"));//capture all drop down in the list
		
		System.out.println("Number of option print   :"+statetype.size());//counted how many option their using size
		
		for(WebElement statype:statetype) {
			
			if(statype.getText().equals("Oklahoma")) {
				
				statype.click();
				break;
				
			}
		}
	
		
	}
	              

}
