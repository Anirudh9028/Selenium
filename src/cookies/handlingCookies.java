package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingCookies {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		
		
		/*How to capture cookies from browser*/
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of cookies: "+cookies.size());// count of cookies
		
		/*How To capture cookies from browser*/
		for(Cookie cookie: cookies) 
		{
			// getname = name of the cookie and value of the cookie
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}

		
		/*how to add cookie to browser*/
		Cookie cookieobj = new Cookie("Mycookies","13255ds4");
		driver.manage().addCookie(cookieobj);
		
		 cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after add new cookie: "+cookies.size());
		
		/*delete particular cookie
		 need to pass perticular cookie address (objectname) */
		
		//driver.manage().deleteCookie(cookieobj); // delete using objet of the cookie
		
		driver.manage().deleteCookieNamed("Mycookies"); // delete using cookie name
		
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after delete a cookie: "+cookies.size());
		
		
		/*delete all the cookies for the browser*/
		
		driver.manage().deleteAllCookies();
		
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after delete all cookies: "+cookies.size());
		
		
	}

}
