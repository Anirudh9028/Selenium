package actionclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBordAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iobit.com/en/keyboard-test.php");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver); 
		
		act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.SPACE).perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys("a").perform();

	}

}
