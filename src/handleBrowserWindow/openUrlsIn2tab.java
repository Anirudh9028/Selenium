package handleBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class openUrlsIn2tab {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrom103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		/*it will open new url tab at same window*/
		//driver.switchTo().newWindow(WindowType.TAB);
		
		/*it will open new url in new window*/
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://jqueryui.com/tooltip/");
		
		

	}

}
