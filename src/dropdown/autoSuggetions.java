package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggetions {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("java tutorial");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class = 'sbct']//div[@role='option']//div[1]//span")); //important
		
		System.out.println(list.size());
		
		for(WebElement opt:list)
		{
			if(opt.getText().contains("pdf"))
			{
				opt.click();
				break;
			}
		}
		
		//driver.quit();

	}

}
