package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		
		WebElement deskparent  = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a")); //parent element 1
		WebElement child = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a")); //child element 2
		
		
		act.moveToElement(deskparent).moveToElement(child).click().perform();

	}

}
