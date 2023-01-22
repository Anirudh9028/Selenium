package frameAndiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nasted_iframe {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		
		
		/*Using id Atrribute we switch from main page to parent frame(1)*/

		driver.switchTo().frame("frame1");
		
		/*Using id Atrribute we switch from parent frame(1)to child frame*/
		driver.switchTo().frame("frame3");
		
		/*find webelement check box */
		driver.findElement(By.id("a")).click();
		
		/*Switch to parent frame*/
		driver.switchTo().parentFrame();
		
		/*find the input box present in parent frame
		 * And enter some text*/
		driver.findElement(By.tagName("input")).sendKeys("text msg");
		
		
		// Switch to main frame and then switch to frame 2
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		
		// select animal fraom list using select class
		WebElement drpWeb= driver.findElement(By.id("animals"));
		Select drp= new Select (drpWeb);
		
		drp.selectByVisibleText("Avatar");
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
