package handleBrowserWindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserwindow 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrom103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		/*getwindowHandle() = it will return  single window id 
		 * every time id will change */
		
		/*String windowID =driver.getWindowHandle();
		System.out.println(windowID);*/
		
		/*getWindowHandles() = We can get Multiple WindowId */
		
		// open another window (child Window)
		driver.findElement(By.xpath("//a[text() = 'OrangeHRM, Inc']")).click();
		
		// return ID's of multiple browser windows
		Set <String> mulwindowID =driver.getWindowHandles();
		
		//First method to retrive the id - itretors 
		 
		/*Iterator<String> it = mulwindowID.iterator();
		
		String parentWinId = it.next();
		String childWinId = it.next();
		
		System.out.println("parentWinId: " + parentWinId);
		System.out.println("childWinId: " + childWinId);*/
		
		//Second method to retrive the id
		
		ArrayList<String> mulwindowIDlist = new ArrayList(mulwindowID);// converting set to list
		
		String parentWinId = mulwindowIDlist.get(0);//return parent window id
		String childWinId = mulwindowIDlist.get(1);//return child window id
		
		System.out.println("parentWinId: " + parentWinId);
		System.out.println("childWinId: " + childWinId);
		
		
		/*To perform child window operation 
		 *first we need to switch to child window using window id  */
		
		driver.switchTo().window(parentWinId);
		System.out.println("Parent Window Title:" + driver.getTitle());
		
		driver.switchTo().window(childWinId);
		System.out.println("Child Window Title:" + driver.getTitle());
		
		/*close to perticular window*/
		
		for(String winid:mulwindowIDlist) 
		{
			String title = driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM")) 
			{
				driver.close();
				System.out.println("OrangeHRM window close successfully");
			}
		}
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
