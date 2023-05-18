package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJQueryDropDown {

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
	
	//driver.manage().timeouts().implicitlyWait(Durations.ofSafeNanos(10));
			
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
			
	 driver.manage().window().maximize();//maximize page
		 
		 
	 driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		 
	//selectChoiceValues(driver,"choice 1");//select only single values
	
	//selectChoiceValues(driver,"choice 2","choice 2 3","choice 6","choice 6 2");//select multiple values
	 
	selectChoiceValues(driver,"all"); //select all values//smth pass upper case parameters so all combination is fine
	 
	}
	
	
	public static void selectChoiceValues(WebDriver driver,String... value) {
		
	List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	
	if(!value[0].equalsIgnoreCase("all"))
	{
		for(WebElement item:choiceList) {
			
		String text=item.getText();
		
		for(String val:value){//compare text with list of items
			
		if(text.equals(val)){
			
			item.click();
			break;
		}
     }
   }
	
	
}
	else
	{
		try
		{
		for(WebElement item:choiceList) {
			
			item.click();
		}
		}
		catch(Exception e)
		{
			
			
		}
	}
	
	}
	
	
	         
	
	
	
	
	
	
	
	
	
	
	

}
