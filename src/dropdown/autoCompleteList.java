package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoCompleteList
{

	/*auto Complete List means they are not present in html list, API suggest us
	 *For example google map api*/
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text() = 'Live Posting']")).click();
		
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
		searchBox.clear();
		Thread.sleep(3000);
		searchBox.sendKeys("Toronto");
		
		String text;
		do 
		{
			searchBox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			
			
			text = searchBox.getAttribute("value");
			
			if(text.equals("Toronto, OH, USA")) 
			{
				searchBox.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
			
		}while(!text.isEmpty());
	}
	
	

}
