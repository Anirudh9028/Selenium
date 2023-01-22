package screenShot;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShotFullPage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		ChromeDriver driver =  new ChromeDriver();
		
		
		driver.get("https://text-compare.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		/*Full page ScreenShot
		 *While using WebDriver interface we need to casting
		 *Ex:- WebDriver driver = new ChromeDriver();
		 *Casting:- TakesScreenshot ts =driver;
		 *bt when we will use direct any browser driver(chrome, firefox,edge ) there is no need to do type cast
		 *Ex:-ChromeDriver driver =  new ChromeDriver()
		 *Casting:- TakesScreenshot ts =(TakesScreenshot)driver;   */
		
		
		//TakesScreenshot ts =(TakesScreenshot)driver;
		TakesScreenshot ts =driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\Anirudh\\Desktop\\file Handling");
	
		//FileUtils.copyFile(src,trg);//import org.apache.commons.io.FileUtils needed and u dont hv
	
		
		

	}

}
