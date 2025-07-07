package testNGpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsKeyboardMouse 
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
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement fullnamefield= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		fullnamefield.sendKeys("abcdefg");
		
		WebElement redifid= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/input[1]"));
		
		Actions act=new Actions(driver);
		act.keyDown(fullnamefield, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fullnamefield, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(redifid, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
		
	}

}
