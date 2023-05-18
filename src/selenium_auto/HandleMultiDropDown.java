package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultiDropDown {
	
	static WebDriver driver;//because main is static method that why we defined here static method

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	 driver = new ChromeDriver();
		
     driver.get("https://formstone.it/components/dropdown/demo/");//using this driver instance launched the application(dropdown demo site=====>>https://formstone.it/components/dropdown/demo/)
		
		
		
  // Generic method:used for multiple dropdown
	 
     WebElement BasicLabelele= driver.findElement(By.id("BasicLabel"));
     selectoptionfromdropdown(BasicLabelele,"Two");
     
     WebElement  OptionGroupLabelele= driver.findElement(By.id(" OptionGroupLabel"));
     selectoptionfromdropdown(OptionGroupLabelele,"Ten");
	 
     WebElement CountryLabelele= driver.findElement(By.id("CountryLabel1"));
     selectoptionfromdropdown(CountryLabelele,"Three");
	 	 
	 
}
//calling user defined methods multiple times whenever we want to select option from dropdown(this approach is very useful when we have multiple dropdown in page)
public static  void selectoptionfromdropdown(WebElement ele,String value)//here declare static main method

{
	Select drp = new Select(ele);		
	List<WebElement> alloptions= drp.getOptions();//For one drop down we used this method(if in page multiple dropdown this method is not required)
	
	 for(WebElement option:alloptions) {
		 
		if( option.getText().equals("value"));	
		{
		option.click();
		break;
		}
		
	 }
	 	 
	}
}


