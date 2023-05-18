package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFormFilling {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.manage().window().maximize();
	
	//1.Adding Name:
	
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("RUPALI");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("SHELKE");
	
	//2.Adding Address:
	
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("PUNE");
	
	//3.Adding EmailAddress:
	
	driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("admin@123");
	
	//4.Adding Phone Number:
	
	driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567890");
	
	//5.Select Gender:*
	
	Boolean radiobutton =driver.findElement(By.xpath("//input[@value='FeMale']")).isSelected();
	if(radiobutton==false){
		
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		System.out.println("Male radio button is not selected   :"+"True");
		
	}
	
	//6.Select Hobbies:
	
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement ele:checkbox)
	{
		if(ele.getAttribute("value").equals("Movies") || ele.getAttribute("value").equals("Hockey")) 
		{
			ele.click();
		}
		
	}
	
	//7.Languages:
	
	
	//8.Select Skills:Using Static DropDown:

	WebElement drpdown=driver.findElement(By.xpath("//select[@id='Skills']"));
	
	Select sel = new Select(drpdown);
	
	//sel.selectByIndex(50);
	 sel.selectByValue("MySQL");
	//sel.selectByVisibleText("MySQL");

	 
	 //9.Select Country:
	 
	 driver.findElement(By.xpath("//span[@role='combobox']")).click();
	 List<WebElement> SelectCountry=driver.findElements(By.xpath("//li[@role='treeitem']"));
	 
	// int NumberOfElement=SelectCountry.size();//using this method we find size of all element
	   
     // System.out.println(NumberOfElement); //
     
   for(WebElement ele :SelectCountry ) {//using this method we find all country list name
	   
	   String element =  ele.getText();
	   System.out.println(element);
     }

   
   for(WebElement ele :SelectCountry )//webelement-11:using this method we find selected country name
   {
	String element =  ele.getText();
	System.out.println(element);
	if(element.contains("India")) {
		
		ele.click();
     break;
	}   
	   
	   
} 

	 //10.Select Date Of Birth:
	 //1.Year
	WebElement yeardropdown=driver.findElement(By.xpath("//select[@placeholder='Year']"));
		
	Select sel1 = new Select(yeardropdown);
		
	sel1.selectByVisibleText("1995");
	
	//2.Month
	 WebElement monthdropdown=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	
	Select sel2 = new Select(monthdropdown);
		
	sel2.selectByVisibleText("January");
	
	//3.Day
	
    WebElement daydropdown=driver.findElement(By.xpath("//select[@placeholder='Day']"));
	
    Select sel3 = new Select(daydropdown);
		
	sel3.selectByValue("1");
	
	//11.Enter Password:
	
	driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("admin@321");
	
	//12.Confirm Password:
	
	driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("admin@321");
	
	//13.Submit Form:
	
	driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	
	driver.close();
	
	}

}
