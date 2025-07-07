package testNGpgm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasictestNG 
{
	
	@BeforeTest
	public void set()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void urlopen()
	{
		System.out.println("url load");
	}
	@Test(priority=3,invocationCount=3/*,enabled=false*/)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=1,dependsOnMethods= {"test1"})
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void report()
	{
		System.out.println("create report");
	}
	@AfterTest
	public void browserclose()
	{
		System.out.println("browser close");
	}

}
