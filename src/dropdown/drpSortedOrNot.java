package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpSortedOrNot {
	
	
	/*Check a give List Sorted Or Not */

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement drpList = driver.findElement(By.name("category_id")); // Always Choice, Select Class Attributes
		
		Select drpselct = new Select(drpList); // get Select Class And Click on All button
		
		List<WebElement> list = drpselct.getOptions();     // Select All the options from the List
		
		/*Create Two List One is Original Second One Is Duplicate
		 * For Avoid Damage to the Original list*/
		
		ArrayList orignal = new ArrayList(); 
		ArrayList temp = new ArrayList();
		
		/*Using for Each loop get text From List*/
		
		for(WebElement opt :list ) 
		{
			orignal.add(opt.getText());
			temp.add(opt.getText());
			
		}
		
		/*Print out the List for Under Standing*/
		System.out.println("orignal List: "+orignal);
		System.out.println("temp List: "+temp);
		
		/*Apply .sort method on temp list*/
		
		Collections.sort(temp);
		
		System.out.println("orignal List: "+orignal);
		System.out.println("After Sorting temp List: "+temp);
		
		/*And Compare with original list*/
		
		if(orignal.equals(temp)) 
		{
			System.out.println("Drop Down List are Sorted");
		}
		else 
		{
			System.out.println("Drop Down List are not Sorted");
		}
		
		driver.quit();

	}

}
