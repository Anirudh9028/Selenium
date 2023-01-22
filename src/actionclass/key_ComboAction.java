package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key_ComboAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		
		Actions act = new Actions(driver); 
		
		
		
		WebElement input1 = driver.findElement(By.xpath("//*[@id=\"inputText1\"]")); //input element 1
		WebElement input2 = driver.findElement(By.xpath("//*[@id=\"inputText2\"]")); //input element 2
		
		input1.sendKeys("Hiii buddy");
		
		// CTRL + A...>to select all text present in 1 input box
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		// CTEL + C ...>to Copy all text present in 1 input box
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//TAB KEY.....used to switch the input box2
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//CTRL + V....To paste all text input box 2
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		//compare text
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
		{
			System.out.println("Text Copied");
		}
		else
		{
			System.out.println("Text Not Copied");
		}
			
		

	}

}
