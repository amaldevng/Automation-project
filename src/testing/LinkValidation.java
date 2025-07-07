package testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkValidation
{
	FirefoxDriver driver;
	String baseurl="https://www.google.co.in/";
	@Before
	public void set()
	{
		driver=new FirefoxDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() throws IOException
	{
		URL ob =new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection) ob.openConnection();
		
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid link");
		}
		else
		{
			System.out.println("invalid link");
		}
		
	}

}
