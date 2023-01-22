package alertAndPop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert 
{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement alertButton = driver.findElement(By.id("alertButton")); // find Web Element Element
		alertButton.click();// click action on button
		
		/*Method...1
		 * To Avoid alert pop-up
		 * for that need import Alert pckg
		 * create objects
		 *  then use switch commands That Window And 
		 *  Apply Alert Command Operations
		 *  */
		
		Alert displayAlert = driver.switchTo().alert();
		displayAlert.accept(); // Accept method used to Accept the Window
		
		/*Method...2
		 * promptButton
		 *have an option edit text */

		WebElement promptButton = driver.findElement(By.id("promtButton"));
		promptButton.click();

		Alert promptAlert = driver.switchTo().alert(); // switchTO.alert() will switch current parent window focus to
														// child window
		promptAlert.sendKeys("Welcome to selenium");

		promptAlert.accept(); // Accept button will click on Ok
		promptAlert.dismiss(); // Dismiss button will click on cancel

		
		
		
		driver.quit();
		
		
		

	}

}
