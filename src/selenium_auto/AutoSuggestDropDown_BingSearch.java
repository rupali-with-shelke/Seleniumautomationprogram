package selenium_auto;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown_BingSearch {

	
	public static void main(String[] args) throws InterruptedException {
			
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
     
	WebDriver driver = new ChromeDriver();
	
	//driver.manage().timeouts().implicitlyWait(10,"");//NOT RESOLVED//When i put implict wait their is not dealyed
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10);//Size of Auto Suggestion  :8===>it gives 
	
	Thread.sleep(3000);
	
    driver.get("https://www.bing.com/");
    
    driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Selenium");
	
	List <WebElement> list=driver.findElements(By.xpath("//li[@role='option']//span"));//
	
	System.out.println("Size of Auto Suggestion  :"+ list.size());//Size of Auto Suggestion :0(option consist of according to the options)
    //Reason:it take some fraction of second of time as soon as u provide some text here immediately wiil not get it 
	//some time to get this value to server(so for this we use wait or implictly wait) 

	//Among this option i select one of the options so for that i do is first read 
	//individual option value then compare that expected value then selected for that we 
	//write loop satement and write logics:
	
	for(WebElement lisitem:list) {//from this list i read indivdual text from listitems
		
	if(lisitem.getText().contains("toolsqa"))
	{
		
		lisitem.click();
		break;
	}
		
		
		
	}
	
	      //code completed bt download section not open so work on it//g
	
	
	
	
	}
	
	
    }
	

