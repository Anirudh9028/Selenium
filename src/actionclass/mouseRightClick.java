package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseRightClick {

	public static void main(String[] args) 
	
	{
		/*To perform mouse related option We need to import Action class through org.openqa.selenium.interactions.Actions; pck
		 *And action class methods 
		 *here .contextClick(WebElement)....> method used for rightclick button on mouse
		 *where as .perform () or build.perform() Are work as same bt
		 *bz in perform class build()..>method declared 
		 *.build() >>>method just act or highlight the element
		 *.perform()....> method did action on it  */
		
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[text() = 'right click me']")) ;
		
		Actions act = new Actions(driver);
		
		act.contextClick(button).perform();
			
		

	}

}
