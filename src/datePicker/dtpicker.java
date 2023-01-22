package datePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dtpicker 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		/*decleration of requirement date ,year,month*/
		String year = "2022";
		String month = "July";
		String date = "10";
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click(); // date picker input box
			
		while(true) 
		{
			/*first we conform month and year*/
			
			String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String [] arr= monthYear.split(" ");
			String mnt = arr[0];
			String yr = arr[1];
			
			if(mnt.equalsIgnoreCase(month)&& yr.equalsIgnoreCase(year)) 
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//button[text() = '>']")).click();
			}			
		}
		
		/*To select date */
		
		List <WebElement> alldt = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr//td"));
		
		for(WebElement el:alldt) 
		{
			String dt = el.getText();
			
			if(dt.equalsIgnoreCase(date)) 
			{
				el.click();
				break;
			}
		}
		

		//
		
		
		//driver.quit();

	}

}
