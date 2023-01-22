package propretiesfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 
{
	
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrom103\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	ReadConfigFile file = new ReadConfigFile();
	
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.get(file.getURL()); // extract the (file.getURL()) from text file
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(file.getUserName());
	
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(file.Password());
	
	
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	


	}
	
}
