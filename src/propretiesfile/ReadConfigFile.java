package propretiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile 
{
	Properties pro;
	String path = "E:\\Java\\eclips pro file\\YTSelenium\\src\\propretiesfile\\config.text";

	/*Constructor*/
	public ReadConfigFile() 
	{
		pro = new Properties();
		try 
		{
			/*read the file*/
			FileInputStream fis= new FileInputStream(path);
			try 
			{
				/*load the file*/
				pro.load(fis);
			} 
			catch (IOException e) {e.printStackTrace();}
		} 
		catch (FileNotFoundException e) {e.printStackTrace();}
	}
	
	/*for url*/
	public String getURL() //void
	{
		/*here use key to get value*/
		String url = pro.getProperty("url");// get KEY value from file
		if(url!=null) {return url;}// check whether its not null
		else
		{throw new RuntimeException("url not specified in config file");} //if null then throw run time exception
	}
	
	/*for user name*/
	public String getUserName() 
	{
		String username = pro.getProperty("username");// get KEY value from file
		if(username!=null) {return username;}// check whether its not null
		else
		{throw new RuntimeException("username not specified in config file");} //if null then throw run time exception
	}
	
	/*for password*/
	public String Password() 
	{
		String password = pro.getProperty("password");// get KEY value from file
		if(password!=null) {return password;}// check whether its not null
		else
		{throw new RuntimeException("password not specified in config file");} //if null then throw run time exception
	}
	
}
