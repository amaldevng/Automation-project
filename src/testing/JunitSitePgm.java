package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitSitePgm 
{
	FirefoxDriver driver;
	
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
		
	}
	
	@Test
	public void test()
	{
	
		String title=driver.getTitle();
		System.out.println(title);
		String expected="Google";
		
		
		
		
		if(title.equals(expected))
		{
			System.out.println("test pass");

		}
		else
		{
			System.out.println("test fail");

		}
	}
	
	@After
	public void close()
	{
		driver.close();
	}
}
