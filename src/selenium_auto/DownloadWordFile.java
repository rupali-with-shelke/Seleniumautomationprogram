package selenium_auto;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadWordFile {
	
	public static void main(String[] args) {
		
	String location=System.getProperty("user.dir")+"\\Downloads\\";	//user.dir:return current working project
		                                                            //this is actual location i want to download the files
	//worlddocfile download:	
	//chrome===>:set the location have to create browser settings for chrome	
		
	//1.we create hashmap:to stored different preference using hashmap but currently i stored one preferences
	
		HashMap preferences=new HashMap();//create hashmap
		preferences.put("download.default_directory",location);//set preference in hashmap ie download.default_directory where we pass the location we download the files
		
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs",preferences );//by using this option we set the chrome option
		
	
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver(option);//pass the option while creating driver instance here(if we not pass the option this preference is not applicable for the browser)
			
	driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
			
	driver.manage().window().maximize();
		
    driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div[2]/div/div/table/tbody/tr[1]/td[5]/a")).click();
    
    
    
	}

}
