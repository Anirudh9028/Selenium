package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement min_slider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));	
		
		System.out.println("Location of the min_slider"+ min_slider.getLocation());//(59, 250)
		System.out.println("Height & Width Of The Element"+ min_slider.getSize());//(21, 21)
		
		act.dragAndDropBy(min_slider, 100, 0).perform();
		System.out.println("After moving Location of the min_slider"+ min_slider.getLocation());//(59, 250)
		
		
		
		
		
		
		
		

	}

}
