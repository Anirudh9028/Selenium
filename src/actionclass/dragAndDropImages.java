package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropImages {

	public static void main(String[] args) 
	{
		/*.perform Action is required*/
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//driver.switchTo().frame(1);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		
		
		WebElement sourceImg1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]")); //source element 1
		WebElement sourceImg2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img")); //source element 2
		
		WebElement targetTrash= driver.findElement(By.xpath("//div[@id='trash']"));//target element
		
		/*moved from source to target*/
		act.dragAndDrop(sourceImg1, targetTrash).perform();
		act.dragAndDrop(sourceImg2, targetTrash).perform();
		
		
		driver.quit();
		
		
		
		
		
		

	}

}
