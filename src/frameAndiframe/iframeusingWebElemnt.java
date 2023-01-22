package frameAndiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeusingWebElemnt {

	public static void main(String[] args) 
	{
		/*Here Two scenario We learn 
		 *1. using WebElement we Access the iframe 
		 *2. how Switch to the second iframe, After held on first iframe */
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		 /* first Switch To iframe and performe diiffernt oprations 
		  * for that use switchTo.frame And 
		  * Accesses the locater using = By id OR By name, By index, By WebElement
		  * Using ...> By name + WebElement we Switch to the 1 iframe */
		
		WebElement iframeElement = driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(iframeElement); 
		
		/* Perform click Action in frame Text or link 
		 * Which is present in iframe of web page */
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		/* To Switch to the second iframe, After held on first iframe
		 * we need to comeback on main webpage using (switchTo().defaultContent())
		 * and then access to the  second iframe */
		
		driver.switchTo().defaultContent();// return to the main page
		
		/*switch To Second frame
		 *And click on text or link*/
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Alert")).click();
		
		
		/*FindElement total iframes present in main page*/
		
		driver.switchTo().defaultContent();// return to the main page
		int countIframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println("no of iframe present in main page: "+countIframe);
		
		
		
		
		driver.quit();

	}

}
