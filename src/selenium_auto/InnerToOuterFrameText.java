package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerToOuterFrameText {

	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");//switch to outer iframe
	
	driver.switchTo().frame(0);//switch to inner frame i pass the index 0 becz it represents as a 1st frame
		
    System.out.println("Text present inside the inner frame  :"+driver.findElement(By.xpath("//h1")).getText());
	
	driver.switchTo().parentFrame();//go to parent frame/outer frame
	
	String text=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
	                 //parent frame capture text
	
	
	//System.out.println("Text present inside the inner frame  :"+driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText());
	  
	//in this way we also write becz xpath is big that why we stored in string text
	  //in above parent capture path
	
	System.out.println("Text present in outer frame   "+text);
	

	}
        //this method used for iframe:frame/form they both refering iframe only
	   //notes:1.driver.switchTo().frame(name of the frame/id of the frame)
	   //2.driver.switchTo().frame(WebElement)
	   //3.driver.switchTo().frame(Index)
	   //4.go back to main FRAME:driver.switchTo.defaultContent();
	   //5.GO BACK TO THE PARENT FRAME:driver.switchTo.parentFrame();	
	
	
	
	
	
	
	
}
