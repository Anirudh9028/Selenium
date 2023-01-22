package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitForMultipleCond {
	
	/*For multiple condition Approach .... */	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		
		
		By element = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3");// wait apply for this element
		presenceOfElementLocated( driver,element,10).click(); //call method
		
		
		
		
		/*for second tab*/
//		By element2 = By.xpath("path");
//		waitForMultipleElement( driver,element2,10).click();
				
	}

	public static WebElement presenceOfElementLocated(WebDriver driver,By locator,int timeout) 
	{
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
	}
	
	public static WebElement elementToBeClickable(WebDriver driver,By locator,int timeout) 
	{
		/*The expected condition waits for an element to be clickable 
		 i.e. it should be present/displayed/visible on the screen as well as enabled.*/
		
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return driver.findElement(locator);
	}
	
	//The expected condition waits for an element having a certain string pattern.
//wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(“//div[@id= ‘forgotPass'”), “text to be found”));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
