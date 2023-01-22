package tu1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBrokenLink {
	
	
	
	/*our task is to check broken avaiable on*/

	public static void main(String[] args) throws MalformedURLException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenLinks = 0;
		
		for(WebElement allLink :links) 
		{
			String url = allLink.getAttribute("href"); // store url as string
			
			/*check wethere url is empty or not*/
			if(url == null || url.isEmpty())
			{
				System.out.println("URL is Empty");
				continue;
			}
			
			URL ulLink = new URL(url); // create new class of url links
			/*getResponseCode() return repose code after sending url
			 * if respose code is below than 400 we can say our url(link)
			 * is valid other wise having some issue*/
			try
			{
				/*HttpURLConnection is class used to connect the url
				 * .openConnection() = open url
				 * .connect() = connect to the url*/
				HttpURLConnection httpconection = (HttpURLConnection) ulLink.openConnection();
				httpconection.connect();
				
				if(httpconection.getResponseCode()>= 400) 
				{
					System.out.println(httpconection.getResponseCode ()+url+" is"+" Broken Link" );
					brokenLinks++;
				}
				else 
				{
					System.out.println(httpconection.getResponseCode ()+url+" is"+" valid Link" );
				}
				
				
				
			} 
			catch (Exception e)
			{
				
				
			}
			
		}
		System.out.println("Total brokenLinks are: "+brokenLinks);
		driver.quit();
		
		
		

	}

}
