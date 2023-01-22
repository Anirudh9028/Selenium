package checkBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleCheckBox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		
		
		/*Select for Specific Check Box*/
		//driver.findElement(By.xpath("//input[@id=\"monday\"]")).click();
		
		
		/*Select All CheckBoxes*/
		
		List <WebElement>CheckBox = driver.findElements(By.xpath("//input[@type=\"checkbox\"and contains(@id,'day')]"));
		System.out.println("Total no of check box: "+CheckBox.size());
		
		/*for(WebElement ckbx:CheckBox)
		{
			ckbx.click();
		}*/
		
		
		/*Select multiple checkbox by choice
		 * ex: monday & sunday*/
		for(WebElement chbx :CheckBox)
		{
			String chkbxname = chbx.getAttribute("id");
			
			if(chkbxname.equalsIgnoreCase("monday")||chkbxname.equalsIgnoreCase("sunday"))
			{
				chbx.click();
			}
		}
		
		
		
		
		
		/*Select last few(ex: 3)checkbox
		 * total no of check box - no of of check boxes you want to select = starting index
		 * 7-3 = 4*/
		
		//int allckbx = CheckBox.size();
		
		/*for(int i =allckbx-3 ;i<allckbx;i++) 
		{
			CheckBox.get(i).click();
		}*/
		
		
		/*for first few select checkbox*/
		
		/*for(int i = 0 ;i<allckbx;i++)
		{
			if(i<2) 
			{
				CheckBox.get(i).click();
			}
		}*/
		
		
		
		// driver.quit();

	}

}
