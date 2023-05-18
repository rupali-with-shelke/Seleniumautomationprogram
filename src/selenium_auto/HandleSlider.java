package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");	
		
		driver.manage().window().maximize();
		
		WebElement min_slider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		
		System.out.println("Location of min slider  :"+min_slider.getLocation());//for understanding we write statement
		                                                                  //use this statment any kind of statement of webelement not slider bt
		                                                                 //use any type of ststement//(x=59,y=250)
	   System.out.println("Height & Width of the element   :"+min_slider.getSize());//for understanding we write statement(use any type statement not slider bt used anytype of webelement)
	                                                                      //(height=21,width=21)         
	   Actions act=new Actions(driver);//action class instances
	   
	   act.dragAndDropBy(min_slider, 100, 0).perform();
		
	   System.out.println("Location of min slider  :"+min_slider.getLocation());//(x=161,y=250)
		
	   System.out.println("Height & Width of the element   :"+min_slider.getSize());//(height=21,width=21)
		
	  WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		
	  act.dragAndDropBy(max_slider, -100, 0).perform();//using perform method action will be perform so perform is mandatory
		
		
	
	}

}
