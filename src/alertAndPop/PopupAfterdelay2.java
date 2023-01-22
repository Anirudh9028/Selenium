package alertAndPop;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupAfterdelay2 
{
	/*Here popup msg Window Show After 5 second
	 *To handle this we need to use Explicit Wait */

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		
		// identify and click submit
	      WebElement t = driver.findElement(By.id("timerAlertButton"));
	      t.click();
	      
	      
	      
	      /* Explicit wait condition for alert after 5 sec
	       * alertIsPresent() condition applied
	       * alertIsPresent()= We can check if an alert exists with Selenium webdriver*/
	      
	      WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	      
	      
	      if(w.until(ExpectedConditions.alertIsPresent())==null)
	      {
	    	  System.out.println("Alert not exists");
	      }
	      
	      else
	      {
	    	  System.out.println("Alert exists");
	 	     driver.switchTo().alert().accept();
	 	    driver.quit();

	      }	
		
		

	}

}
