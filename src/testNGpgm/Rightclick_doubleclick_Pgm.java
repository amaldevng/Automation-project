package testNGpgm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclick_doubleclick_Pgm 
{
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement rc= driver.findElement(By.xpath("/html/body/span"));
		
		act.contextClick(rc);
		act.perform();
		
		
		driver.findElement(By.xpath("/html/body/ul/li[1]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		
		WebElement dc= driver.findElement(By.xpath("/html/body/button"));
		act.doubleClick(dc);
		act.perform();
		
		Alert b = driver.switchTo().alert();
		
		b.accept();
		
		
		
	}

}
