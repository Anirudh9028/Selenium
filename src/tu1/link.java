package SeleniumJava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class link {

	
	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println(links.get(0).getAttribute("href"));
		System.out.println("total links = "+ links.size());
		
		
		for(WebElement wb : links) {
		String rt = wb.getAttribute("href");
		
		verifyBrokenLink(rt);
			
		}
		
		
		driver.quit();
		
		

	}
	
	public static void verifyBrokenLink (String url)  {
		
		
		try {
				URL urllink = new URL (url);    // ....convert String format into URL format 
				
				HttpURLConnection  con = (HttpURLConnection)urllink.openConnection();
				con.setConnectTimeout(2000);
				con.connect();
				
				if(con.getResponseCode()>=400) {
					
					
					
					System.out.println(url + " = " + con.getResponseMessage());
				}
				else {System.out.println(url + " = " + con.getResponseMessage());}
		 
		}
		catch(Exception e) {
		}
		
		
		
		//http://www.deadlinkcity.com/nosuchpage2.txt
		
		
	}
	
	

}
