package testing;

import java.io.IOException;
import java.net.http.WebSocket;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertboxHandling 
{

	FirefoxDriver driver;
	@Before
	public void set()
	{
		driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Amal%20dev/OneDrive/Documents/htmlheadscript.html");
	}
	@Test
	public void test() throws IOException
	{
		driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
		
		 Alert a= driver.switchTo().alert();
		String expect="Hello!I am an alert box!!";
		//WebElement act= driver.findElement(By.xpath("//input[@value='Display alert box']"));
		String actual=a.getText();
				//act.getAttribute("value");
		a.accept();
		
		if(actual.equals(expect))
			
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xavi");
	}
}
