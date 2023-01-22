package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdownDatePicker 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//input[@id=\"dob\"]")).click();
		
		/*this for Month*/
		Select mnt = new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]")));
		mnt.selectByVisibleText("Nov");
		
		/*this for Year*/
		 Select year = new Select (driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]")));
		year.selectByVisibleText("1992");
		
		//for date 
		List<WebElement> alldate = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td"));
		String date = "11";
		for(WebElement dt:alldate) 
		{
			String aldt = dt.getText();
			
			if(aldt.equals(date)) 
			{
				dt.click();
			}	
			
		}
		
		
		driver.quit();
}
}
