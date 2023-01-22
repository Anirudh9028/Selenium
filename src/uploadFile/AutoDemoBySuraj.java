package uploadFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoDemoBySuraj 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();

		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		// find choose file button and do click action 
        
        WebElement button = driver.findElement(By.xpath("//input[@id ='file-upload']"));
        
		//button.click();
		
		/*Some time click action not perform that time javascript executer or Actions class method used*/
		
		/* Method 1 Java script Executor */
        
        //js.executeScript("arguments[0].click();", button);
		
		/*Method 2 using Actions Class*/
        
        Actions act = new Actions(driver);
        act.moveToElement(button).click().perform();
        
        /*To use deskto application
         Runtime.getRuntime().exec("exe file path "+" "+"upload file path");*/
        
        try 
        {
			Runtime.getRuntime().exec("C://Users//Anirudh//Desktop//file Handling//uploadfile.exe");
		}
        catch (IOException e) 
        {
			
			e.printStackTrace();
		}
        		
	}		
}