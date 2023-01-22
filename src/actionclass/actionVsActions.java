package actionclass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionVsActions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		
		WebElement feature = driver.findElement(By.xpath("//a[@title='Women']"));
		
		Actions act = new Actions(driver);
		//act.moveToElement(feature).perform();
		
		/*Action is jst interface 
		 *it jst only store action activity...build()
		 *bt not perform it......to perform it we need Actions classes(.perform()) Method */
		
		
//		Action action = act.moveToElement(feature).build();
//		action.perform();
		

		
	}

}
