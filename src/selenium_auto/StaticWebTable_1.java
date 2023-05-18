package selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable_1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
												
	driver.get("https://www.selenium.dev/ecosystem/");
											
	driver.manage().window().maximize();	
	
	//1.How find rows in a table:
	
	int rows=driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody[1]/tr")).size();//this particular statement give all the rows
		
	System.out.println("Total number of rows in a table   :"+rows);	//8
		
 
	//2.How find columns in a table:
	
	int columns=driver.findElements(By.xpath("(//table[@class='table'])[1]/thead[1]/tr/th")).size();//this particular statement give all the columns
	
	System.out.println("Total number of columns in a table   :"+columns);//3	
	
	
	//3.Retrieve the specific row/column data:passing row and column no.
	
	//1.String value=driver.findElement(By.xpath("(//table[@class='table'])[1]//tr[3]/td[1]")).getText();//own created path
	String value=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[4]/div[1]/table[1]/tbody[1]/tr[2]//td[1]")).getText();//using cssselectorhub
	System.out.println("The value is   :"+value);
	
	//4.Retrieve all the data from table:all the row and all the column
	
	//for that we write two loop statement:
	//1.===>rows
	//2.===>columns
	//System.out.println("Data from the table..............");
	for(int r=1;r<=rows;r++)//represent the incrementations of rows:iterations:1,2,3,4,5,6,7,8.
	{
		for(int c=1;c<=columns;c++)//represent the icrementations of column:for each iteration inner for loop execute 3 times
		{                           //1,2,3.
			
			//String data=driver.findElement(By.xpath("(//table[@class='table'])[1]//tr[r]/td[c]")).getText();
			                   //pass the rows no and columns no inside the xpath
			              //we cannot pass the variable inside the above xpath like we pass here tr[r] and td[c]
			//1.String data=driver.findElement(By.xpath("(//table[@class='table'])[1]//tr[3]["+r+"]/td[1]["+c+"]")).getText();//xpath not correct
			
			String data=driver.findElement(By.xpath("(//table[@class='table'])[1]//tbody[1]//tr//td")).getText();
			               // this is how we pass value paramaterized in xpath tr["+r+"] and td["+c+"]
			
			//System.out.print(data+"      ");
		}
		System.out.println();
	}	
	
	
	
	
	
	//5.print release date,versionNo of java lang of selenium:
	
	
	
	
	
	
	
	}///////////////////WorKIng/////////////////path problem//

}
