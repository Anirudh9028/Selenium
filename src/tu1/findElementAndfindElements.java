package tu1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementAndfindElements 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		/*findElement
		 * If web element are not found the throw exception(NosuchElementException)
		 * it will return only one element(mentioned or come first in DOM) at time....either u fetch multiple elements 
		 * return type is WebElement */
		
		//WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		//searchBox.sendKeys("Shoes");
		
		/*findElements
		 * If web element are not found then it will not throw exception(NosuchElementException) insted of that throws size= 0(Zero)
		 * it will return multiple elements
		 * return type is object of element(list<WebElement>)
		 * use itretive methods*/
		
		List<WebElement> links = driver.findElements(By.xpath("//*[@id='navFooter']//a"));
		System.out.println(links.size());
		
		for(WebElement w : links)
		{
			System.out.println(w.getText());
		}
		
		
		
		
		
		
		
		driver.quit();
	}

}
