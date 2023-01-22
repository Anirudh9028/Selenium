package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class explicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait (driver,Duration.ofSeconds(10));
		Stopwatch watch = null;

		try
		{
			watch =Stopwatch.createStarted();
			driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
			
			/*make it something wrong in xpath and check wait time */
			WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3/99")));
			element.click();
			//
			watch.stop();
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+" Sec...its Wait time where find element");
		} 


		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+" Sec...its Wait time where did not find element");
		}

		driver.quit();
	

	}

}
