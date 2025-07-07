package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoppgm 
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
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("123@abcD");
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("abcdefgh");  //using contains
	}
	
}
