package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jQuery {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();

		
		//selector(driver,"choice 1");
		
		//selector(driver,"choice 1", "choice 2 3","choice 6 2 1","choice 6 2");
		
		//selector(driver,"all");
		
		
		
		
		
	}
	
	
	public static void selector(WebDriver driver,String...value) 
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class = 'comboTreeItemTitle']"));// coommon class for all list
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement items :choiceList) 
			{
				String text = items.getText();
				
				for(String val :value) 
				{
					if(text.equals(val)) 
					{
						items.click();
						break;
					}
					
				}
			}
		}
		
		else 
		{
			try 
			{
				for(WebElement items:choiceList) 
				{
					items.click();
					
				}
			}
			catch(Exception e) 
			{
				
			}
			
		}
		
		
	}
	

}
