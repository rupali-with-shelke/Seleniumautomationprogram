package selenium_auto;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {

	public static void main(String[] args) {
		
		
    System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.nopcommerce.com/en/demo");
	
	driver.manage().window().maximize();
	
	//1.How to capture cookies from browser:
	
	Set<Cookie> cookies=driver.manage().getCookies();
	
	System.out.println("Size of Cookies   :"+  cookies.size());//1
	
	//2.How to print cookies from browser?
	
	for(Cookie cookie:cookies)
	{
		System.out.println(cookie.getName()+"  :  "+cookie.getValue());//cf_chl_2  :  cb60c26184859a9
		
	}
	//3.How to add cookie to the browser?
	
	Cookie cookieeobj = new Cookie("MyCookie123","123456");
	driver.manage().addCookie(cookieeobj);
    cookies=driver.manage().getCookies();
	
	System.out.println("Size of Cookies  after adding :"+  cookies.size());//initalliy the cookies size here 1 after adding cookies it should be 2
	
	
	//4.How to delete sepcific cookie from the browser?
	
	/*driver.manage().deleteCookie(cookieeobj);
	
    cookies=driver.manage().getCookies();
	
	System.out.println("Size of Cookies  after deletion :"+  cookies.size());//1
	
	driver.close();*/
	
	//5.delete cookie by named
	
	driver.manage().deleteCookieNamed("MyCookie123");
	
	cookies=driver.manage().getCookies();
		
    System.out.println("Size of Cookies  after deletion :"+  cookies.size());//1
		
	//all cookies delete:
	
	driver.manage().deleteAllCookies();
	
	cookies=driver.manage().getCookies();
	
    System.out.println("Size of Cookies  after deletion :"+  cookies.size());//0
	
    driver.close();
	}

}
