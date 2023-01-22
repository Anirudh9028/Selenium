package authentictionpopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class notification {

	public static void main(String[] args) 
	{
		/*notification block window
		 * for that we need import related browser class option
		 * here chrome will be there*/
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		
		driver.get("https://www.redbus.in/");
		
		
		driver.quit();
		
	}

}
