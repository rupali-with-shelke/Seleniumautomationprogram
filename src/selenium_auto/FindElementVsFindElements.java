package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//findElement()(Single WebElement)=====> Return the Single WebElements
		
		
		//1. SECNARIOS
		WebElement searchbox=driver.findElement(By.xpath("id=\"small-searchterms\""));//type of variable should be webelement(this path stored in searchbox(lacator means path and also find single element))
		
		searchbox.sendKeys("ABC");
		
        
		//2.findElement()(Multiple webElement)=====> Return the First Elements
		
		WebElement ele=driver.findElement(By.xpath("/html/body/div[6]/div[4]//a"));//locators finding multiple multiple  WebElement(finally it return only one single elements which element return only one single element returns)
		//ele====>some elements
		
		System.out.println(ele.getText());
		
		//(output:sitemap display here)
		
		//3.element not present==>
		
		//WebElement searchbutton1=driver.findElement(By.xpath("class=\"button-1 search-box-button\""));//this path present in page
		
		WebElement searchbutton=driver.findElement(By.xpath("class=\"button-1 login-box-button\""));//instead of search button we write login(currently this path is not currently present in the page)
		
		
		//Output no such exception found(unable to locate element)
		
		
		//Now use findElements()====>and where we used(returns multiple web element depends upon the locators)
		
		List<WebElement>links=driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
		
		System.out.println("Number of element captured   :"+links.size());//how many element caputure through this particular element//number of element captured is 22
		
		
		//1.Muliple links are their(i want to perform each and every webelement actions)then we write lopping statement
		
		for(WebElement ele1:links) {//by using this lopping statement
			
			
			System.out.println(ele1.getText());
		}
		
	
		
		//2.Finding single elements
		
		List<WebElement> logo =driver.findElements(By.xpath("alt=\"nopCommerce demo store\""));
		System.out.println(logo.size());//gives single webelement (output:===>1)
		
		
		//3.findElements no element are found then===>0 will be written
		
		
		List<WebElement>element=driver.findElements(By.xpath("//(img(contains(title,'Electonics')]"));
		System.out.println(element.size());//output===>0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
