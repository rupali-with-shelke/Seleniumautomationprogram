package selenium_auto;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadPdfFile {

	public static void main(String[] args) {
		
		String location=System.getProperty("user.dir")+"\\Downloads\\";	
		
		//chrome:
		HashMap preferences=new HashMap();//create hashmap
		
		preferences.put("plugins.always_open_pdf_externally",true);//by default this property false in browser level and we have to make this property //true
		                                                        //for pdf download(addition parameter add here for pdf and rest of them are same like doc files)
		                                                        //instaed of open the docment in view mode on the browser we diectly into the files where it will download again in download sections
		preferences.put("download.default_directory",location);//
		
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs",preferences );
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);//pass the option while creating driver instance here(if we not pass the option this preference is not applicable for the browser)
				
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
				
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a")).click();//this should download the pdf files
		
		
		
		
		
		
		
		
	}

}
