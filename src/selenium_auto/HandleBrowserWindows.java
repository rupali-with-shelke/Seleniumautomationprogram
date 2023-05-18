package selenium_auto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
  WebDriver driver = new ChromeDriver();
			
  driver.get("https://opensource-demo.orangehrmlive.com/");
  
  Thread.sleep(5000);
  
  driver.manage().window().maximize();
  
  // 1.getWindowHandle()===>Returns the ids of the single ids windows
  
   /*String windowId =driver.getWindowHandle();//returns id of the single browser windows
   System.out.println(windowId);*///Every time window ids change dynamically at the run time
  
  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();//open another browser windows==called as child windows
  
  //2.getWindowHandles()
   
  Set<String> windowids=driver.getWindowHandles();//ids of multiple browser windows
  
  //First method-iterator()
  
 /*Iterator<String> it=windowids.iterator();
  
  String parentwindowids=it.next();
  
  String childwindowids=it.next();
  
  System.out.println("Parent Window ID  :"+parentwindowids);
  System.out.println("Child Window ID  :"+childwindowids);*/
  
  //second method -using list/arraylist
  
  List<String> windowidslist= new ArrayList(windowids);//convret set into list(only pass the variable into array list it will be convert)
  
   /*String parentwindowids = windowidslist.get(0);// parent window id 
   String childwindowids = windowidslist.get(1);//child window id
  
   System.out.println("Parent Window ID  :"+parentwindowids);
   System.out.println("Child Window ID  :"+childwindowids);*/
   
   //How to use windows id for switching purpose
   
  /* driver.switchTo().window(parentwindowids);//switch to the parent windows
   
   System.out.println("Parent window title   :" +driver.getTitle());//OrangeHRM
   
   Thread.sleep(5000);
   
   driver.switchTo().window(childwindowids);//switch to the parent windows
   
   System.out.println("Child window title   :" +driver.getTitle());*///OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM
   
    //suppose i get everything in one short (i wany to get windowid of multiple browser window and immediately i switch individual browser windows then i want to capture the tiltle)
   //How to switch betn multiple browser windows?==>for each loop we can do everything in one short
   
   //for each loop
  
   /*for(String winid :windowidslist) {
	   
	  // System.out.println(winid);
	   
	   String title=driver.switchTo().window(winid).getTitle();
	   System.out.println(title);
   }*/
   
   //driver.close();//close single browser windows which pointing to the driver(current browser windows)
   
   //driver.quit();//close all the browser window closed
   
   //how to close specific browser  windows by choice

   for(String winid :windowidslist) {
	   
		  // System.out.println(winid);
		   
		   String title=driver.switchTo().window(winid).getTitle();
		   if(title.equals("OrangeHRM")) 
		   {
			   
			   driver.close();
			   
		   }
		   //if(title.equals("OrangeHRM")||title.equals("another title"))//two or more browser window close at that time used this method
		 /*  {
			   driver.close();
		   }*/
	   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
