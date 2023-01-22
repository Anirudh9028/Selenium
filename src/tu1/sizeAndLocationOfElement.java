package tu1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeAndLocationOfElement {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id = 'divLogo']//img"));
		
		//Location Method 1 
//		System.out.println("Location (x,y):- "+ logo.getLocation());//  for x and  y location
//		System.out.println("Location (x):- "+ logo.getLocation().getX());// only for x location
//		System.out.println("Location (y):- "+ logo.getLocation().getY()); // only for y location

		
		//Location Method 2
		
		System.out.println("Location (x):- "+ logo.getRect().getX());// only for x location
		System.out.println("Location (y):- "+ logo.getRect().getY()); // only for y location

		
		/*Size - Method 1*/
		System.out.println("Size(Width, Height): "+logo.getSize());
		System.out.println("Size(Width): "+logo.getSize().getWidth());
		System.out.println("Size(Height): "+logo.getSize().getHeight());
		
		
		/*Size Method-2*/
		System.out.println("Size(Width, Height):- "+ logo.getRect().getDimension());
		System.out.println("Size(Width):- "+ logo.getRect().getDimension().getWidth());
		System.out.println("Size( Height):- "+ logo.getRect().getDimension().getHeight());
		
		driver.quit();
	}

}
