package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		Actions act = new Actions(driver);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id=\"field1\"]")) ;
		inputbox.clear();
		inputbox.sendKeys("Hi maddy");
		
		
		WebElement copyButton = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(copyButton).perform();
		
		driver.quit();
		
				

	}

}
