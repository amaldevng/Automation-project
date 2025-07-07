package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Junit 
{
	FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String expected="Facebook – log in or sign up";
		if(title.equals(expected))
		{
			System.out.println("test pass");

		}
		else
		{
			System.out.println("test fail");

		}
		
		
		String actual=driver.getPageSource();
		if(actual.contains("Forgotten password?"))
		{
			System.out.println("Forgotten password? is present");
		}
		else
		{
			System.out.println("Forgotten password? is not present");
		}
	}
	
	@After
	public void close()
	{
		driver.close();
	}
}
