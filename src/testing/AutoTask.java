package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoTask 

{
	
FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("abc");
		driver.findElement(By.name("company")).sendKeys("luminar");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ab@123#$^%$7bf4545");
		driver.findElement(By.name("password_confirmation")).sendKeys("ab@123#$^%$7bf4545");	
		
	}
}
