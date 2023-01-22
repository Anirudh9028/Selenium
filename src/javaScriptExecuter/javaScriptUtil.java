package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScriptUtil 

{
	/*create indiviusal class 
	 * make all method as static so better to call it with class name it self*/
	
	public static void drawBorder(WebElement element, WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver); //type casting
		js.executeScript("arguments[0].style.border = '3px solid red'",element);	//3px thickness of border	
	}
	
	public static String getTitleByJs( WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title").toString();//javascript parameter return document.title
		return title;
		
	}
	public static void clickElementByJs(WebElement element, WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	public static void generateAlert(WebDriver driver,String message) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+ message + "')");
	}
	
	public static void refreshBrowserByJs( WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	/*here In arg Zero represent = Starting point 
	 where as.....> document.body.scrollHeight represent =end of page */
	public static void scrollPageDown(WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	/*When we do scroll up the page
	 just put mines (-) before  end of page
	 ie = -document.body.scrollHeight    */
	public static void scrollPageUp(WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
	}
	
	public static void zoomPageByJs(WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.body.style.zoom = '50%'"); // Zoom out by 100% And make 50% page ratio
	}
	
	public static void flash(WebElement element, WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundcolor");
		for(int i =0;i<50;i++) 
		{
			changecolor("#000000",element,driver);
			changecolor(bgcolor,element,driver);
		}
	}
	public static void changecolor(String color,WebElement element,WebDriver driver) 
	{
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundcolor = '"+ color +"'",element);
		
		try 
		{
			Thread.sleep(20);
			
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
