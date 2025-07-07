package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoPgm 
{
	FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);    //put ,Keys.ENTER inside sendkeys bracket only if click not works 
		//driver.findElement(By.name("btnK")).click();           //incase of id put By.id
	}

}
