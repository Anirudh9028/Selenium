package frameAndiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeusingIndex {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		 /* first Switch To iframe and performe diiffernt oprations 
		  * for that use switchTo.frame And 
		  * Accesses the locater using = By id OR By name, By index, By WebElement */
		
		// Using ...> By index  we Switch to the iframe
		driver.switchTo().frame(0);// html coading frame's count from zero index
		
		
		/* Perform click Action in frame Text or link 
		 * Which is present in iframe of web page */
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		
		driver.quit();

	}

}
