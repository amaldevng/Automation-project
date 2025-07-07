package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingXpath 
{
FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void test()
	{
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/form/div/div[1]/input")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qwerty");
	}
}
