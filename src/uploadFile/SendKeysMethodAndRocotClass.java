package uploadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeysMethodAndRocotClass {

	public static void main(String[] args) 
	{
		//SendKeysMethodAndRocotClass.sendMethod();
		try {SendKeysMethodAndRocotClass.RobotClass();} 
		
		catch (AWTException e) {e.printStackTrace();}

	}
	
	public static void sendMethod() 
	{
		/*this method use when uploadFile Choose or Select button ..in there html code written like...< type ='file' >
		 then and then it only work other wise is not */
		
		System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrom103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id = 'uploadFile']")).sendKeys("C:\\Users\\Anirudh\\Desktop\\file Handling\\RenameFile.txt");

		driver.quit();
		
	}
	
	public static void RobotClass() throws AWTException 
	{
		/*it will work with out any condition
		 1.Find the upload file path 
		 2.copy those path in clip-bord using..
		 3.then paste this path in file selected box using.. 
		 4.and press enter*/
		System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrom103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
		WebElement chooseButton = driver.findElement(By.xpath("//input[@id = 'uploadFile']"));
		
		/*Apply Expilicit Wait*/
		
		WebDriverWait wt = new WebDriverWait (driver, Duration.ofSeconds(10));
		
		WebElement ele = wt.until(ExpectedConditions.visibilityOf(chooseButton));
		
		//visibilityOfElementLocated(By.xpath("//input[@id = 'uploadFile']"))C:\Users\Anirudh\Desktop\file Handling\RenameFile.txt
		
		
		
		
		// Create Actions Class to do click Action button
		
		Actions act = new Actions(driver); 
		act.moveToElement(chooseButton).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		// copy file to clip board
		StringSelection ss = new StringSelection ("C:\\Users\\Anirudh\\Desktop\\file Handling\\RenameFile.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		// perform control + v action to paste file in selected box
		
		/*CONTROL + V... key press*/
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		
		/*CONTROL + V... key Release*/
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		/*Enter key press and release*/
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	

		driver.quit();
		
	}
	
	
	

}
