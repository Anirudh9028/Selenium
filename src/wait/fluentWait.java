package wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.google.common.base.Stopwatch;

public class fluentWait {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize();
		
		        /* Fluent wait Declaration
		         *  Waiting 10 seconds for an element to be present on the page, 
		         *  checking for its presence once every 5 seconds.*/
		
				Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
						  .withTimeout(Duration.ofSeconds(10))
						  .pollingEvery(Duration.ofSeconds(1))
						  .ignoring(Exception.class);
				
				Stopwatch watch =null;
		
		
				/*Method 1*/
//				Stopwatch watch = null;
//
//				watch =Stopwatch.createStarted();
//				WebElement element = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
//				watch.stop();
//				element.sendKeys("Selenium",Keys.ENTER);
//
//				//watch.stop();
//				System.out.println(watch.elapsed(TimeUnit.SECONDS)+" Sec...its Wait time where find element");
				
				/*Method 2 */
				
				
				
			//	try
			//	{
					//watch = Stopwatch.createStarted();
					
					WebElement foo = fwait.until(new Function<WebDriver, WebElement>() 
					{
						  public WebElement apply(WebDriver driver)
						  {
						    return driver.findElement(By.name("q")); // here put some wrong address ...And check window close happed or not (driver.quit();)
						  }
					});
			//	}
//				catch(Exception e)
//				{
//					watch.stop();
//					System.out.println(e);
//					System.out.println(watch.elapsed(TimeUnit.SECONDS)+" Sec...its Wait time where did not find element");
//				}
				
		
		
		driver.quit();
		

	}

}
