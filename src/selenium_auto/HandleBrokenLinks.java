package selenium_auto;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		
       System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe\"C:\\chrome.driver\\112 version chrome\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		//1.All the link present in the webpage which include broken links also
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int brokenLinks=0;
		
		for(WebElement element:links) {
			
			String url = element.getAttribute("href");//href actual value==>used to send to the server and capturing in string url
			if(url==null||url.isEmpty()) {//verify url is empty or not
				
				System.out.println("url is empty");//links itself not defined in application
				continue;
			}
			URL link = new URL(url);//cpature the link in url form(convert in url formate)
			try {
				
				HttpURLConnection httpconn =(HttpURLConnection) link.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>=400) {
					
					System.out.println(httpconn.getResponseCode()+url+"   is"+"   broken link");
					brokenLinks++;
					
				}
				else {
					
					System.out.println(httpconn.getResponseCode()+url+"  is"+"  valid link");
				}
				
			} catch (Exception e) {
				
				
			}	
		}
		
		System.out.println("Number of broken links  :"+brokenLinks);//come out from for loop we print no of broken links
		driver.quit();
	}
                     
}
