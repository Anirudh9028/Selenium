package javaScriptExecuter;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptdemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		/*Syntax*/
		//JavascriptExecutor js = (JavascriptExecutor)driver; // Bz we import --selenium.WebDriver
		//js.executeScript(Script, args);
		
		
		/*flash*/
		
		WebElement logo = driver.findElement(By.xpath("//html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		javaScriptUtil.flash(logo, driver);
		
			
		/*Highlight the WebElement
		 *Drawing border & take ScreenShot
		 *cl a class and its method name */ 
		
		//WebElement logo = driver.findElement(By.xpath("//html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		//javaScriptUtil.drawBorder(logo, driver);
		
		/*Screenshot method*/
		
		/*TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\Anirudh\\Desktop\\file Handling.png");
		FileUtils.copyFile(src,trg);//import org.apache.commons.io.FileUtils needed and u dont hv
		*/
	
		
		/*getting title of page*/
		
		//String title = javaScriptUtil.getTitleByJs(driver);
		//System.out.println(title);
		
	
		
		/*click action
		 Some times Selenium click may not work properlly that time we can use this method*/
		
		//WebElement click = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		//javaScriptUtil.clickElementByJs(click, driver);
		
		
		/*generate alert
		 generate Alert Window With Msg what ever you give them  */
		
		//javaScriptUtil.generateAlert(driver, "this me andi") ;
		
		
		/*Refreshing the page*/
		
		//javaScriptUtil.refreshBrowserByJs(driver);
		
		/*Scrolling down page*/
		//javaScriptUtil.scrollPageDown(driver);
		//Thread.sleep(4000);
		
		/*Scroll up page*/
		//javaScriptUtil.scrollPageUp(driver);
		
		
		/*Zoom page*/
		//javaScriptUtil.zoomPageByJs(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
