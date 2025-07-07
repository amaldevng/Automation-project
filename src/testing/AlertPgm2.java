package testing;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPgm2 
{
	FirefoxDriver driver;
	@Before
	public void set()
	{
		driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@Test
	public void test() throws IOException
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		
		driver.switchTo().alert().accept();
	}

}
