
package selenium_auto;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverActionS01_NewContact {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
								
	driver.get("https://classic.freecrm.com/index.html");
							
	driver.manage().window().maximize();	
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2016");
     
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2016");
	
	driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	
	
	driver.switchTo().frame("mainpanel");
		
	WebElement contacts=driver.findElement(By.xpath("//a[@title='Contacts']"));	
		
	//we want to perform want to perform mouse hover action on contact	
	//Actiom class for that:	
		
	Actions act =new Actions(driver);//we are creating object of action class
	//1.act.moveToElement(contacts).perform();
	
	//2.
	act.moveToElement(contacts).build().perform();	
	
	driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	
	//fill the contact:
	
	//select title:
	
	WebElement title=driver.findElement(By.xpath("//select[@name='title']"));
	
	Select sel= new Select(title);
	sel.selectByVisibleText("Miss");
	
	//First Name:
	
	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("RUPALI");
	
	//Middle Name:
	
	driver.findElement(By.xpath("//input[@id='middle_initial']")).sendKeys("VILAS");
	
	//Last Name:
	
	driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("SHELKE");
	
	//Suffix:
	
	
	//Images:
	
	
	//Nickname:
	
	driver.findElement(By.xpath("//input[@name='nickname']")).sendKeys("RUSHALI");
	
	
    //Company:
	String pwh=driver.getWindowHandle();
	driver.findElement(By.xpath("(//input[@value='Lookup'])[1]")).click();
	
	
	Set<String> windows=driver.getWindowHandles();
	
	for(String win:windows)
	{
	  if(!win.equals(pwh))
	  {
		  
		  driver.switchTo().window(win);
		  
		  //driver.findElement(By.xpath("//input[@name='search']")).sendKeys("CAPGEMINI");
		  //driver.findElement(By.xpath("//input[@type='submit']")).click();
		 // driver.findElement(By.xpath("(//td[@valign='top'])[6]")).click();
		 // driver.findElement(By.linkText("Capgemini")).click();
		  //driver.close();
		  
		  
	  }	  
		  
		  
	  }  
	 driver.findElement(By.xpath("//input[@name='search']")).sendKeys("CAPGEMINI");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 driver.findElement(By.xpath("(//td[@valign='top'])[6]")).click();
	 driver.findElement(By.linkText("Capgemini")).click();
	 driver.switchTo().window(pwh);
	 driver.switchTo().frame("mainpanel");
	 
	

	
	//Position:
	  
	driver.findElement(By.xpath("//input[@id='company_position']")).sendKeys("ASSISTANT MANAGER");
	
	
	
	//Department:
	
	driver.findElement(By.xpath("//input[@id='department']")).sendKeys("SOFTWARE TESTER");
	
	//Supervisor:
	driver.findElement(By.xpath("//input[@name='contact_lookup_sup']")).sendKeys("NIMRIT");
	//driver.findElement(By.xpath("(//input[@value='Lookup'])[2]")).click();//lookup

	//Assistant:
	driver.findElement(By.xpath("//input[@name='contact_lookup_ass']")).sendKeys("AKANSHA");
	//driver.findElement(By.xpath("(//input[@value='Lookup'])[3]")).click();//lookup
	
	//Referred By:
	driver.findElement(By.xpath("//input[@name='contact_lookup_ref']")).sendKeys("RAM");
	//driver.findElement(By.xpath("(//input[@value='Lookup'])[4]")).click();//lookup
	
	//Category:
	WebElement category=driver.findElement(By.xpath("//select[@name='category']"));
	Select sel1=new Select(category);
	sel1.selectByVisibleText("Key Contact");
	
	//Status:
	WebElement status=driver.findElement(By.xpath("//select[@name='status']"));
	Select sel2=new Select(status);
	sel2.selectByVisibleText("Inactive");
	
	//Phone Number:
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7890123456");
	
	//Mobile Number:
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("0123456789");
	
	//Home Phone:
	
	driver.findElement(By.xpath("//input[@id='home_phone']")).sendKeys("7890123456");
	
	//Fax:
	//driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("");
	
	//Email:
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ab19c@gmail.com");
	
	//Email alt:
	driver.findElement(By.xpath("//input[@id='email_alt']")).sendKeys("abc19cde@gmail.com");
	
	//Receive Email:
	
	boolean recieve_email=driver.findElement(By.xpath("(//input[@name='receive_email'])[1]")).isSelected();
    if(recieve_email==true) 
    {
    	driver.findElement(By.xpath("(//input[@name='receive_email'])[1]")).click();
			
	}
	
	//Receive SMS:
	
	boolean recieve_sms=driver.findElement(By.xpath("(//input[@name='receive_sms'])[1]")).isSelected();	
	if(recieve_sms==true) 
    {
		driver.findElement(By.xpath("(//input[@name='receive_sms'])[2]")).click();
	}
	//Allow calls:
	
	boolean allow_calls=driver.findElement(By.xpath("(//input[@name='allows_call'])[1]")).isSelected();
	if(allow_calls==true) 
    {
		driver.findElement(By.xpath("(//input[@name='allows_call'])[1]")).click();
	}
	
	//Messenger ID:
	
	driver.findElement(By.xpath("//input[@name='im_id']")).sendKeys("123459");
	
	//Messsenger Network:
	
	WebElement mesg_net=driver.findElement(By.xpath("//select[@name='im_netowrk']"));
	
	Select sel3= new Select(mesg_net);
	sel3.selectByVisibleText("Google Talk");
	
	//Skype ID:
	driver.findElement(By.xpath("//input[@id='skype_id']")).sendKeys("123954");
	
	
	//Source:
	
	WebElement src=driver.findElement(By.xpath("//select[@name='source']"));
	Select sel4 =new Select(src);
	sel4.selectByVisibleText("Internet");
	
	
	//Birthday:
	driver.findElement(By.xpath("//img[@id='f_trigger_c_birthday']")).click();
	//driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("10-Jul-2006");
	
	//Identifier:
	
	driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("ab19c@gmail.com");
	
	//Address Title:
	driver.findElement(By.xpath("//input[@name='address_title']")).sendKeys("PLOT NO:39,BHAGWAN NAGAR PUNE");
	
	//Type:
	WebElement type=driver.findElement(By.xpath("//select[@onchange='setAddress(this);']"));
	Select sel5=new Select(type);
	sel5.selectByVisibleText("Billing Address");
	
	//Default Address:
	driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("PLOT "   +  " NO:39,BHAGWAN"  +  "NAGAR" +   " PUNE");
	
	//City:
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("PUNE");
	
	//State/Province:
	
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("MAHARASHTRA");
	
	//Zip/Postal Code:
	driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("411001");
	
	//Country:
	driver.findElement(By.xpath("//input[@name='country']")).sendKeys("INDIA");
	
	//Tag:
	driver.findElement(By.xpath("//input[@name='country']")).sendKeys("NULL;NULL");
	
	//Note/Descriptions:
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("WELCOME TO CONTACT LIST");
	
	//Contact Time Zone:
	WebElement time_zone=driver.findElement(By.xpath("//select[@id='timezone']"));
	Select sel6=new Select(time_zone);
	sel6.selectByVisibleText("America/Panama - Eastern Standard Time");
	
	//Country:
	WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
	Select sel7=new Select(country);
	sel7.selectByVisibleText("American Samoa");
	
	
	}


	
}


