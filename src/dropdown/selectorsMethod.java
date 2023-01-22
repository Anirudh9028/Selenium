package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectorsMethod {

	public static void main(String[] args) 
	{
		
		/* ....THIS TWO METHOD HANDLE ONLY ONE DROP DOWN LIST......*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/"); // Search url
		
		WebElement drp = driver.findElement(By.xpath("//select[@id='searchDropdownBox']")); // Find drop down element
		//drp.click(); // While using Select class no need
		
		/* import Select class And initiate constructor (provided element path)
		 * This is Applicable where in HTML code Written in selected method
		 *this for only one element */
		
		Select drpdwn = new Select(drp); 
	

		// Using Select Class Method....>.selectByVisibleText(" ");
		//drpdwn.selectByVisibleText("Amazon Pharmacy"); // Select Amazon Pharmacy from list
		
		// Using ...>.selectByValue("")
		//drpdwn.selectByValue("search-alias=appliances"); // Using Value attribute ...>Select Appliances from the list
		
		// Using....>selectByIndex("")
		//drpdwn.selectByIndex(3); // it will count from 0 in HTML code... Select Amazon Fashion from the list

		/*Method 2
		 * this for multielement
		 * Selecting DropDownList option  using select Class Methods + loop
		 * get the All option list from HTML code
		 * And save Into ArrayList, And apply loop using Equal() method
		 * */
		
		List<WebElement> alloption = drpdwn.getOptions();// convert in to array list
		
		for(WebElement opt :alloption) 
		{
			if(opt.getText().equals("Amazon Fashion")) 
			{
				opt.click();
				break;
			}
		}
		
		
		
		
		driver.quit();
	}

}
