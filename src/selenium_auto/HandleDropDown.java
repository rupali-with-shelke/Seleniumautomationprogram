package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formstone.it/components/dropdown/demo/");//using this driver instance launched the application(dropdown demo site=====>>https://formstone.it/components/dropdown/demo/)
		
		driver.manage().window().maximize();
		
		WebElement dropCountryEle=driver.findElement(By.xpath("//*[@id=\'demo_basic_2-dropdown-selected\']"));//passing locators
		
		 Select dropCountry=new Select(dropCountryEle);	//create constuctor here//there is muliple option and we need to select so we create constructors(along with ref. variable)
		 
		 //1.Using select method:
		 
		 //dropCountry.selectByVisibleText("Washington");//select output as washinton(1)
		 
		// dropCountry.selectByValue("WA");//Select the washington(pass value by html)(2)
		 
		 //dropCountry.selectByIndex(48);//because index count from zeros//Output===>Washinton(3)
		 
		 
		 //2.Without using selector method we use dropdown method:=====>Selecting from without using method
		 
		 
		/*List<WebElement> alloptions= dropCountry.getOptions();//For one drop down we used this method(if in page multiple dropdown this method is not required)
		
		 for(WebElement option:alloptions) {
			 
			if( option.getText().equals("California"));	
			{
			option.click();
			break;
			}
		 }*/
		 
		 
		 //HANDLE MULTIPLE DROPDOWN USING GENERIC METHOD:
		 // (Its lengthy appraoch)
		 
		Select BasicLabel=new Select( driver.findElement(By.id("demo_basic-dropdown-selected")));//path not proper
		BasicLabel.selectByVisibleText("Two");
		 
		 Select OptionGroupLabel =new Select(driver.findElement(By.id("demo_groups-dropdown-selected")));
		 OptionGroupLabel.selectByVisibleText("Ten");
		 
		 Select CoverLabel  =new Select(driver.findElement(By.id("demo_cover-dropdown-selected")));
		 CoverLabel.selectByVisibleText("Three");
		 
		
	}
}
	
	
	  //path problem working
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


