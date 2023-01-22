package wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentWait2 {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize();
		
		        /* Fluent wait Declaration
		         *  Waiting 30 seconds for an element to be present on the page, 
		         *  checking for its presence once every 5 seconds.*/
		
				Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
						  .withTimeout(Duration.ofSeconds(15))
						  .pollingEvery(Duration.ofSeconds(5))
						  .ignoring(NoSuchElementException.class);
		
		
			
				WebElement foo = fwait.until(new Function<WebDriver, WebElement>() 
				{
					  public WebElement apply(WebDriver driver)
					  {
						  /*here put some wrong address ...And check window close or not (driver.quit();)
						   According to logic it should closed after putting some wrong address...
						   bz we use.... ignoring(NoSuchElementException.class)*/
						  
						  return  driver.findElement(By.name("q"));
					  }
					});
				foo.sendKeys("Selenium",Keys.ENTER);
				
		
		
		driver.quit(); // it should be work at any conditon
		

	}

}
