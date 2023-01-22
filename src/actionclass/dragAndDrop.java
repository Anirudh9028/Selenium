package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) 
	{
		/*.perform Action is required*/
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement sourceBox = driver.findElement(By.xpath("//div[@id='box4']")); //source element
		
		WebElement targetBox = driver.findElement(By.xpath("//div[@id='dropBox']"));//target element
		
		act.dragAndDrop(sourceBox, targetBox).perform();
		
		
		driver.quit();
		
		
		
		
		
		

	}

}
