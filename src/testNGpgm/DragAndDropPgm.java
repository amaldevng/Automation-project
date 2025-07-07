package testNGpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropPgm 

{
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		
		driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test()
	{
		WebElement drag= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		
		
		WebElement drop= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]"));
		
		Actions ac=new Actions (driver);
		ac.dragAndDrop(drag, drop);
		
		ac.perform();
		
		String expected="Dropped!";	                 //text verify
		String actual=drop.getText();
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
