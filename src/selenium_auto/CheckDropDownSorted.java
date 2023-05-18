package selenium_auto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownSorted {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div/header/div/nav/ul/li[2]/a")).click();//live posting link
		
		WebElement drpElement=driver.findElement(By.name("category_id"));//working(imp)path
		
		Select drpselect= new Select(drpElement);
		
		List<WebElement> options=drpselect.getOptions();//copy option below two different list(capture all option from drop down)
		//stored the option in two different array list we are not storing the exactly option (we capturing the text value of options we storing text valueboth array list) 
		
		
		ArrayList originallist = new ArrayList();//original list keep aside
		
		ArrayList templist = new ArrayList();//sorting the templist
		
		for(WebElement option:options) {//from options read each individual option and stored that into option variable(which hold single element)
			
			originallist.add(option.getText());//capturing the text value and stored in originallist (in above array list)
			templist.add(option.getText());///capturing the text value and stored in templist
			
		}
		
		System.out.println("Original List  :+originallist");
		
		System.out.println("Temp List  :+templist");
		
		Collections.sort(templist);//collection is a predefined class(sort the collection objects)//(sort is a dirct method collecton)
		
		
        System.out.println("Original List After sorting  :+originallist");
		
		System.out.println("Temp List After sorting  :+templist");//sorting templist here{templist compare with original list}
		
		
		if (originallist.equals(templist)) {
			
			System.out.println("DropDown Sorted..");
		}
		
		else {
			
			System.out.println("DropDown Unsorted..");
		}
		
		
		driver.close();
		
		
		
	}

}
