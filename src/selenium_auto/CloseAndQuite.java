package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuite {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
    WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Windows.html");
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
	driver.manage().window().maximize();
	
	driver.getCurrentUrl();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
	
	Thread.sleep(5000);
	//driver.close();//close only one window(if two window in same side then previous windows is close)
	//CLOSE CURRENT WINDOW(BROWSER=WINDOW)
	driver.quit();	//QUITE COMMAND CLOSES MILTIPLE WINDOW

	}
	
	}


