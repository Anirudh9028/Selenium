package tableHandel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stasticTable
{
	/*1.How many rows in table
	 *2.How many column in table
	 *3.retrieve the specific row/column data
	 *4.retrieve the all data from table*/

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*1.How many rows in table
		 *In HTML code tr Represents table rows 
		 *table xpath + tr */
		
		int rowcount = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Including Headers: "+rowcount);
		
		
		
		/*How many column in table
		 *In HTML code table head mention th tag 
		 *table xpath + th tag*/
		
		int columncount = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Table Columns Count : "+columncount);
		
		/*retrieve the specific row/column data
		 *for that first choose..> whole table path + Specific table rows +Specific table column  */
		
		String Specificdata = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[2]")).getText();
		System.out.println("Specificdata : "+Specificdata);
		
		
		/*4.retrieve the all data from table*/
		
		//String alldata = driver.findElement(By.xpath("//table[@name='BookTable']//td")).getText();
		//System.out.println("Specificdata :\n "+alldata);
		
		/*Using for loop
		 *Outer for loop representing rows
		 *inner for loop representing columns */
		
		/*System.out.println("Data from table");
		
		for(int r=2;r<=rowcount;r++) // avoid header so start with r=2
		{
			for(int c=1;c<=columncount;c++) 
			{
				String Alldata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(Alldata+" ");
			}
			System.out.println();
		}*/
		
		System.out.println("all info of learn java book *************************************");
		
		/*Printout all info of learn java book*/
		for(int r=2;r<=rowcount;r++)
		{
			String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
			if(bookName.equals("Learn Java")) 
			{
				String Author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
				String Subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[3]")).getText();
				String 	Price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
				
				System.out.println(Author+"  "+Subject+"  "+Price);
			}
			
		}
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
