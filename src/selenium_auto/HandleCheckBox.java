package selenium_auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	private static final List<WebElement> checkboxes = null;
	private static List<WebElement> checkbox;



	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
    WebDriver driver = new ChromeDriver();
			
    driver.get("https://itera-qa.azurewebsites.net/home/automation");
    
    driver.manage().window().maximize();
    
    //1.How to Select specific check box
    
    //driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();//monday check box select
   // driver.findElement(By.xpath("//*[@id=\"tuesday\"]")).click();
   // driver.findElement(By.xpath("//*[@id=\"wednesday\"]")).click();
   // driver.findElement(By.xpath("//*[@id=\"thursday\"]")).click();
   //driver.findElement(By.xpath("//*[@id=\"friday\"]")).click();
   //driver.findElement(By.xpath("//*[@id=\"saturday\"]")).click();
  // driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
    
    
    //2.How to select all the check box()
    
   List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox'and contains(@id,'day')]"));
   //1.using this method
   // System.out.println("Total no of check boxex  :"+checkboxes.size());//output==>count=7
   
   //2.using for loop 
   
  /*for(int i=0;i<=checkboxes.size();i++) {
	   
	  checkboxes.get(i).click();
   }*/
   
   //3.using each loop
   
   /* for(WebElement chbox:checkboxes) {
    	
        chbox.click();
    }*/
   
   
    //3.Select muliple check boxes by choice:My reqiurement here select (mon and sun )day
    
    /* for(WebElement chbox:checkboxes) {
    	
	  String checkboxname = chbox.getAttribute("id");//return value of id like mon,tue,.....etc.
	  if(checkboxname.equals("monday")||checkboxname.equals("sunday")) {
		  
		  chbox.click();
	  }*/
    

	
    
    //4.select last two check box
   //formula:===>total no. of check box -no of check boxes want to select=starting index
	//7-2=5
	
   /* int totalcheckboxes= checkboxes.size();
    for(int i=totalcheckboxes-2;i<totalcheckboxes;i++) {
    	
    	checkboxes.get(i).click();
    	
    }*/
    
    
    //5.select first two/three check box:
   
     int totalcheckboxes=checkboxes.size();
     for(int i=0;i<totalcheckboxes;i++) {//logic for click all check boxes in for loop only then if block write so only two boxex selected (starting boxes)
    	 if(i<2) {
        	 checkboxes.get(i).click(); 
    	 }
    	 
     }
   
   
    
    
    
    
    
    
    
    
	}

}
