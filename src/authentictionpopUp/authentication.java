package authentictionpopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authentication {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		//driver.manage().window().maximize();
		
		
		/* authenticated popUp means without 
		 * entering username and password wont allow there web page
		 * Syntax:- http://admin:admin@the-internet.herokuapp.com/basic_auth
		 *          http://username:password@URL*/
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
