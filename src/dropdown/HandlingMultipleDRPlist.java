`package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleDRPlist {
	
	static WebDriver driver; 

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		
		
		driver.findElement(By.xpath("//input[@id  = 'txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id  = 'txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id  = 'btnLogin']")).click();
		driver.findElement(By.xpath("//a[@id= 'menu_recruitment_viewRecruitmentModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_recruitment_viewCandidates']")).click();
		
		
		/*Method 1 ..... Genrnal And easy way
		 * Using Selector Classes..Methods
		 * */
		
		Select jobtilte = new Select(driver.findElement(By.cssSelector("#candidateSearch_jobTitle")));
		jobtilte.selectByVisibleText("Automation Tester");// u can use by index ,or by value..select methods
		
		Select status = new Select(driver.findElement(By.cssSelector("#candidateSearch_status")));
		status.selectByVisibleText("Shortlisted");
		
		driver.quit();
		
		
		/*Method...> User Define*/
		
//		WebElement jobtilte = driver.findElement(By.cssSelector("#candidateSearch_jobTitle"));
//		((HandlingMultipleDRPlist) jobtilte).DrpSelecter(jobtilte , "Automation Tester");
//		
//		
//		WebElement status = driver.findElement(By.cssSelector("#candidateSearch_status"));
//		((HandlingMultipleDRPlist) status).DrpSelecter(status , "Shortlisted");

	}
	
//	public static void DrpSelecter(WebElement we , String value)
//	{
//		Select drp = new Select(we);
//		
//		List<WebElement> opt = drp.getOptions();
//		
//		for(WebElement alopt:opt) 
//		{
//			if(alopt.getText().equals(value)) 
//			{
//				alopt.click();
//				break;
//			}
//		}
		
		
	}


