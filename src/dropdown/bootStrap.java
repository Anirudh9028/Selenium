package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bootStrap {
	
	/*Those Drop down Lists Does not Contend Select class(HTML) they are knows as boot strap*/
	
	

	public static void main(String[] args) throws InterruptedException
	{
		/*Used For Disable the notifitions*/
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications"); 
        
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();

		/*Product Type input box*/
     	driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]")).click();
  
		List <WebElement> product =  driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println(product.size());
		
		
		for(WebElement ptype:product) 
		{
			if(ptype.getText().equals("Accounts"))
			{
				ptype.click();
				break;
			}
		}
		
		/*Select product input box*/
		
		
		
		
		
		
		driver.quit();

	}

}
