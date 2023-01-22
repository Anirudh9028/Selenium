package frameAndiframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 /* first Switch To iframe and performe diiffernt oprations 
		  * for that use switchTo.frame And 
		  * Accesses the locater using = By id OR By name, By index, By WebElement */
		
		// Using ...> By id
		driver.switchTo().frame("moneyiframe");
		
		
		
		/*Print frame Text using get Text method */
		
		String nseindex = driver.findElement(By.id("nseindex")).getText();
		System.out.println(nseindex);
		
		
		
		
		driver.quit();
		
		
		

	}

}
