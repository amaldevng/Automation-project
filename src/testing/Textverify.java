package testing;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textverify
{
FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		String expected="Create my account";
		WebElement ac=driver.findElement(By.id("Register"));
		String actual=ac.getDomAttribute("value");
		
		if(actual.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
	}

}
